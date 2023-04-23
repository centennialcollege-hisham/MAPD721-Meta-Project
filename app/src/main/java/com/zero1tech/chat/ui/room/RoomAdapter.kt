package com.zero1tech.chat.ui.room

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.core.extinction.setSafeOnClickListener
import com.example.data.model.LastMessage
import com.example.data.model.RoomModel
import com.zero1tech.chat.databinding.RowRoomsBinding
import java.text.SimpleDateFormat
import java.util.*


class RoomAdapter(val listener: OnClickItem, val idCurrentUser: String) :
    ListAdapter<RoomModel, RoomAdapter.RoomViewHolder>(DiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomViewHolder {
        val binding = RowRoomsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RoomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RoomViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class RoomViewHolder(val binding: RowRoomsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: RoomModel) {
            val isJoined = isJoined(model)
            binding.model = model
            binding.executePendingBindings()

            initListener(model, isJoined)
            handleBtnJoin(isJoined)
            handleTimeLastMessage(model.lastMassage)
        }

        private fun handleTimeLastMessage(lastMessage: LastMessage?) {
            if (!lastMessage?.timeMessage.isNullOrEmpty()) {
                val time = lastMessage?.timeMessage
                val format = handleFormatTime(time)
                handleTextStyle(lastMessage?.usersSee)
                binding.tvTimeLastMessage.text = format
            }
        }

        private fun initListener(model: RoomModel, isJoined: Boolean) {
            binding.root.setSafeOnClickListener {
                listener.onClickRoom(model, isJoined, checkIsSee(model.lastMassage?.usersSee))
            }
            binding.btnJoin.setSafeOnClickListener {
                listener.onClickJoin(model, true)
            }
        }

        private fun handleBtnJoin(isJoined: Boolean) {
            binding.isJoined = !isJoined
        }

        private fun handleTextStyle(usersSee: HashMap<String, String>?) {
            binding.seeIt = checkIsSee(usersSee)
        }


    }


    private fun checkIsSee(usersSee: HashMap<String, String>?) =
        usersSee?.contains(idCurrentUser) == true

    private fun handleFormatTime(time: String?) =
        if (isTimeSameCurrentDay(time)) {
            formatTimeByHour(time)
        } else {
            formatTimeByDate(time)
        }

    private fun isTimeSameCurrentDay(time: String?): Boolean {
        var times = time
        if (time == "")
            times = "1642695062890"
        val simpleFormat = SimpleDateFormat("dd", Locale.ENGLISH)
        val timeLsatMessage = simpleFormat.format(times?.toLong())
        val currentDay = Calendar.getInstance().time.date.toString()
        return currentDay.toInt() == timeLsatMessage.toInt()
    }

    private fun isJoined(model: RoomModel) =
        model.accessUsers?.contains(idCurrentUser) == true


    private fun formatTimeByHour(time: String?): String {
        val simpleFormat = SimpleDateFormat("hh:mm a", Locale.ENGLISH)
        var format = ""
        try {
            format = simpleFormat.format(time?.toLong())
        } catch (ex: Exception) {
            val timestamp = System.currentTimeMillis()
            format = simpleFormat.format(timestamp)
        }
        if (format.first() == '0') {
            return format.replaceFirstChar { "" }
        }
        return format
    }

    private fun formatTimeByDate(time: String?): String {
        val simpleFormat = SimpleDateFormat("MM-dd", Locale.ENGLISH)
        var format = ""
        format = try {
            simpleFormat.format(time?.toLong())
        } catch (ex: Exception) {
            val timestamp = System.currentTimeMillis()
            simpleFormat.format(timestamp)
        }
        return format
    }


    interface OnClickItem {
        fun onClickRoom(room: RoomModel, isJoined: Boolean, isSee: Boolean)
        fun onClickJoin(model: RoomModel, isJoined: Boolean)
    }


    class DiffCallback : DiffUtil.ItemCallback<RoomModel>() {
        override fun areItemsTheSame(oldItem: RoomModel, newItem: RoomModel) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(
            oldItem: RoomModel,
            newItem: RoomModel,
        ) =
            oldItem == newItem
    }


}