package com.zero1tech.chat.ui.splash.maintenance

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zero1tech.chat.ScreenName
import com.zero1tech.chat.databinding.FragmentMaintenanceBinding

@ScreenName("Maintenance")
class MaintenanceFragment : Fragment() {

    private lateinit var binding: FragmentMaintenanceBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentMaintenanceBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        binding.buttonBackLater.setOnClickListener { activity?.finish() }
    }
}