package com.zero1tech.chat.ui.people.search

import android.app.Activity
import android.os.Bundle
import android.view.*
import android.view.inputmethod.InputMethodManager
import android.widget.SearchView
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.core.constant.FROM_SUGGEST
import com.example.core.constant.PEOPLE_FRAGMENT
import com.example.data.model.UserRemote
import com.zero1tech.chat.R
import com.zero1tech.chat.ScreenName
import com.zero1tech.chat.base.BaseFragment
import com.zero1tech.chat.databinding.FragmentSearchPeopleBinding
import com.zero1tech.chat.ui.people.PeopleViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import kotlin.collections.ArrayList


@AndroidEntryPoint
@ScreenName("searchPeople")
class SearchPeopleFragment : BaseFragment(), PeopleSearchAdapter.UserClickListener {
    private var timer = Timer()
    private var resentSearch: List<UserRemote> = ArrayList()
    private val peopleViewModel: PeopleViewModel by viewModels()
    private lateinit var binding: FragmentSearchPeopleBinding
    private lateinit var peopleAdapter: PeopleSearchAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentSearchPeopleBinding.inflate(layoutInflater)
        return binding.root


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        peopleViewModel.getResentSearch()
        initAdapter()
        iniObserve()

    }

    private fun iniObserve() {
        peopleViewModel.successSearchUsersLiveData.observe(
            viewLifecycleOwner,
            ::handleSuccessSearch
        )
        peopleViewModel.successResentSearchLiveData.observe(
            viewLifecycleOwner,
            ::handleSuccessResentSearch
        )
    }

    private fun handleSuccessResentSearch(list: List<UserRemote>?) {
        peopleAdapter.submitList(list?.reversed())
        peopleAdapter.notifyDataSetChanged()
        if (list != null) {
            resentSearch = list.reversed()
        }
    }

    private fun handleSuccessSearch(list: List<UserRemote>?) {
        peopleAdapter.submitList(list)
        peopleAdapter.notifyDataSetChanged()
        binding.tvRecentSearch.isVisible = false
    }

    private fun initAdapter() {
        peopleAdapter = PeopleSearchAdapter(this)
        binding.rvPeople.adapter = peopleAdapter
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_search_people, menu)

        var item = menu.findItem(R.id.action_search)
        var searchView = item.actionView as SearchView





        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                p0?.let { textSearch(it) }
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                timer.cancel()
                timer = Timer()
                timer.schedule(object : TimerTask() {
                    override fun run() {
                        p0?.let { textSearch(it) }
                    }
                }, DELAY)
                return false
            }
        })

        super.onCreateOptionsMenu(menu, inflater)
    }


    private fun textSearch(str: String) {
        if (str != "") {
            peopleViewModel.searchPeople(str)
        } else {
            peopleAdapter.submitList(resentSearch)
            binding.tvRecentSearch.isVisible=true

        }
    }

    override fun onUserClick(user: UserRemote) {

        peopleViewModel.addToRecentSearch(user)

        val action =
            SearchPeopleFragmentDirections.actionSearchPeopleFragmentToChatFragment(
                user,
                FROM_SUGGEST,
                PEOPLE_FRAGMENT
            )
        findNavController().navigate(action)


    }

    override fun onDestroy() {
        super.onDestroy()
        hideKeyboard()
    }

    private fun hideKeyboard() {
        val imm: InputMethodManager =
            requireActivity().getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        var view = requireActivity().currentFocus
        if (view == null) {
            view = View(activity)
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    override fun onDeleteClick(user: UserRemote) {
        peopleViewModel.deleteFromRecentSearch(user)
    }

    companion object {
        const val DELAY: Long = 500L

    }
}
