package com.zero1tech.chat.ui.main

import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.*
import androidx.activity.viewModels
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.os.bundleOf
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import com.example.core.Languages
import com.example.core.activities.BaseActivity
import com.example.core.constant.KEY_ROOM_NAME
import com.example.core.constant.KEY_ROOM_TYPE
import com.example.core.constant.ROOM_PRIVATE_REFERENCE
import com.example.core.extinction.setSafeOnClickListener
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.dynamiclinks.ktx.dynamicLinks
import com.google.firebase.ktx.Firebase
import com.zero1tech.chat.BuildConfig
import com.zero1tech.chat.R
import com.zero1tech.chat.ScreenName
import com.zero1tech.chat.databinding.ActivityMainBinding
import com.zero1tech.chat.network.exceptions.ConnectionLiveData
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
@ScreenName("mainScreen")
class MainActivity : BaseActivity(), NavigationView.OnNavigationItemSelectedListener{
    lateinit var navController: NavController
    private val mainViewModel: MainViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding
    private var buttonShareApp: MenuItem? = null
    private val graphBundle = Bundle()
    private lateinit var navHostFragment: NavHostFragment
    lateinit var connectionLiveData: ConnectionLiveData
    lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var header: View

    @Inject
    lateinit var prefs: Prefs

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        connectionLiveData = ConnectionLiveData(this)

