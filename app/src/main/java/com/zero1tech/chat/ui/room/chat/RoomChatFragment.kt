package com.zero1tech.chat.ui.room.chat

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.AbsListView
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.core.constant.*
import com.example.core.extinction.createdDateFormatted
import com.example.core.extinction.setSafeOnClickListener
import com.example.data.model.Message
import com.example.data.prefs.Prefs
import com.vanniktech.emoji.EmojiPopup
import com.zero1tech.chat.R
import com.zero1tech.chat.ScreenName
import com.zero1tech.chat.databinding.FragmentRoomChatBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import android.app.Activity
import android.view.inputmethod.InputMethodManager
import androidx.lifecycle.lifecycleScope
import com.example.data.model.LastMessage
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.util.HashMap


@ScreenName("roomChat")
@AndroidEntryPoint
class RoomChatFragment : Fragment() {
    private lateinit var binding: FragmentRoomChatBinding
    private val viewModel: RoomChatViewModel by viewModels()
    private var isJoined: Boolean = false
    private var isSee: Boolean = false
    private var numberUsersInRoom: Int = -1
    private var tableName: String = ""
    private var icon: String = ""
    private var roomType: String = KEY_ROOM_PRIVATE
    private var messages = ArrayList<Message>()
    private var sizeLastData = -1

    @Inject
    lateinit var prefs: Prefs

    private var isPagination = false
    private var firstOne = true


