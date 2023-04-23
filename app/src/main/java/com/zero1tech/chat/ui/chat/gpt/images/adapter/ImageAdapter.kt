package com.zero1tech.chat.ui.chat.gpt.images.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.data.model.gpt.image.ImageResponse
import com.zero1tech.chat.databinding.RowImageBinding


class ImageAdapter(
    private val rowClickListener: (String) -> Unit,
) : ListAdapter<ImageResponse, ImageAdapter.ChatViewHolder>(DiffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val binding =
            RowImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val message = getItem(position)
        holder.bind(message)
        holder.binding.ivMessageLeft.setOnClickListener {
            rowClickListener(message.url ?: "")
        }
    }

    inner class ChatViewHolder(val binding: RowImageBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(message: ImageResponse) {
            binding.model = message
        }
    }

    object DiffCallBack : DiffUtil.ItemCallback<ImageResponse>() {
        override fun areItemsTheSame(
            oldItem: ImageResponse,
            newItem: ImageResponse
        ): Boolean {
            return oldItem.url == newItem.url
        }

        override fun areContentsTheSame(
            oldItem: ImageResponse,
            newItem: ImageResponse
        ): Boolean {
            return oldItem == newItem
        }
    }

}

