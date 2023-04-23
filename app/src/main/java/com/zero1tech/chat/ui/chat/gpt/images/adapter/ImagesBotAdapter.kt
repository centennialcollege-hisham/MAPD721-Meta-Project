package com.zero1tech.chat.ui.chat.gpt.images.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.data.model.Message
import com.zero1tech.chat.databinding.RowImagesBotBinding


class ImagesBotAdapter(
    val idCurrentUser: String,
    private val onRowClickListener: (String) -> Unit,
) : ListAdapter<Message, ImagesBotAdapter.ChatViewHolder>(DiffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val binding =
            RowImagesBotBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val message = getItem(position)
        holder.bind(message)
    }

    inner class ChatViewHolder(val binding: RowImagesBotBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(message: Message) {
            if (message.senderid == idCurrentUser) {
                isRightSide(message)
            } else {
                isLiftSide(message)

            }

        }

        private fun isLiftSide(message: Message) {
            binding.apply {
                parentLeft.visibility = View.VISIBLE
                parentRight.visibility = View.GONE

                val imageAdapter = ImageAdapter(onRowClickListener)
                rvImages.adapter = imageAdapter
                imageAdapter.submitList(message.messages)

                model = message
            }
        }

        private fun isRightSide(message: Message) {
            binding.apply {
                parentRight.visibility = View.VISIBLE
                parentLeft.visibility = View.GONE
                model = message
            }
        }
    }

    object DiffCallBack : DiffUtil.ItemCallback<Message>() {
        override fun areItemsTheSame(
            oldItem: Message,
            newItem: Message
        ): Boolean {
            return oldItem.message == newItem.message
        }

        override fun areContentsTheSame(
            oldItem: Message,
            newItem: Message
        ): Boolean {
            return oldItem == newItem
        }
    }

}

