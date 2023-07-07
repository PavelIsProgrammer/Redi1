package com.petrs.rediexpress_session1.ui.activity.main

import android.os.Bundle
import androidx.core.view.isVisible
import com.petrs.rediexpress_session1.R
import com.petrs.rediexpress_session1.databinding.ActivityMainBinding
import com.petrs.rediexpress_session1.ui.base.BaseActivity
import com.petrs.rediexpress_session1.utils.setupWithNavController
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    ActivityMainBinding::inflate
) {
    override val viewModel: MainViewModel by viewModel()

    override fun initView() {}

    override fun observeViewModel() {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            setupBottomNavigationBar()
        }
    }

    private fun setupBottomNavigationBar() {
        val navGraphIds = listOf(
            R.navigation.home,
            R.navigation.wallet,
            R.navigation.track,
            R.navigation.profile
        )

        binding.bottomNav.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.nav_host_fragment_activity_main,
            intent = intent,
            this,
            listOf(binding.selectedHome, binding.selectedWallet, binding.selectedTrack, binding.selectedProfile)
        )
    }

    fun showBottomBar() {
        binding.bottomNav.isVisible = true
    }

    fun hideBottomBar() {
        binding.bottomNav.isVisible = false
    }
}