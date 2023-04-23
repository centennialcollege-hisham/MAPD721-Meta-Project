package com.zero1tech.chat.ui.dialog

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialogFragment
import com.zero1tech.chat.databinding.DateYearPickerDialogBinding
import android.R

import android.view.LayoutInflater
import com.google.firebase.database.core.view.View
import android.content.DialogInterface


class YearPickerDialog : AppCompatDialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder = AlertDialog.Builder(requireContext())

        val inflater = requireActivity().layoutInflater
        val view: android.view.View? =
            inflater.inflate(com.zero1tech.chat.R.layout.date_year_picker_dialog, null)

        builder.setView(view)
            .setTitle(getString(com.zero1tech.chat.R.string.date))
            .setNegativeButton(
                getString(com.zero1tech.chat.R.string.cancel)
            ) { dialogInterface, i -> }
            .setPositiveButton(getString(com.zero1tech.chat.R.string.ok)) { dialogInterface, i ->

            }

        return builder.create()
    }

}