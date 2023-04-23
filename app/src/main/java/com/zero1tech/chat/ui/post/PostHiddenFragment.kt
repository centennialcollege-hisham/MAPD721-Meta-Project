package com.zero1tech.chat.ui.post

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.data.model.Post
import com.example.data.prefs.Prefs
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.zero1tech.chat.R
import com.zero1tech.chat.databinding.BottomSheetDialogBinding
import com.zero1tech.chat.databinding.FragmentPostHiddenBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PostHiddenFragment : Fragment(R.layout.fragment_post_hidden), PostAdapter.OnItemClick {

    lateinit var binding: FragmentPostHiddenBinding
    lateinit var postAdapter: PostAdapter
    lateinit var bottomSheetDialog: BottomSheetDialog

    val viewModel: PostViewModel by viewModels()

    @Inject
    lateinit var prefs: Prefs

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPostHiddenBinding.bind(view)
        lifecycle.addObserver(viewModel)

        init()
    }

    private fun init() {

        initAdapter()
        initRecycleView()
        initObserver()
    }

    private fun initObserver() {
        viewModel.loadingLiveData.observe(viewLifecycleOwner, ::handleLoading)
        viewModel.successReadPostHiddenLiveData.observe(viewLifecycleOwner, ::handleHiddenPosts)
        viewModel.successDeletePost.observe(viewLifecycleOwner, ::handleDeleteResult)
        viewModel.successViewPost.observe(viewLifecycleOwner, ::handleViewPostResult)
    }

    private fun handleDeleteResult(flag: Boolean?) {
        bottomSheetDialog.dismiss()
    }

    private fun handleViewPostResult(flag: Boolean?) {
        bottomSheetDialog.dismiss()
        viewModel.fetchPostHidden()
    }

    private fun handleLoading(flag: Boolean) {


    }

    private fun handleHiddenPosts(list: List<Post>?) {


        if (list!!.isNotEmpty()) {
            binding.tvNoPost.isVisible = false
            postAdapter.submitList(list)
        } else {
            binding.tvNoPost.isVisible = true
            postAdapter.submitList(list)
        }
    }

    private fun initAdapter() {
        postAdapter = PostAdapter(this, prefs.idCurrentUser.toString())
    }

    private fun initRecycleView() {
        var mMangerLayout = LinearLayoutManager(requireContext())
        mMangerLayout.reverseLayout = true
        mMangerLayout.stackFromEnd = true
        binding.rvPostHidden.apply {
            layoutManager = mMangerLayout
            adapter = postAdapter
        }
    }

    override fun onLikeClick(post: Post) {

    }

    override fun viewMenu(post: Post) {
        bottomSheetDialog = BottomSheetDialog(requireContext())
//
        val binding = BottomSheetDialogBinding.inflate(layoutInflater, null, false)
        bottomSheetDialog.setContentView(binding.root)

        binding.imDelete.isVisible = false
        binding.imHide.isVisible = false
        binding.imViewPost.isVisible = true

        if (post.userId == prefs.idCurrentUser)
            binding.imDelete.isVisible = true


        binding.imDelete.setOnClickListener { deletePost(post) }

        binding.imViewPost.setOnClickListener { viewPost(post) }
        bottomSheetDialog.show()
    }

    override fun onShareClick(post: Post) {
        //
    }

    private fun viewPost(post: Post) {
        post.hideId!!.remove(prefs.idCurrentUser.toString())
        viewModel.viewPost(post)
    }

    private fun deletePost(post: Post) {
        viewModel.deletePost(post)
    }

}