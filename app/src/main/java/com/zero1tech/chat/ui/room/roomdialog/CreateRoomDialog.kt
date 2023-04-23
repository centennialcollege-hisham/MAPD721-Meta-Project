package com.zero1tech.chat.ui.room.roomdialog

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.core.constant.KEY_ROOM_PRIVATE
import com.example.core.constant.KEY_ROOM_PUBLIC
import com.example.core.constant.ROOM_PRIVATE_REFERENCE
import com.example.core.constant.ROOM_PUBLIC_REFERENCE
import com.example.core.extinction.setSafeOnClickListener
import com.example.data.prefs.Prefs
import com.zero1tech.chat.R
import com.zero1tech.chat.databinding.CreateRoomDialogBinding
import com.zero1tech.chat.ui.room.RoomViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CreateRoomDialog : AppCompatDialogFragment() {
    @Inject
    lateinit var prefs: Prefs
    private lateinit var binding: CreateRoomDialogBinding
    private var imageUri: Uri? = null
    private var bitmap: Bitmap? = null
    private var pathProfilePhoto: Uri? = null
    private val roomViewModel: RoomViewModel by viewModels()
    private val args: CreateRoomDialogArgs by navArgs()
    private var isMoreLine = false
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        binding = CreateRoomDialogBinding.inflate(requireActivity().layoutInflater, null, false)
        val builder = AlertDialog.Builder(activity)
        builder.setView(binding.root)
        lifecycle.addObserver(roomViewModel)

        initListener()
        return builder.create()
    }

    private fun initListener() {
        onListenerNameTextView()
        onClickImageView()
        onClickSave()
        onClickCancel()
    }

    private fun onListenerNameTextView() {


    }


    private fun onClickCancel() {
        binding.btnCancel.setSafeOnClickListener {
            dismiss()
        }
    }

    private fun onClickImageView() {
        binding.fabEditImage.setSafeOnClickListener {
            goToGallery()
        }

    }

    private fun onClickSave() {
        binding.btnCreate.setSafeOnClickListener {
            when {
                binding.etName.text?.isEmpty() == true -> {
                    alertDialog(R.string.emptyName)
                }
                isMoreLine() -> {
                    alertDialog(R.string.moreLine)
                }
                else -> {
                    createRoom()
                }
            }


        }
    }

    private fun createRoom() {
        when (args.roomType) {
            KEY_ROOM_PRIVATE -> {
                createRoomPrivate()
            }
            KEY_ROOM_PUBLIC -> {
                createRoomPublic()
            }
        }
    }

    private fun alertDialog(text: Int) {
        AlertDialog.Builder(requireContext())
            .setTitle(getString(R.string.alert))
            .setMessage(getString(text))
            .create()
            .show()
    }

    private fun isMoreLine() = binding.etName.lineCount > 1

    private fun createRoomPublic() {
        val name = binding.etName.text.toString()
        val flag = args.roomNames.contains(name)

        if (!flag) {
            roomViewModel.addPublicRoom(
                binding.etName.text.toString(),
                pathProfilePhoto,
                ROOM_PUBLIC_REFERENCE
            )
            dismiss()
        } else {
            binding.tvValidation.isVisible = true
        }
    }

    private fun createRoomPrivate() {

        val name = binding.etName.text.toString()
        val flag = args.roomNames.contains(name)

        if (!flag) {
            roomViewModel.addPublicRoom(
                binding.etName.text.toString(),
                pathProfilePhoto,
                ROOM_PRIVATE_REFERENCE
            )
            dismiss()

        } else {
            binding.tvValidation.isVisible = true

        }


    }


    private fun goToGallery() {
        val photoPickerIntent = Intent(Intent.ACTION_PICK)
//        photoPickerIntent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true)
        photoPickerIntent.type = "image/*"
        imagePickerLauncher.launch(photoPickerIntent)
    }


    private val imagePickerLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            getImageFromActivityResult(result.resultCode, result.data)
        }


    private fun getImageFromActivityResult(resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK) {
            if (data?.data != null) {
                imageUri = data.data
                pathProfilePhoto = data.data
            }
            setImageProfile()

        }
    }

    private fun setImageProfile() {
        bitmap =
            MediaStore.Images.Media.getBitmap(
                requireActivity().contentResolver,
                imageUri
            )

        binding.ivProfile.setImageBitmap(bitmap)
    }


}



