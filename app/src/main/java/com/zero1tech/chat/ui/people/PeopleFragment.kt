package com.zero1tech.chat.ui.people

import android.os.Bundle
import android.view.*
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.core.constant.FROM_SUGGEST
import com.example.core.constant.PEOPLE_FRAGMENT
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import com.zero1tech.chat.R
import com.zero1tech.chat.ScreenName
import com.zero1tech.chat.base.BaseFragment
import com.zero1tech.chat.databinding.FragmentPeopleBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
@ScreenName("people")
class PeopleFragment : BaseFragment(), PeopleAdapter.UserClickListener {

    private lateinit var binding: FragmentPeopleBinding
    private val peopleViewModel: PeopleViewModel by viewModels()
    private lateinit var peopleAdapter: PeopleAdapter
    private var userList = ArrayList<UserRemote>()
    private lateinit var layoutManager: LinearLayoutManager

    @Inject
    lateinit var prefs: Prefs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentPeopleBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycle.addObserver(peopleViewModel)
        setHasOptionsMenu(true)
        initAdapter()
        getFirstData()
        initObserve()
        pagination()
    }


    private fun getFirstData() {
        if (userList.isNullOrEmpty())
            peopleViewModel.getFriends("0")
    }

    private fun pagination() {
        binding.rvPeople.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                if (layoutManager.findLastCompletelyVisibleItemPosition() == userList.size - 1) {
                    peopleViewModel.getFriends(userList.last().uid)
                    binding.progressPagination.isVisible = true
                }

            }
        })
    }


    private fun initObserve() {
        peopleViewModel.loadingLiveData.observe(viewLifecycleOwner, ::handleProgress)
        peopleViewModel.errorLiveData.observe(viewLifecycleOwner, ::handleError)
        peopleViewModel.successUsersLiveData.observe(viewLifecycleOwner, ::handlePeopleSuccess)

    }

    private fun handleError(throwable: Throwable?) {
        TODO("Not yet implemented")
    }

    private fun handlePeopleSuccess(users: List<UserRemote>) {
        users.map {
            if (!userList.contains(it)) {
                userList.add(it)
            }
        }
        peopleAdapter.submitList(userList)
        binding.rvPeople.adapter?.notifyDataSetChanged()
        binding.progressPagination.isVisible = false

    }


    private fun initAdapter() {
        layoutManager = GridLayoutManager(requireContext(), 2)
        binding.rvPeople.layoutManager = layoutManager
        peopleAdapter = PeopleAdapter(this)
        binding.rvPeople.adapter = peopleAdapter
    }


    private fun handleProgress(show: Boolean) {
        binding.progressBar.isVisible = show
    }

    override fun onUserClick(user: UserRemote) {
        val action =
            PeopleFragmentDirections.actionPeopleFragment2ToChatFragment(
                user,
                FROM_SUGGEST,
                PEOPLE_FRAGMENT
            )
        findNavController().navigate(action)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_people, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }




}





