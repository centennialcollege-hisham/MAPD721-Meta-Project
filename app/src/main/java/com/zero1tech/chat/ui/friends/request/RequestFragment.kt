package com.zero1tech.chat.ui.friends.request

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.core.constant.FROM_SUGGEST
import com.example.core.constant.REQUEST_FRAGMENT
import com.example.data.model.UserRemote
import com.zero1tech.chat.ScreenName
import com.zero1tech.chat.base.BaseFragment
import com.zero1tech.chat.databinding.FragmentRequestBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@ScreenName("request")
class RequestFragment : BaseFragment(), RequestAdapter.UserClickListener {
    private lateinit var binding: FragmentRequestBinding
    private val requestViewModel: RequestViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentRequestBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycle.addObserver(requestViewModel)
        initObserve()

    }

    private fun initObserve() {
        requestViewModel.successOtherUserLiveData.observe(viewLifecycleOwner,::handleSuccessOtherUser)
    }

    private fun handleSuccessOtherUser(list: List<UserRemote>) {
        binding.rvUser.adapter = RequestAdapter(list, this)

    }


    override fun onUserClick(user: UserRemote) {
        val action =
            RequestFragmentDirections.actionRequestFragmentToChatFragment(
                user,
                FROM_SUGGEST,
                REQUEST_FRAGMENT
            )
        findNavController().navigate(action)
    }
}