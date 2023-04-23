package com.zero1tech.chat.ui.post

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.core.extinction.setSafeOnClickListener
import com.example.data.model.Post
import com.example.data.prefs.Prefs
import com.google.api.Context
import com.zero1tech.chat.R
import com.zero1tech.chat.databinding.FragmentAddPostBinding
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class AddPostFragment : Fragment(R.layout.fragment_add_post) {
    lateinit var binding: FragmentAddPostBinding
    lateinit var progressDialog: AlertDialog

    val viewModel: PostViewModel by viewModels()

    @Inject
    lateinit var prefs: Prefs

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAddPostBinding.bind(view)
        init()


    }

    private fun init() {
        initView()
        initObserve()
        initOnClick()
    }

    private fun initOnClick() {


        binding.btnPostAddPost.setSafeOnClickListener {

            hideKeyboard()
            progressDialog.show()
            var post = initNewPost()
            if (post.message!!.isNotEmpty()) {
                viewModel.addPost(post)
            } else {
                progressDialog.dismiss()
                AlertDialog.Builder(requireContext())
                    .setTitle(getString(R.string.alert))
                    .setMessage(getString(R.string.CantAddEmpty))
                    .create()
                    .show()
            }

        }
    }

    private fun hideKeyboard() {
        view?.let { activity?.hideKeyboard(it) }
    }

    fun Activity.hideKeyboard() {
        hideKeyboard(currentFocus ?: View(this))
    }

    fun android.content.Context.hideKeyboard(view: View) {
        val inputMethodManager =
            getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun initObserve() {
        viewModel.successAddPost.observe(viewLifecycleOwner, ::handleSuccessAddPost)
    }

    private fun handleSuccessAddPost(flag: Boolean) {

        if (flag) {
            progressDialog.dismiss()
            findNavController().navigate(R.id.postFragment)
        }
    }

    private fun initView() {
        initDialog()
        binding.tvTitleAddPost.text = prefs.nameCurrentUser
        Glide.with(requireContext())
            .load(prefs.currentUser.profile)
            .centerCrop()
            .error(R.drawable.ic_default_rating)
            .into(binding.ivAddPost)
    }

    private fun initDialog() {
        progressDialog = AlertDialog.Builder(requireContext())
            .setCancelable(false)
            .setView(R.layout.progress_dialog)
            .create()
    }

    private fun initNewPost(): Post {
        var post = Post()
        val contentText = binding.etContentPost.text.toString() ?: ""
        post.date = System.currentTimeMillis().toString()
        post.userId = prefs.idCurrentUser
        post.title = prefs.nameCurrentUser
        post.message = contentText
        if (prefs.currentUser.profile.isNullOrEmpty()) {
            post.image =
                "https://firebasestorage.googleapis.com/v0/b/jokes-application-6a1a1.appspot.com/o/users%2Fprofile%2F6kduHq0SeJfDOCZ4051nU0je9VF2?alt=media&token=4432e51a-c244-4d26-a2f6-e5f5d1e0a53a"
        } else {
            post.image = prefs.currentUser.profile
        }
        return post
    }


}