    private lateinit var messageAdapter: MessagesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override
    fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentRoomChatBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initArgument()
        initTimeStamp()
        initializeEmojiPopup()
        joinVisibility()
        setImageProfileAndNameForUser()
        initAdapter()
        getMessage()
        initObserve()
        initClick()

    }

    private fun initTimeStamp() {
        val timeStamp = System.currentTimeMillis()
        viewModel.setTimeAccess(
            roomType,
            tableName,
            prefs.idCurrentUser!!,
            timeStamp.toString()
        )
    }

    private fun initializeEmojiPopup() {
        val popup = EmojiPopup.Builder.fromRootView(
            binding.rootView
        ).build(binding.etChatContent)

        binding.ivEmoji.setOnClickListener {
            popup.toggle()
        }
    }

    private fun joinVisibility() {
        binding.isJoined = isJoined
    }

    private fun initArgument() {

        tableName = arguments?.getString(KEY_ROOM_NAME).toString()
        icon = arguments?.getString(KEY_ICON).toString()
        numberUsersInRoom = arguments?.getInt("numberUsersInRoom") ?: -1
        isJoined = arguments?.getBoolean("isJoined") == true
        isSee = arguments?.getBoolean("isSee") == true
        roomType = arguments?.getString(KEY_ROOM_TYPE).toString()



    }


    private fun initAdapter() {
        messageAdapter = MessagesAdapter(prefs.idCurrentUser.toString())
        binding.rvChat.adapter = messageAdapter

    }

    private fun getMessage() {
        viewModel.readMessage(tableName, roomType)
    }


    private fun initClick() {
        binding.fabSend.setSafeOnClickListener {
            sendMessage()
        }
        binding.btnJoin.setSafeOnClickListener {
            viewModel.giveAccess(
                prefs.idCurrentUser.toString(),
                tableName, roomType
            )
            binding.btnJoin.isVisible = false
            binding.isJoined = true
        }

        onScrollListenerRecyclerView()

        binding.btnReadMore.setSafeOnClickListener {
            if (checkHaveNewData()) {
                viewModel.readMoreMessage(tableName, roomType, messages[0].key.toString())
                sizeLastData = binding.rvChat.adapter?.itemCount ?: 0
                binding.progress.isVisible = true
                isPagination = true
            } else {
                binding.btnReadMore.text = getString(R.string.all_messaga)
                binding.btnReadMore.isCheckable = false
            }
        }
    }

    private fun onScrollListenerRecyclerView() {
        var isScrollingUp = false
        binding.rvChat.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (dy > 0) {
                    scrollingDown()
                } else {
                    isScrollingUp = true
                }
            }


            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                when (newState) {
                    AbsListView.OnScrollListener.SCROLL_STATE_FLING -> {
                        Log.d("TAG11", "SCROLL_STATE_FLING")
                    }
                    AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL -> {
                        Log.d("TAG11", "SCROLL_STATE_TOUCH_SCROLL")
                    }
                    else -> {
                        scrollingUp()
                        Log.d("TAG11", "SCROLL_STATE_TOUCH_FINISH")
                    }
                }
            }

            private fun scrollingDown() {
                Log.d("TAG11", "Scrolling down")
                binding.btnReadMore.isVisible = false
                isScrollingUp = false
            }

            private fun scrollingUp() {
                if (isScrollingUp && messages.size >= SIZE_PAGINATION_CHAT)
                    binding.btnReadMore.isVisible = true
            }
        })
    }


    private fun checkHaveNewData(): Boolean {
        return sizeLastData != messages.size
    }


    private fun sendMessage() {
        val newMessage = binding.etChatContent.text.toString()
        val message = Message(
            senderid = prefs.idCurrentUser.toString(),
            message = newMessage,
            time = createdDateFormatted(
                (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).toString()
            ),
            senderName = prefs.nameCurrentUser.toString()
        )

        saveLastMessage(newMessage)

        viewModel.sendMessage(tableName, message, roomType)

        binding.etChatContent.text?.clear()

    }

    private fun initObserve() {
        viewModel.loadingLiveData.observe(viewLifecycleOwner, ::handleProgress)
        viewModel.errorLiveData.observe(viewLifecycleOwner, ::handleError)
        viewModel.successMessageLiveData.observe(viewLifecycleOwner, ::successReadMessage)

        successReadMoreMessage()

    }

    private fun successReadMoreMessage() {
        lifecycleScope.launch {
            viewModel.successMoreMessageLiveData.collect { list ->
                binding.progress.isVisible = false
                sortData(list)
                messageAdapter.notifyDataSetChanged()
                binding.rvChat.scrollToPosition(0)
            }
        }
    }

    private fun successReadMessage(list: List<Message>) {
        if (firstOne) {
            messages.addAll(list)
            messageAdapter.submitList(messages)
            firstOne = false
            binding.rvChat.scrollToPosition(messages.size - 1)
        } else {
            messages.add(list.last())
            binding.rvChat.scrollToPosition(messages.size - 1)
        }
    }


    private fun sortData(list: List<Message>) {
        val allMessage = ArrayList<Message>()
        allMessage.addAll(list)
        allMessage.addAll(messages)
        messages.clear()
        messages.addAll(allMessage)

        isPagination = false
    }


    private fun saveLastMessage(message: String) {
        val lastMessage = LastMessage(
            message,
            prefs.idCurrentUser,
            System.currentTimeMillis().toString(),
            addUserSee(prefs.idCurrentUser)
        )
        viewModel.saveLastMessage(
            tableName,
            lastMessage,
            roomType
        )
    }

    private fun addUserSee(idCurrentUser: String?): HashMap<String, String> {
        val hashMap: HashMap<String, String> = HashMap<String, String>() //define empty hashmap
        hashMap[idCurrentUser.toString()] = idCurrentUser.toString()
        return hashMap
    }

    private val <E> List<E>.lastItem: E
        get() {
            return this[lastIndex]
        }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_room_chat, menu)

        val buttonDeleteRoom = menu.findItem(R.id.action_delete_room)
        handleVisibility(buttonDeleteRoom)


        super.onCreateOptionsMenu(menu, inflater)
    }

    private fun handleVisibility(deleteRoom: MenuItem) {

        if (arguments?.getString(KEY_ROOM_ADMIN).toString() != prefs.idCurrentUser) {
            deleteRoom.isVisible = false
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        when (item.itemId) {
            R.id.action_leave -> {
                openDialogConfirm(KEY_ACTION_LEAVE)
            }
            R.id.action_share_room -> {
                shareRoom()
            }
            R.id.action_delete_room -> {
                openDeleteDialog()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun openDeleteDialog() {
        val action =
            RoomChatFragmentDirections.actionRoomChatFragmentToConfirmDialog(
                KEY_ACTION_DELETE,
                roomName = tableName,
                roomType = roomType,
                numberUsersInRoom = numberUsersInRoom
            )

        findNavController().navigate(action)
    }


    private fun handleError(throwable: Throwable?) {

    }

    private fun handleProgress(show: Boolean) {
        binding.progressBar.isVisible = show
    }

    private fun openDialogConfirm(ation: String) {

        val action =
            RoomChatFragmentDirections.actionRoomChatFragmentToConfirmDialog(
                ation,
                roomName = tableName, roomType = roomType
            )
        findNavController().navigate(action)
    }

    private fun shareRoom() {
        val dynamicLink =
            "$DEEP_LINK$KEY_ROOM_NAME=$tableName&$KEY_ROOM_TYPE=$roomType$APN"
        showLinks(dynamicLink)

//
    }

    private fun showLinks(shortLink: String?) {
        try {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name))
            var shareMessage = "\nLet me recommend you this application\n\n"
            shareMessage = shortLink.toString()
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
            startActivity(Intent.createChooser(shareIntent, getString(R.string.choose_one)))
        } catch (e: Exception) {
            //e.toString();
        }

    }

    private fun setImageProfileAndNameForUser() {
        val ivUser = requireActivity().findViewById<ImageView>(R.id.iv_profile_chat)
        val tvUser = requireActivity().findViewById<TextView>(R.id.tv_full_name)
        ivUser.isVisible = true
        tvUser.isVisible = true
        tvUser.text = tableName
        Glide.with(requireActivity()).load(icon).into(ivUser)
    }

    private fun hideKeyboard() {
        val imm: InputMethodManager =
            requireActivity().getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        var view = requireActivity().currentFocus
        if (view == null) {
            view = View(activity)
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    override fun onDestroy() {
        super.onDestroy()
        hideKeyboard()
        if (!isSee)
            viewModel.seeLastMessage(roomType, tableName, prefs.idCurrentUser.toString())
    }


}