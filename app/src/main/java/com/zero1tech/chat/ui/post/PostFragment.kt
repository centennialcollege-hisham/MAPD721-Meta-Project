package com.zero1tech.chat.ui.post

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.core.extinction.setSafeOnClickListener
import com.example.data.model.Post
import com.example.data.prefs.Prefs
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.zero1tech.chat.R
import com.zero1tech.chat.databinding.BottomSheetDialogBinding
import com.zero1tech.chat.databinding.FragmentPostBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PostFragment : Fragment(R.layout.fragment_post), PostAdapter.OnItemClick {
    lateinit var binding: FragmentPostBinding
    val viewModel: PostViewModel by viewModels()
    lateinit var postAdapter: PostAdapter
    lateinit var progressDialog: AlertDialog
    lateinit var bottomSheetDialog: BottomSheetDialog
    private var clearList: ArrayList<Post> = ArrayList()
    private lateinit var mMangerLayout: LinearLayoutManager
    private var isPagination = false

    @Inject
    lateinit var prefs: Prefs

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPostBinding.bind(view)
        lifecycle.addObserver(viewModel)
        init()
    }

    private fun init() {
        initView()
        initOnClick()
        getFirstPosts()
        initObserve()
        initAdapter()
        initRecycleView()
        initDialog()
        pagination()
    }

    private fun getFirstPosts() {
        if (clearList.isNullOrEmpty()) {
            viewModel.fetchPosts("0")
        }
    }

    private fun initView() {
        Glide.with(requireContext())
            .load(prefs.currentUser.profile)
            .centerCrop()
            .error(R.drawable.ic_default_rating)
            .into(binding.imageViewProfile)
    }

    private fun initObserve() {
        viewModel.loadingLiveData.observe(viewLifecycleOwner, ::handleProgress)
        viewModel.successReadPostLiveData.observe(viewLifecycleOwner, ::handlePost)
        viewModel.successDeletePost.observe(viewLifecycleOwner, ::handleDeletePost)
        viewModel.successHidPost.observe(viewLifecycleOwner, ::handleHidePost)
    }


    private fun pagination() {
        binding.rvPost.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (mMangerLayout.findLastCompletelyVisibleItemPosition() == clearList.size - 1) {
                    isPagination = true
                    binding.progress.isVisible = true
                    if (clearList.isNotEmpty()) {
                        viewModel.fetchPosts(clearList.last().id.toString())
                    }
                }
            }
        })
    }

    private fun handlePost(list: List<Post>?) {

        if (isPagination) {
            whenUsePagination(list)
        } else {
            whenUseSimplePost(list)
        }

        updatePostLiked(clearList)

        if (list != null) {
            postAdapter.submitList(clearList)
            postAdapter.notifyDataSetChanged()
            progressDialog.dismiss()
        }
    }

    private fun whenUseSimplePost(list: List<Post>?) {
        if (!list.isNullOrEmpty()) {
            clearList.addAll(
                removeHidePost(list).reversed()
            )
        }
    }

    private fun whenUsePagination(list: List<Post>?) {
        list?.reversed()?.map {
            if (!clearList.map { it.id }.contains(it.id)) {
                clearList.add(it)
            }
        }
        isPagination = false
        binding.progress.isVisible = false
    }

    private fun handleHidePost(flag: Boolean?) {
        if (flag!!) {
            bottomSheetDialog.dismiss()
            refreshRecycleView()

        } else {
            Toast.makeText(requireContext(), getString(R.string.cant_hide), Toast.LENGTH_LONG)
                .show()
        }
    }

    private fun handleDeletePost(flag: Boolean?) {
        if (flag!!) {
            bottomSheetDialog.dismiss()
            refreshRecycleView()
        } else {//todo abo  what do this? u cna convert it to isVisible= gone for button hide and delete
            Toast.makeText(requireContext(), "Can't Delete the post", Toast.LENGTH_LONG).show()
        }
    }

    private fun handleProgress(flag: Boolean) {
        if (flag) {
            progressDialog.show()
            viewModel.fetchPosts("0")
        } else
            progressDialog.dismiss()
    }

    private fun removeHidePost(list: List<Post>): List<Post> {
        clearList.clear()
        return list.filter {
            !it.hideId!!.contains(prefs.idCurrentUser)
        }
    }

    private fun updatePostLiked(list: List<Post>) {
        val userId = prefs.idCurrentUser
        list.forEach { post ->
            post.isChecked = false
            post.likeId?.forEach {
                if (it == userId)
                    post.isChecked = true
            }
        }


    }

    private fun initAdapter() {
        postAdapter = PostAdapter(this, prefs.idCurrentUser!!)
    }

    private fun initRecycleView() {
        //Using To Sort Recycle View
        mMangerLayout = LinearLayoutManager(requireContext())


        binding.rvPost.apply {
            adapter = postAdapter
            layoutManager = mMangerLayout
        }
    }

    private fun initOnClick() {
        binding.etAddPost.setOnClickListener {
            findNavController().navigate(R.id.addPostFragment)
        }
        binding.swipeRefreshLayout.setOnRefreshListener {
            refreshRecycleView()
        }
    }

    private fun refreshRecycleView() {
        binding.swipeRefreshLayout.setColorSchemeColors(Color.RED, Color.BLUE)

        viewModel.fetchPosts("0")
        binding.swipeRefreshLayout.isRefreshing = false
    }

    private fun initDialog() {
        progressDialog = AlertDialog.Builder(requireContext())
            .setCancelable(false)
            .setView(R.layout.progress_dialog)
            .create()
    }

    override fun onLikeClick(post: Post) {
        viewModel.updateLikeCount(post)
    }

    override fun viewMenu(post: Post) {
        showBottomDialog(post)
    }

    override fun onShareClick(post: Post) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

        val metaChatLink = prefs.settings.metaChatLink
        val postShare = post.message + "\n" + metaChatLink
        intent.putExtra(Intent.EXTRA_TEXT, postShare)
        startActivity(Intent.createChooser(intent, getString(R.string.post_share)))
        viewModel.updateShareCount(post)
        postAdapter.notifyDataSetChanged()

    }

    private fun showBottomDialog(post: Post) {
        bottomSheetDialog = BottomSheetDialog(requireContext())

        val binding = BottomSheetDialogBinding.inflate(layoutInflater, null, false)
        bottomSheetDialog.setContentView(binding.root)

        if (post.userId != prefs.idCurrentUser) {
            binding.imDelete.isVisible = false
        }
        binding.imDelete.setSafeOnClickListener { deletePost(post) }
        binding.imHide.setSafeOnClickListener { hidePost(post) }
        bottomSheetDialog.show()
    }

    private fun deletePost(post: Post) {
        viewModel.deletePost(post)
    }

    private fun hidePost(post: Post) {
        post.hideId?.add(prefs.idCurrentUser.toString())
        viewModel.hidePost(post)


    }
}