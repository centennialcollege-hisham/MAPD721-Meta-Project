package com.zero1tech.chat.ui.people

import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.core.extinction.setSafeOnClickListener
import com.example.core.util.checkLastJoin
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import com.zero1tech.chat.databinding.RowPeopleBinding

class PeopleAdapter(
    private val userClickListener: UserClickListener,
) : ListAdapter<UserRemote, PeopleAdapter.UserViewHolder>(DiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = RowPeopleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    inner class UserViewHolder(private val binding: RowPeopleBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.apply {
                ivUser.setSafeOnClickListener {
                    userClickListener.onUserClick(getItem(adapterPosition))
                }

            }
        }

        @RequiresApi(Build.VERSION_CODES.O)
        fun bind(user: UserRemote) {
            binding.apply {
                model = user
                binding.executePendingBindings()
                binding.isJoin = checkLastJoin(user.lastJoin)


            }
        }
    }

    interface UserClickListener {
        fun onUserClick(User: UserRemote)
    }

    class DiffCallback : DiffUtil.ItemCallback<UserRemote>() {
        override fun areItemsTheSame(oldItem: UserRemote, newItem: UserRemote) =
            oldItem.uid == newItem.uid

        override fun areContentsTheSame(
            oldItem: UserRemote,
            newItem: UserRemote,
        ) =
            oldItem == newItem
    }
}
