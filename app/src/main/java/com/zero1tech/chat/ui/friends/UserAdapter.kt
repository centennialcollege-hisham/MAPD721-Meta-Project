package com.zero1tech.chat.ui.friends

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.core.extinction.setSafeOnClickListener
import com.example.core.util.checkLastJoin
import com.example.core.util.getTimeAgo
import com.example.data.model.UserRemote
import com.zero1tech.chat.databinding.RowUserBinding
import kotlin.collections.ArrayList


class UserAdapter(
    private val userClickListener: UserClickListener,
    private val currentUser: String
) :
    ListAdapter<UserRemote, UserAdapter.UserViewHolder>(DiffCallback()), Filterable {


    private var list: List<UserRemote> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = RowUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    fun setData(list: List<UserRemote>) {
        this.list = list
        submitList(list)
    }

    inner class UserViewHolder(val binding: RowUserBinding) :
        RecyclerView.ViewHolder(binding.root) {


        @RequiresApi(Build.VERSION_CODES.O)
        fun bind(user: UserRemote) {
            binding.apply {
                model = user
                binding.tvDateLastMessage.text = getTimeAgo(user.timeStamp)

                val flag = checkLastJoin(user.lastJoin)
                binding.isJoin = flag
                clParent.setSafeOnClickListener {
                    userClickListener.onUserClick(user)
                }
            }

            handleSeeIt(user)
        }

        private fun handleSeeIt(user: UserRemote) {
            if (user.senderLastMessage != currentUser) {
                binding.seeIt = user.seeIt
            } else {
                binding.seeIt = true
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


    override fun getFilter(): Filter {
        return customFilter
    }

    private val customFilter = object : Filter() {
        override fun performFiltering(constraint: CharSequence?): FilterResults {
            val filteredList = mutableListOf<UserRemote>()
            if (constraint == null || constraint.isEmpty()) {
                filteredList.addAll(list)
            } else {
                for (item in list) {
                    if (item.fullName.toLowerCase()
                            .startsWith(constraint.toString().toLowerCase())
                    ) {
                        filteredList.add(item)
                    }
                }
            }
            val results = FilterResults()
            results.values = filteredList
            return results
        }

        override fun publishResults(constraint: CharSequence?, filterResults: FilterResults?) {
            submitList(filterResults?.values as ArrayList<UserRemote>)

        }

    }


}