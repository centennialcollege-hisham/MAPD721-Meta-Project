package com.zero1tech.chat.ui.people.search

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.core.extinction.setSafeOnClickListener
import com.example.core.util.checkLastJoin
import com.example.data.model.UserRemote
import com.zero1tech.chat.databinding.RowSearchPeopleBinding

class PeopleSearchAdapter(
    private val userClickListener: UserClickListener,
) : ListAdapter<UserRemote, PeopleSearchAdapter.UserViewHolder>(DiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = RowSearchPeopleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    inner class UserViewHolder(private val binding: RowSearchPeopleBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.apply {
                clParent.setSafeOnClickListener {
                    userClickListener.onUserClick(getItem(adapterPosition))
                }
                ivDelete.setSafeOnClickListener {
                    userClickListener.onDeleteClick(getItem(adapterPosition))
                }

            }
        }

        @RequiresApi(Build.VERSION_CODES.O)
        fun bind(user: UserRemote) {
            binding.apply {

                model = user
                binding.isJoin = checkLastJoin(user.lastJoin)


            }
        }
    }

    interface UserClickListener {
        fun onUserClick(user: UserRemote)
        fun onDeleteClick(user: UserRemote)
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
