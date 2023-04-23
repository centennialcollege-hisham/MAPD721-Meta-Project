package com.zero1tech.chat.ui.chat.gpt.completion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.data.model.Message
import com.zero1tech.chat.databinding.RowChatBotBinding


class ChatBotAdapter(val idCurrentUser: String) :
    ListAdapter<Message, ChatBotAdapter.ChatViewHolder>(DiffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val binding = RowChatBotBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ChatViewHolder(val binding: RowChatBotBinding) :
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
            return oldItem.timeStamp == newItem.timeStamp
        }

        override fun areContentsTheSame(
            oldItem: Message,
            newItem: Message
        ): Boolean {
            return oldItem == newItem
        }
    }

}