        initNavigation()
        initViews()
        initDrawerNavHeader()
        initObserve()
        checkHaveName()
        setupNavBottom()
        initDynamicLink()
        initDrawerNavigationOnClick()
    }


    private fun initDrawerNavHeader() {
        val headerTitle = header.findViewById<TextView>(R.id.tv_drawer_menu_header_user_name)
        val headerImage = header.findViewById<ImageView>(R.id.iv_drawer_menu_header_profile)

        if (!prefs.idCurrentUser.isNullOrBlank()) {
            headerTitle.text = prefs.nameCurrentUser
            Glide.with(this).load(prefs.currentUser.profile)
                .error(R.drawable.ic_default_rating)
                .centerCrop()
                .into(headerImage)
        }


    }

    private fun updateProfile() {
        navController.navigate(R.id.updateProfileFragment)
        binding.mainDrawerLayout.closeDrawer(GravityCompat.START)
    }

    private fun initDrawerNavigationOnClick() {
        binding.navDrawerMenu.setNavigationItemSelectedListener(this)
        binding.mainDrawerLayout.setSafeOnClickListener {
            hideKeyboard()
        }
    }


    override fun onBackPressed() {
        if (binding.mainDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.mainDrawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    private fun initDynamicLink() {
        val inflater = navHostFragment.navController.navInflater
        val graph = inflater.inflate(R.navigation.nav_graph)
        navHostFragment.navController.setGraph(graph, graphBundle)
        Firebase.dynamicLinks
            .getDynamicLink(intent)
            .addOnSuccessListener(this) { pendingDynamicLinkData ->
                var deepLink: Uri? = null
                if (pendingDynamicLinkData != null)
                    deepLink = pendingDynamicLinkData.link

                if (deepLink != null) {
                    var roomName = deepLink.getQueryParameter(KEY_ROOM_NAME)
                    var roomType = deepLink.getQueryParameter(KEY_ROOM_TYPE)
                    graphBundle.putString(KEY_ROOM_TYPE, roomType)
                    navController.navigate(
                        R.id.roomChatFragment, bundleOf(
                            KEY_ROOM_NAME to roomName,
                            KEY_ROOM_TYPE to ROOM_PRIVATE_REFERENCE
                        )
                    )
                }
            }
            .addOnFailureListener(this)
            { e -> Log.w("TAG", "getDynamicLink:onFailure", e) }
    }


    private fun checkHaveName() {
        if ((prefs.nameCurrentUser.isNullOrEmpty())) {
            mainViewModel.getUserToken()
            mainViewModel.checkHaveAccount()
        } else {
            mainViewModel.getCurrentUser()
        }
    }

    private fun initLastJoin() {
        val timeStamp = System.currentTimeMillis()
        mainViewModel.updateLastJoin(timeStamp.toString())
    }

    private fun openDialog() {
        val currentLanguage = Languages.getLanguage(this)
        mainViewModel.getCities(currentLanguage)
    }

    private fun initViews() {
        header = binding.navDrawerMenu.getHeaderView(0)

        setSupportActionBar(binding.toolbarMain)
        //fragment without button back

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.friendsFragment,
                R.id.peopleFragment,
                R.id.roomFragment,
                R.id.postFragment
            ), binding.mainDrawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    private fun initObserve() {
        mainViewModel.haveAccount.observe(this, ::handleIsHaveAccount)
        mainViewModel.successCurrentUserLiveData.observe(this, ::handleGetCurrentUser)
        mainViewModel.successReadCities.observe(this, ::handleCities)

        connectionLiveData.observe(this) { isNetworkAvailable -> //todo clean
            if (!isNetworkAvailable) {
                showSandbarNoInternet()
                Toast.makeText(this, getString(R.string.no_network), Toast.LENGTH_LONG).show()
            }
        }
        mainViewModel.successImageLiveData().observe(this) {
            val header = binding.navDrawerMenu.getHeaderView(0)
            val headerImage = header.findViewById<ImageView>(R.id.iv_drawer_menu_header_profile)
            Glide.with(this).load(it)
                .error(R.drawable.ic_default_rating)
                .centerCrop()
                .into(headerImage)
        }

    }


    private fun handleCities(cities: MutableList<String>?) {
        Log.d("TAG500", "handleCities: ${prefs.idCurrentUser} ${prefs.nameCurrentUser}")
        val bundle = Bundle()
        bundle.putStringArray("cities", cities?.toTypedArray())
        navController.navigate(R.id.action_global_dialog, bundle)
    }

    private fun handleGetCurrentUser(userRemote: UserRemote?) {
        if (userRemote?.uid?.isNotBlank() == true) {
            prefs.currentUser = userRemote
        } else {
            mainViewModel.checkHaveAccount()
        }
    }

    private fun handleIsHaveAccount(have: Boolean) {
        if (have.not()) {
            openDialog()
        } else {
            initDrawerNavHeader()
            initLastJoin()
        }
    }


    private fun initNavigation() {
        navHostFragment =
            (supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment)
        navController = navHostFragment.findNavController()
        binding.bottomNav.setupWithNavController(navController)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_share_room -> {
                Toast.makeText(this, getString(R.string.share_room_here), Toast.LENGTH_LONG).show()

            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun shareApp() {
        try {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name))
            var shareMessage = "\nLet me recommend you this application\n\n"
            shareMessage =
                """
            ${shareMessage}https://play.google.com/store/apps/details?id=${BuildConfig.APPLICATION_ID}
                        """.trimIndent()
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
            startActivity(Intent.createChooser(shareIntent, "choose one"))
        } catch (e: Exception) {
            //e.toString();
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.menu_home, menu)
        if (menu != null) {
//            buttonShareApp = menu.findItem(R.id.action_share_app)
            //   buttonShareRoomChat = menu.findItem(R.id.action_share_room)
        }

        return true
    }


    private fun setupNavBottom() {
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.chatFragment -> {
                    showIvUserAndName()
                    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
                }
                R.id.chatBotFragment -> {
                    showIvUserAndName()
                    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
                }
                R.id.imagesFragment -> {
                    showIvUserAndName()
                    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
                }
                R.id.splashFragment -> {
                    binding.bottomNav.visibility = View.GONE
                    supportActionBar?.hide()
                }
                R.id.roomChatFragment -> {
                    buttonShareApp?.isVisible = false
                    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
                    showIvUserAndName()

                }
                R.id.confirmDialog -> {
                    binding.bottomNav.visibility = View.GONE
                }
                R.id.forceUpdateFragment -> {
                    binding.bottomNav.visibility = View.GONE
                    supportActionBar?.hide()
                }
                R.id.maintenanceFragment -> {
                    binding.bottomNav.visibility = View.GONE
                    binding.toolbarMain.visibility = View.GONE
                }
                 R.id.settingFragment -> {
                    binding.toolbarMain.visibility = View.GONE
                }
                R.id.aboutFragment -> {
                    binding.toolbarMain.visibility = View.GONE
                }
                R.id.privacyFragment -> {
                    binding.toolbarMain.visibility = View.GONE
                }
                R.id.contactUsFragment -> {
                    binding.toolbarMain.visibility = View.GONE
                }
                R.id.updateProfileFragment -> {
                    binding.toolbarMain.visibility = View.GONE
                }
                R.id.postHiddenFragment -> {
                    binding.toolbarMain.visibility = View.GONE
                }
                else -> {
                    hideIvUserAndName()
                }
            }
        }
    }

    //play backButton at toolbar
    override fun onSupportNavigateUp(): Boolean {
        //   val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun showIvUserAndName() {

        binding.apply {
            bottomNav.visibility = View.GONE
            supportActionBar?.show()

        }
        supportActionBar?.setDisplayShowTitleEnabled(false)
        buttonShareApp?.isVisible = false

    }

    private fun hideIvUserAndName() {
        binding.apply {
            bottomNav.visibility = View.VISIBLE
            ivProfileChat.visibility = View.GONE
            tvFullName.visibility = View.GONE
        }
        handleActionBarAndItemMenu()
    }

    private fun handleActionBarAndItemMenu() {
        supportActionBar?.setDisplayShowTitleEnabled(true)
        supportActionBar?.show()
        buttonShareApp?.isVisible = true
        //  buttonShareRoomChat?.isVisible = false
    }


    private fun showSandbarNoInternet() {
        val snackbar: Snackbar =
            Snackbar.make(binding.clSankbar, "No internet", Snackbar.LENGTH_INDEFINITE)
        snackbar.setAction(getString(R.string.button_retry)) {
        }
        val snackBarLayout1 = snackbar.view as (Snackbar.SnackbarLayout)
        for (i in 0 until snackBarLayout1.childCount) {
            val parent = snackBarLayout1.getChildAt(i)
            if (parent is LinearLayout) {
                parent.rotation = 360f
                break
            }
        }
        val view = snackbar.view
        val params = view.layoutParams as CoordinatorLayout.LayoutParams
        params.gravity = Gravity.TOP
        view.layoutParams = params
        snackbar.show()


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.mi_profile -> {
                navController.navigate(R.id.updateProfileFragment)
            }
            R.id.mi_post_hide -> {
                navController.navigate(R.id.postHiddenFragment)
            }
            R.id.im_setting -> {
                navController.navigate(R.id.settingFragment)
            }
            R.id.im_about -> {
                navController.navigate(R.id.aboutFragment)
            }
            R.id.im_privacy -> {
                navController.navigate(R.id.privacyFragment)
            }
            R.id.im_contact -> {
                navController.navigate(R.id.contactUsFragment)
            }
            R.id.im_share -> {
                shareApp()
            }
        }
        binding.mainDrawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun hideKeyboard() {
         this.hideKeyboard()
    }

}

