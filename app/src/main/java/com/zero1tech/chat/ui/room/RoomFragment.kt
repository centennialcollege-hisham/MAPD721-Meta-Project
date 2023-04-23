package com.zero1tech.chat.ui.room

import android.os.Bundle
import android.view.*
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.core.constant.*
import com.example.data.model.RoomModel
import com.example.data.prefs.Prefs
import com.zero1tech.chat.R
import com.zero1tech.chat.databinding.FragmentRoomsBinding
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class RoomFragment : Fragment(), RoomAdapter.OnClickItem {
    private lateinit var binding: FragmentRoomsBinding
    private val viewModel: RoomViewModel by viewModels()
    private lateinit var roomPublicAdapter: RoomAdapter
    private lateinit var roomPrivateAdapter: RoomAdapter

    private var privateRomeNames: List<RoomModel>? = emptyList()
    private var publicRomeNames: List<RoomModel>? = emptyList()

    @Inject
    lateinit var prefs: Prefs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentRoomsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycle.addObserver(viewModel)
        initAdapter()
        initObserver()
        initView()
    }

    private fun initView() {
        setHasOptionsMenu(true)
    }


    private fun openDialogCreateRoom(roomType: String, list: List<String>) {

        val action = RoomFragmentDirections.actionRoomFragmentToCreateRoomDialog2(
            roomType,
            list.toTypedArray()
        )
        findNavController().navigate(action)
    }


    private fun initObserver() {
        viewModel.loadingLiveData.observe(viewLifecycleOwner, ::handleProgress)
        viewModel.errorLiveData.observe(viewLifecycleOwner, ::handleError)
        viewModel.successRoomPublicLiveData.observe(viewLifecycleOwner, ::successRoomPublic)
        viewModel.successRoomPrivateLiveData.observe(viewLifecycleOwner, ::successRoomPrivate)
    }


    private fun successRoomPrivate(list: List<RoomModel>) {
        privateRomeNames = list
        if (list.isNotEmpty())
            initViewWhenPrivateRoomSuccess()

        val roomsWithOrder = list.sortedByDescending {
            val time = it.accessUsers?.get(prefs.idCurrentUser!!)
            val simpleFormat = SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss", Locale.ENGLISH)
            val format: String = try {
                simpleFormat.format(time?.toLong())
            } catch (ex: Exception) {
                val timestamp = System.currentTimeMillis()
                simpleFormat.format(timestamp)
            }
            format
        }
        roomPrivateAdapter.submitList(roomsWithOrder)

    }

    private fun initViewWhenPrivateRoomSuccess() {
        binding.isProgress = false
        binding.isPrivate = true
    }

    private fun handleError(throwable: Throwable?) {//todo

    }

    private fun handleProgress(show: Boolean) {
        binding.progressBar.isVisible = show
    }

    private fun initAdapter() {
        roomPublicAdapter = RoomAdapter(this, prefs.idCurrentUser.toString())
        roomPrivateAdapter = RoomAdapter(this, prefs.idCurrentUser.toString())
        binding.rvRoomPublic.adapter = roomPublicAdapter
        binding.rvRoomPrivate.adapter = roomPrivateAdapter
    }

    private fun successRoomPublic(rooms: List<RoomModel>) {
        publicRomeNames = rooms
        if (rooms.isNotEmpty())
            initViewWhenPublicRoomSuccess()

        val roomsWithOrder = rooms.sortedByDescending {
            val time = it.accessUsers?.get(prefs.idCurrentUser!!)
            val simpleFormat = SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss", Locale.ENGLISH)
            val format = try {
                simpleFormat.format(time?.toLong())
            } catch (ex: Exception) {
                val timestamp = System.currentTimeMillis()
                simpleFormat.format(timestamp)
            }
            format
        }

        roomPublicAdapter.submitList(roomsWithOrder)
    }

    private fun initViewWhenPublicRoomSuccess() {
        binding.isProgress = false
        binding.isPublic = true
    }

    override fun onClickRoom(room: RoomModel, isJoined: Boolean, isSee: Boolean) {
        findNavController().navigate(
            R.id.roomChatFragment, bundleOf(
                KEY_ROOM_NAME to room.name,
                "isJoined" to isJoined,
                KEY_ICON to room.icon,
                KEY_ROOM_TYPE to room.roomType,
                KEY_ROOM_ADMIN to room.roomAdmin,
                "numberUsersInRoom" to room.accessUsers?.size,
                "isSee" to isSee
            )
        )
    }

    override fun onClickJoin(model: RoomModel, isJoined: Boolean) {
        openDialogConfirm(model, isJoined)

    }

    private fun openDialogConfirm(room: RoomModel, isJoined: Boolean) {

        val action = RoomFragmentDirections.actionRoomFragmentToConfirmDialog(
            KEY_ACTION_JOIN,
            room,
            isJoined,
            room.name.toString(), room.roomType
        )
        findNavController().navigate(action)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_room, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.create_room_private -> {
                val list = privateRomeNames?.map {
                    it.name
                }
                openDialogCreateRoom(KEY_ROOM_PRIVATE, list as List<String>)
            }
            R.id.create_room_public -> {
                val list = publicRomeNames?.map {
                    it.name
                }
                openDialogCreateRoom(KEY_ROOM_PUBLIC, list as List<String>)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
