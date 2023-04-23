package com.zero1tech.chat.ui.friends.request

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.core.extinction.setSafeOnClickListener
import com.zero1tech.chat.databinding.RowUserRequestBinding
import com.example.data.model.UserRemote

class RequestAdapter(
    private val userList: List<UserRemote>,
    private val userClickListener: UserClickListener
) : RecyclerView.Adapter<RequestAdapter.UserViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding =
            RowUserRequestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    inner class UserViewHolder(private val binding: RowUserRequestBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.apply {
                clParent.setSafeOnClickListener {
                    userClickListener.onUserClick(userList[adapterPosition])

                }

            }
        }

        fun bind(user: UserRemote) {
            binding.apply {
                model = user
            }
        }
    }

    interface UserClickListener {
        fun onUserClick(User: UserRemote)
    }
}
