package com.zero1tech.chat.ui.friends

import android.os.Bundle
import android.view.*
import android.widget.SearchView
import androidx.activity.OnBackPressedCallback
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.core.constant.FRIENDID
import com.example.core.constant.FRIENDS_FRAGMENT
import com.example.core.constant.FROM_FRIENDS
import com.example.core.constant.FROM_SUGGEST
import com.example.core.extinction.setSafeOnClickListener
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import com.zero1tech.chat.R
import com.zero1tech.chat.ScreenName
import com.zero1tech.chat.base.BaseFragment
import com.zero1tech.chat.databinding.FragmentFriendsBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@ScreenName("friends")
@AndroidEntryPoint
class FriendsFragment : BaseFragment(), UserAdapter.UserClickListener {

    private val friendsViewModel: FriendsViewModel by viewModels()
    private lateinit var userAdapter: UserAdapter
    private var fromNotification: Boolean = true

    @Inject
    lateinit var prefs: Prefs
    private lateinit var binding: FragmentFriendsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFriendsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycle.addObserver(friendsViewModel)
        setHasOptionsMenu(true)
        prefs.currentUser
        isDeeplink()
        initAdapter()
        onListener()
        initObserve()
        fromNotification()
        initViews()
    }

    private fun initViews() {
        binding.includeBotImages.isImagesBut = true
    }


    private fun isDeeplink() {
        val receiverID = requireArguments()[FRIENDID] as? String
        receiverID?.mapNotNull {
            val action =
                FriendsFragmentDirections.actionFriendsFragment2ToChatFragment(
                    fromSuggest = FROM_FRIENDS,
                    flag = FRIENDS_FRAGMENT,
                    receiverID = receiverID
                )
            findNavController().navigate(action)
        }
    }

    private fun showEmptyList(show: Boolean) {
        binding.clEmptyList.isVisible = show
    }

    private fun onListener() {
        onClickRequest()
        onClickButtonExplore()
        onBackPresses()
        onBotClick()
    }

    private fun onBotClick() {
        binding.includeBotChat.clParent.setOnClickListener {
            val action =
                FriendsFragmentDirections.actionFriendsFragmentToChatBotFragment(
                    friendsViewModel.getButChatInfo(),
                    FROM_FRIENDS,
                    FRIENDS_FRAGMENT
                )
            findNavController().navigate(action)
        }
        binding.includeBotImages.clParent.setOnClickListener {
            val action =
                FriendsFragmentDirections.actionFriendsFragmentToImagesFragment(
                    friendsViewModel.getButImagesInfo(),
                    FROM_SUGGEST,
                    FRIENDS_FRAGMENT
                )
            findNavController().navigate(action)
        }
    }

    private fun onClickButtonExplore() {
        binding.btnExplore.setSafeOnClickListener {
            val action =
                FriendsFragmentDirections.actionFriendsFragmentToPeopleFragment()
            findNavController().navigate(action)
        }
    }

    private fun onBackPresses() {
        val callback: OnBackPressedCallback =
            object : OnBackPressedCallback(true /* enabled by default */) {
                override fun handleOnBackPressed() {
                    activity?.finish()
                }
            }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
    }


    private fun onClickRequest() {
        binding.clMessageRequest.setSafeOnClickListener {
            val action =
                FriendsFragmentDirections.actionFriendsFragmentToRequestFragment()
            findNavController().navigate(action)

        }
    }


    private fun initAdapter() {
        userAdapter = UserAdapter(this, currentUser = prefs.currentUser.uid)
        binding.rvUser.adapter = userAdapter
    }


    private fun initObserve() {
        friendsViewModel.errorLiveData.observe(viewLifecycleOwner, ::handleError)
        friendsViewModel.loadingLiveData.observe(viewLifecycleOwner, ::handleProgress)
        friendsViewModel.successOtherCountLiveData.observe(viewLifecycleOwner, ::handleOtherCount)
        friendsViewModel.successFriendsLiveData.observe(viewLifecycleOwner, ::handleSuccessFriends)
    }

    private fun handleSuccessFriends(list: List<UserRemote>) {
        showEmptyList(list.isEmpty())
        userAdapter.setData(list.reversed())
    }


    private fun handleOtherCount(count: Long) {

        if (count > 0) {
            binding.clMessageRequest.isVisible = true
            binding.tvCountOther.text = count.toString()
        } else {
            binding.clMessageRequest.isVisible = false
        }

    }

    private fun handleError(throwable: Throwable) {

    }

    private fun handleProgress(show: Boolean) {
        binding.progressBar.isVisible = show
    }


    override fun onUserClick(user: UserRemote) {
        val action =
            FriendsFragmentDirections.actionFriendsFragment2ToChatFragment(
                user,
                FROM_FRIENDS,
                FRIENDS_FRAGMENT
            )
        findNavController().navigate(action)
    }


    private fun fromNotification() {
        if (requireArguments()[FRIENDID] != null && fromNotification) {
            fromNotification = false
            findNavController().navigate(
                R.id.chatFragment, bundleOf(
                    FRIENDID to requireArguments()[FRIENDID].toString()
                )
            )
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_search_friends, menu)
        var item = menu.findItem(R.id.action_search)
        var searchView = item.actionView as SearchView
        search(searchView)
        super.onCreateOptionsMenu(menu, inflater)
    }


    private fun search(searchView: SearchView) {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {

                userAdapter.filter.filter(p0)

                return false
            }
        })
    }


}
