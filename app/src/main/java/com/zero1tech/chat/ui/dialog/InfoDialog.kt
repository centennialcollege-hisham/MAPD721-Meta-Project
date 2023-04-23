package com.zero1tech.chat.ui.dialog

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.core.constant.DEFAULT_PROFILE_PHOTO
import com.example.core.extinction.getDeviceId
import com.example.core.extinction.setSafeOnClickListener
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import com.google.android.material.navigation.NavigationView
import com.zero1tech.chat.R
import com.zero1tech.chat.databinding.InfoDialogBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class InfoDialog : AppCompatDialogFragment() {
    @Inject
    lateinit var prefs: Prefs
    val viewModel: DialogViewModel by viewModels()
    val args: InfoDialogArgs by navArgs()

    var fromWhere: String = ""


    private lateinit var dataListener: DatePickerDialog.OnDateSetListener

    private var age = -1
    private var isActualAge = false

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {


        isCancelable = false
        val binding = InfoDialogBinding.inflate(requireActivity().layoutInflater, null, false)
        val builder = AlertDialog.Builder(activity)
        builder.setView(binding.root)
            .setTitle("write your info ")

        listener(binding, viewModel)

        return builder.create()

    }


    private fun listener(
        binding: InfoDialogBinding,
        viewModel: DialogViewModel,
    ) {
        onClickTvAge(binding)

        onClickSpinnerFrom(binding)

        datePickerDialogListener(binding)

        onClickBtnAdd(binding, viewModel)
    }

    private fun onClickSpinnerFrom(binding: InfoDialogBinding) {
        val cities = args.cities!!.toList()
        val myAdapter =
            ArrayAdapter(requireContext(), R.layout.item_location, cities)

        binding.acTvLocation.setText(getString(R.string.select_cities), false)
        binding.acTvLocation.setAdapter(myAdapter)

        binding.acTvLocation.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position, _ ->
                fromWhere = cities[position]
            }

    }

    private fun onClickBtnAdd(
        binding: InfoDialogBinding,
        viewModel: DialogViewModel,
    ) {
        binding.btnAdd.setOnClickListener {

            val name = binding.etFullName.text.toString()

            val year = age.toString()

            prefs.currentUser = UserRemote(
                fullName = name,
                from = fromWhere,
                age = year,
                profile = DEFAULT_PROFILE_PHOTO
            )

            val age = isValidAge(year, binding)
            if (isActualAge && name.isNotEmpty() && fromWhere.isNotEmpty() && age.isNotEmpty()) {

                viewModel.resisterUserDevice(
                    getDeviceId(requireContext()),
                    name,
                    age,
                    fromWhere
                )
                prefs.nameCurrentUser = name
                initUserNameInDrawerMenu(name)
                dismiss()
            } else {
                Toast.makeText(
                    context,
                    "Please enter the information correctly",
                    Toast.LENGTH_SHORT
                ).show()
            }


        }
    }

    private fun isValidAge(year: String, binding: InfoDialogBinding): String {

        var age = ""
        if (year.toInt() > 2015) {
            isActualAge = false
            binding.tvAge.text = getString(R.string.not_actual_age)
        } else {
            isActualAge = true
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            age = (currentYear - year.toInt()).toString()
        }
        return age
    }


    private fun initUserNameInDrawerMenu(name: String) {
        val navigationView =
            requireActivity().findViewById<View>(R.id.nav_drawer_menu) as NavigationView
        val headerView = navigationView.getHeaderView(0)
        val headerTitle = headerView.findViewById<TextView>(R.id.tv_drawer_menu_header_user_name)
        headerTitle.text = name

    }


    private fun datePickerDialogListener(binding: InfoDialogBinding) {
        dataListener = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            month.plus(1)
            val data = "$dayOfMonth/$month/$year"
            binding.tvAge.text = data

            val currentYear = Calendar.getInstance().get(Calendar.YEAR);

            if (year > 2015) {
                isActualAge = false
                binding.tvAge.text = getString(R.string.not_actual_age)
            } else {
                isActualAge = true
                age = currentYear - year
            }
        }
    }

    private fun onClickTvAge(binding: InfoDialogBinding) {

        binding.tvAge.setSafeOnClickListener {
            yearPicker(binding)
        }
    }

    private fun yearPicker(binding: InfoDialogBinding) {

        var myYear = "-1"
        val dialog = Dialog(requireContext())

        dialog.setCancelable(false)
        dialog.setContentView(R.layout.date_year_picker_dialog)

        val numberPicker = dialog.findViewById<NumberPicker>(R.id.np_year)
        val tvSubmit = dialog.findViewById<TextView>(R.id.tv_submit)
        val textYear = dialog.findViewById<TextView>(R.id.tv_year_date)

        val calendar = Calendar.getInstance()
        numberPicker.minValue = 1900

        val currentYear = calendar.get(Calendar.YEAR)

        numberPicker.maxValue = currentYear

        numberPicker.value = currentYear


        numberPicker.setOnValueChangedListener { picker, oldVal, newVal ->
            binding.tvAge.text = newVal.toString()
            textYear.text = newVal.toString()
            myYear = newVal.toString()
        }

        tvSubmit.setOnClickListener {
            if (myYear.toInt() > 2015) {
                isActualAge = false
                binding.tvAge.text = getString(R.string.not_actual_age)
            } else {
                isActualAge = true
                age = currentYear - myYear.toInt()
            }
            dialog.dismiss()
        }

        dialog.show()
    }


}



