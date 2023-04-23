package com.zero1tech.chat.ui.room.roomdialog

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.core.constant.*
import com.example.core.extinction.setSafeOnClickListener
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import com.zero1tech.chat.R
import com.zero1tech.chat.databinding.ConfirmDialogBinding
import com.zero1tech.chat.ui.room.RoomViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ConfirmDialog : AppCompatDialogFragment() {
    @Inject
    lateinit var prefs: Prefs
    private lateinit var binding: ConfirmDialogBinding

    private val args: ConfirmDialogArgs by navArgs()
    private val roomViewModel: RoomViewModel by viewModels()
    private var currentUser: UserRemote = UserRemote()
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        binding = ConfirmDialogBinding.inflate(requireActivity().layoutInflater, null, false)
        val builder = AlertDialog.Builder(activity)
        builder.setView(binding.root)


        handleTextView()
        onClickYes()
        onClickNo()

        return builder.create()
    }


    private fun handleTextView() {
        when (args.action) {
            KEY_ACTION_JOIN -> {
                binding.tvYouSure.text = getString(R.string.sure_join)
            }
            KEY_ACTION_LEAVE -> {
                binding.tvYouSure.text = getString(R.string.sure_leave)
            }
            KEY_ACTION_DELETE -> {
                binding.tvYouSure.text = getString(R.string.sure_delete)
            }
        }
    }

    private fun onClickNo() {
        binding.btnNo.setSafeOnClickListener {
            dismiss()
        }
    }

    private fun onClickYes() {
        binding.btnYes.setSafeOnClickListener {
            when (args.action) {
                KEY_ACTION_JOIN -> {
                    goToRoomChatFragment()
                    dismiss()
                }
                KEY_ACTION_LEAVE -> {
                    goToRoomFragment()
                    dismiss()
                }
                KEY_ACTION_DELETE -> {
                    goToRoomFragmentAndDeleteRoom()
                    dismiss()
                }

            }
        }
    }

    private fun goToRoomFragmentAndDeleteRoom() {
        roomViewModel.deleteRoom(args.roomName, args.numberUsersInRoom,args.roomType)
        val action = ConfirmDialogDirections.actionConfirmDialogToRoomFragment()
        findNavController().navigate(action)
    }

    private fun goToRoomFragment() {
        roomViewModel.leaveRoom(prefs.idCurrentUser.toString(),
            args.roomName, args.roomType)


        val action = ConfirmDialogDirections.actionConfirmDialogToRoomFragment()
        findNavController().navigate(action)

    }

    private fun goToRoomChatFragment() {
        roomViewModel.giveAccess(prefs.idCurrentUser.toString(),
            args.room?.name.toString(), args.room?.roomType.toString())

        findNavController().navigate(R.id.roomChatFragment, bundleOf(
            KEY_ROOM_NAME to args.room?.name,
            "isJoined" to true,
            KEY_ICON to args.room?.icon, KEY_ROOM_TYPE to args.roomType
        )
        )

    }


}



