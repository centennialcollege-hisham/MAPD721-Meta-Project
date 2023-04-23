package com.zero1tech.chat.ui.post

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.core.extinction.setSafeOnClickListener
import com.example.data.model.Post
import com.zero1tech.chat.databinding.RowPostBinding
import java.text.SimpleDateFormat
import java.util.*

class PostAdapter(private val listener: OnItemClick, val userId: String) :
    ListAdapter<Post, PostAdapter.PostViewHolder>(callBackDiffUtil) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val binding = RowPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val data = getItem(position)
        holder.bind(data)
    }

    inner class PostViewHolder(private val binding: RowPostBinding) :
        RecyclerView.ViewHolder(binding.root), View.OnClickListener {

        init {
            binding.btnLike.setOnClickListener(this)
            binding.btnShare.setSafeOnClickListener { sharePost() }
            binding.rowIvMenu.setOnClickListener { viewMenuDialog() }

        }

        private fun sharePost() {
            val position = adapterPosition
            val post = getItem(position)
            post.shareId?.add(userId)
            post.shareCount = post.shareCount?.plus(1)
            binding.rowShareCount.text =
                (binding.rowShareCount.text.toString().toInt().plus(1)).toString()
            listener.onShareClick(post)

        }

        private fun viewMenuDialog() {
            val position = adapterPosition
            val post = getItem(position)
            listener.viewMenu(post)
        }

        fun bind(data: Post) {
            likeShareCountVisibility(data)
            binding.post = data
            binding.executePendingBindings()
            binding.rowTextViewDate.text = data.date?.toLong()?.let { simpleDateFormat(it) }
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            val post = getItem(position)
            if (post.isChecked == true) {
                post.likeId?.remove(userId)
                post.likeCount = post.likeCount?.minus(1)
                binding.tvLikeCount.text =
                    (binding.tvLikeCount.text.toString().toInt().minus(1)).toString()
                post.isChecked = false

            } else {
                post.likeId?.add(userId)
                post.isChecked = true
                post.likeCount = post.likeCount?.plus(1)
                binding.tvLikeCount.text =
                    (binding.tvLikeCount.text.toString().toInt().plus(1)).toString()
            }
            notifyDataSetChanged()

            listener.onLikeClick(post)
        }

        @SuppressLint("SimpleDateFormat")
        fun simpleDateFormat(timeStamp: Long): String {
            val sdf = SimpleDateFormat("EEEE hh:mm a")
            val netDate = Date(timeStamp)
            return sdf.format(netDate)
        }

    }

    private fun likeShareCountVisibility(data: Post) {
        data.likeIsVisible = data.likeId?.size  != 0
        data.shareIsVisible = data.shareCount != 0
    }

    companion object {
        val callBackDiffUtil = object : DiffUtil.ItemCallback<Post>() {
            override fun areItemsTheSame(oldItem: Post, newItem: Post): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Post, newItem: Post): Boolean {
                return oldItem == newItem
            }
        }

    }

    interface OnItemClick {
        fun onLikeClick(post: Post)
        fun viewMenu(post: Post)
        fun onShareClick(post: Post)
    }

}