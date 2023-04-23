package com.zero1tech.chat.ui.chat.gpt.images

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.AbsListView
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.example.core.constant.*
import com.example.core.extinction.createdDateFormatted
import com.example.core.extinction.setSafeOnClickListener
import com.example.core.extinction.sortID
import com.example.data.model.Message
import com.example.data.model.UserRemote
import com.example.data.model.gpt.image.ImagesGenerationsResponse
import com.example.data.prefs.Prefs
import com.vanniktech.emoji.EmojiPopup
import com.zero1tech.chat.AnalyticsDispatcher
import com.zero1tech.chat.R
import com.zero1tech.chat.ScreenName
import com.zero1tech.chat.common.setImageURI
import com.zero1tech.chat.databinding.FragmentChatBinding
import com.zero1tech.chat.ui.chat.gpt.images.adapter.ImagesBotAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@ScreenName("chatFriends")
@AndroidEntryPoint
class ImagesBotFragment : Fragment() {

    private lateinit var binding: FragmentChatBinding
    private val imagesViewModel: ImagesBotViewModel by viewModels()
    private lateinit var currentUser: UserRemote
    private lateinit var args: ImagesBotFragmentArgs
    private var receiverUser: UserRemote = UserRemote()
    private lateinit var chatAdapter: ImagesBotAdapter
    private var receiverID: String = ""
    private var isFriend: Boolean = false

