package com.zero1tech.chat.ui.setting.updateprofiledialog

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.core.extinction.setSafeOnClickListener
import com.example.data.prefs.Prefs
import com.google.android.material.navigation.NavigationView
import com.zero1tech.chat.R
import com.zero1tech.chat.base.BaseFragment
import com.zero1tech.chat.databinding.DialogSuccessBinding
import com.zero1tech.chat.databinding.UpdateProfileFragmentBinding
import com.zero1tech.chat.ui.main.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class UpdateProfileFragment : BaseFragment() {
    @Inject
    lateinit var prefs: Prefs
    private lateinit var binding: UpdateProfileFragmentBinding
    private var imageUri: Uri? = null
    private var pathProfilePhoto: Uri? = null
    private val viewModel: MainViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = UpdateProfileFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        onClick()
        initObserve()
    }

    private fun initObserve() {
        viewModel.successImageLiveData().observe(viewLifecycleOwner, successImage())
    }

    private fun successImage(): (t: String) -> Unit = {
        Glide.with(this).load(it)
            .error(R.drawable.ic_default_rating)
            .centerCrop()
            .into(binding.ivProfile)

        if (binding.progressBar.isVisible)
            alertSuccessDialog.show()
        binding.progressBar.isVisible = false
        binding.clickable = true
    }

    private fun onClick() {
        onClickImageView()
        onClickSave()
    }


    private fun onClickImageView() {
        binding.fabEditImage.setSafeOnClickListener {
            goToGallery()
        }
    }

    private fun onClickSave() {
        binding.btnSave.setSafeOnClickListener {
            if (isNewData()) {
                if (isCanUpdateFullName()) {
                    updateProfileIv()

                }
            } else {
                binding.progressBar.isVisible = false
            }
        }
    }

    private fun isNewData() =
        prefs.currentUser.fullName != binding.etName.text.toString() ||
                (prefs.currentUser.profile != pathProfilePhoto.toString() &&
                        pathProfilePhoto != null)

    private fun isCanUpdateFullName(): Boolean {
        if (prefs.currentUser.fullName != binding.etName.text.toString()) {
            if (prefs.currentUser.nameChanged == "No") {
                val newFullName = binding.etName.text
                viewModel.updateFullName(newFullName.toString(), "Yes")
                updateProfileUserPref("Yes", newFullName)
                alertSuccessDialog.show()
                return true
            } else {
                Toast.makeText(context, "you updated it before ", Toast.LENGTH_LONG).show()
                return false
            }
        }
        return true
    }

    private fun updateProfileIv() {
        if (pathProfilePhoto != null) {
            if (prefs.currentUser.profile != pathProfilePhoto.toString()) {
                viewModel.updateProfileImage(pathProfilePhoto!!)
                binding.progressBar.isVisible = true
                binding.clickable = false
            }
        }
    }

    private fun initView() {
        binding.model = prefs.currentUser
        binding.clickable = true
    }


    private fun goToGallery() {
        val photoPickerIntent = Intent(Intent.ACTION_PICK)
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
        Glide.with(requireContext())
            .load(imageUri)
            .centerCrop()
            .error(R.drawable.ic_default_rating)
            .into(binding.ivProfile)
    }

    private val alertSuccessDialog: AlertDialog by lazy {
        val binding = DialogSuccessBinding.inflate(layoutInflater)
        var alertDialogSuccess =
            AlertDialog.Builder(requireContext(), R.style.BottomSheetDialogTheme)
                .setView(binding.root)
                .show()
        binding.btnSuccess.setSafeOnClickListener {
            alertSuccessDialog.dismiss()
            findNavController().navigate(R.id.friendsFragment)
        }


        alertDialogSuccess.setCancelable(false)
        alertDialogSuccess
    }

    override fun onDestroy() {
        super.onDestroy()
        alertSuccessDialog.dismiss()
    }

    private fun updateProfileUserPref(nameChanged: String, newFullName: Editable?) {
        val oldUser = prefs.currentUser
        var newUser = oldUser
        newUser.nameChanged = nameChanged
        newUser.fullName = newFullName.toString()
        prefs.currentUser = newUser

        prefs.nameCurrentUser = newFullName.toString()
        whenChangeNameCurrentUser(newFullName.toString())

    }

    private fun whenChangeNameCurrentUser(key: String?) {
        val navigationView =
            requireActivity().findViewById<View>(R.id.nav_drawer_menu) as NavigationView
        val headerView = navigationView.getHeaderView(0)
        val headerTitle = headerView.findViewById<TextView>(R.id.tv_drawer_menu_header_user_name)
        headerTitle.text = prefs.nameCurrentUser
    }
}





