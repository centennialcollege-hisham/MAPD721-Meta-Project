package com.zero1tech.chat.ui.room.chat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.data.model.Message
import com.example.data.prefs.Prefs
import com.zero1tech.chat.databinding.RowChatRoomBinding
import javax.inject.Inject

class MessagesAdapter( val idCurrentUser: String) :
    ListAdapter<Message,MessagesAdapter.ChatViewHolder>(DiffCallback()) {

    @Inject
    lateinit var prefs: Prefs

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val binding = RowChatRoomBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    inner class ChatViewHolder(val binding: RowChatRoomBinding) :
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

    class DiffCallback : DiffUtil.ItemCallback<Message>() {
        override fun areItemsTheSame(oldItem: Message, newItem: Message) =
            oldItem.time == newItem.time

        override fun areContentsTheSame(
            oldItem: Message,
            newItem: Message,
        ) =
            oldItem == newItem
    }
}
