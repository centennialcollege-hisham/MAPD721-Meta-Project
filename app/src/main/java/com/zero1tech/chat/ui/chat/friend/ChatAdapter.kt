package com.zero1tech.chat.ui.chat.friend

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.data.model.Message
import com.zero1tech.chat.databinding.RowChatBinding


class ChatAdapter(private val chatList: List<Message>, val idCurrentUser: String) :
    RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val binding = RowChatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bind(chatList[position])
    }

    override fun getItemCount(): Int {
        return chatList.size
    }


    inner class ChatViewHolder(val binding: RowChatBinding) :
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
            //   onLongPress(parentLeft, message)


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
}