    private var messages = ArrayList<Message>()
    private var sizeLastData = -1
    private var isPagination = false
    private var firstOne = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentChatBinding.inflate(layoutInflater)
        return binding.root
    }

    @Inject
    lateinit var analyticsDispatcher: AnalyticsDispatcher

    @Inject
    lateinit var prefs: Prefs

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        listener()
    }

    private fun initializeEmojiPopup() {
        val popup = EmojiPopup.Builder.fromRootView(
            binding.rootView
        ).build(binding.etChatContent)

        binding.ivEmoji.setSafeOnClickListener {
            popup.toggle()
        }
    }


    private fun handleReadMessage(list: List<Message>?) {
        if (list != null) {
            if (isPagination) {
                binding.progress.isVisible = false
                sortData(list)
                chatAdapter = ImagesBotAdapter(prefs.idCurrentUser.toString(), ::rowClickListener)
                chatAdapter.submitList(messages)
                binding.rvChat.adapter = chatAdapter
                binding.rvChat.scrollToPosition(0)
            } else {
                if (firstOne) {
                    messages.addAll(list)
                    chatAdapter =
                        ImagesBotAdapter(prefs.idCurrentUser.toString(), ::rowClickListener)
                    chatAdapter.submitList(messages)

                    binding.rvChat.adapter = chatAdapter
                    firstOne = false
                    binding.rvChat.scrollToPosition(messages.size - 1)
                } else {
                    messages.add(list.last())
                    binding.rvChat.scrollToPosition(messages.size - 1)

                }
            }

        }
    }

    private fun rowClickListener(image: String) {
        binding.showImagePreview = true
        binding.imageView.setImageURI(image)
    }

    private fun handleImagesGenerationsSuccess(response: ImagesGenerationsResponse?) {
        if (response == null) return
        val message = Message(
            senderid = BOT_IMAGES_ID,
            message = response.images[0].url,
            receiverid = prefs.idCurrentUser,
            messages = response.images,
        )

        imagesViewModel.saveButMessage(message = message)
    }

    private fun sortData(list: List<Message>) {
        val allMessage = ArrayList<Message>()
        allMessage.addAll(list)
        allMessage.addAll(messages)
        messages.clear()
        messages.addAll(allMessage)

        isPagination = false
    }


    private fun setImageProfileAndNameForUser() {
        val ivUser = requireActivity().findViewById<ImageView>(R.id.iv_profile_chat)
        val tvUser = requireActivity().findViewById<TextView>(R.id.tv_full_name)
        ivUser.visibility = View.VISIBLE
        tvUser.visibility = View.VISIBLE
        tvUser.text = getString(R.string.chat_images)
        ivUser.setImageResource(R.drawable.ic_chatbot)
    }


    private fun listener() {
        onClickFabSend()
        onScrollListenerRecyclerView()

        binding.btnReadMore.setSafeOnClickListener {
            if (checkHaveNewData()) {
                imagesViewModel.readMessage(
                    sortID(
                        BOT_IMAGES_ID, prefs.idCurrentUser.toString()
                    ), messages[0].key.toString()
                )
                sizeLastData = binding.rvChat.adapter?.itemCount ?: 0
                binding.progress.isVisible = true
                isPagination = true
            } else {
                binding.btnReadMore.text = getString(R.string.all_messaga)
                binding.btnReadMore.isCheckable = false
            }
        }
    }

    private fun checkHaveNewData(): Boolean {
        return sizeLastData != messages.size
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
                    AbsListView.OnScrollListener.SCROLL_STATE_FLING -> {}
                    AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL -> {}
                    else -> {
                        scrollingUp()
                    }
                }
            }

            private fun scrollingDown() {
                binding.btnReadMore.isVisible = false
                isScrollingUp = false
            }

            private fun scrollingUp() {
                if (isScrollingUp && messages.size >= SIZE_PAGINATION_CHAT) binding.btnReadMore.isVisible =
                    true
            }
        })
    }


    private fun onClickFabSend() {
        binding.fabSend.setSafeOnClickListener {
            sendMessage()

            val textMessage = binding.etChatContent.text.toString()

            when (args.flag) {
                REQUEST_FRAGMENT -> {
                    deleteFromRequestAndAddToFriends(receiverUser, textMessage)
                }
                PEOPLE_FRAGMENT -> {
                    if (!isFriend) imagesViewModel.processRequest(
                        receiverUser,
                        currentUser,
                        textMessage
                    )
                }
                FRIENDS_FRAGMENT -> {
                    imagesViewModel.sendLastMessageAndTimestamp(receiverID, textMessage)
                }
            }
            binding.etChatContent.text?.clear()
        }
    }

    private fun deleteFromRequestAndAddToFriends(reseiverUser: UserRemote, message: String) {
        imagesViewModel.deleteFromRequestAndAddToFriends(reseiverUser, message)
    }

    private fun sendMessage() {
        val textMessage = binding.etChatContent.text.toString()
        if (textMessage.isNotEmpty()) {
            val message = Message(
                prefs.idCurrentUser.toString(),
                BOT_IMAGES_ID,
                binding.etChatContent.text.toString(),
                createdDateFormatted((TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).toString())
            )

            imagesViewModel.sendMessage(message, currentUser.profile, receiverUser.token)
        }
    }

    private fun init() {
        initializeEmojiPopup()
        initData()
        getReceiverUser()
        initObserve()
        initListener()
    }

    private fun initListener() {
        binding.imageViewClose.setOnClickListener {
            binding.showImagePreview = false
        }
    }

    private fun getReceiverUser() {
        imagesViewModel.getReceiverUser(receiverID)
    }

    private fun initData() {
        args = arguments?.let { ImagesBotFragmentArgs.fromBundle(it) }!!
        receiverID = if (args.user == null) {
            arguments?.getString(FRIENDID).toString()

        } else {
            args.user!!.uid
        }
        currentUser = prefs.currentUser

    }

    private fun initObserve() {
        imagesViewModel.loadingLiveData.observe(viewLifecycleOwner, ::handleProgress)
        imagesViewModel.errorLiveData.observe(viewLifecycleOwner, ::handleError)
        imagesViewModel.successReceiverUserLiveData.observe(
            viewLifecycleOwner, ::handleReceiverUser
        )

        imagesViewModel.successReadMessageLiveData.observe(viewLifecycleOwner, ::handleReadMessage)
        lifecycleScope.launch {
            imagesViewModel.successImagesGenerationsLiveData.collect(::handleImagesGenerationsSuccess)
        }
    }

    private fun handleError(throwable: Throwable) {
        Log.d(TAG, "$throwable.localizedMessage")
    }

    private fun handleProgress(show: Boolean) {
        binding.linearProgressBar.isVisible = show
    }

    private fun handleReceiverUser(user: UserRemote) {
        receiverUser = user

        imagesViewModel.readMessage(
            sortID(BOT_IMAGES_ID, prefs.idCurrentUser.toString()), BASE_PAGE
        )
        imagesViewModel.successReadMessageLiveData.observe(viewLifecycleOwner, ::handleReadMessage)

        setImageProfileAndNameForUser()
        checkAlreadyFriends()
    }

    private fun checkAlreadyFriends() {
        imagesViewModel.checkAlreadyFriends(BOT_IMAGES_ID)
        imagesViewModel.successCheckAlreadyFriendsLiveData.observe(viewLifecycleOwner) {
            isFriend = it
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        hideKeyboard()
        if (isFriend) imagesViewModel.savedLastSee(receiverID)
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

    companion object {
        const val BOT_IMAGES_ID = "2"
        const val TAG = "ImagesBotFragment"
        const val BASE_PAGE = "0"
    }

}
