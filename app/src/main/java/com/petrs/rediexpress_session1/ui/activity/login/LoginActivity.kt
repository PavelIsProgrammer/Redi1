package com.petrs.rediexpress_session1.ui.activity.login

import androidx.navigation.fragment.NavHostFragment
import com.petrs.rediexpress_session1.R
import com.petrs.rediexpress_session1.databinding.ActivityLoginBinding
import com.petrs.rediexpress_session1.ui.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>(
    ActivityLoginBinding::inflate
) {
    override val viewModel: LoginViewModel by viewModel()

    override fun initView() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        val navController = navHostFragment.navController
        navController.navigate(R.id.splashFragment)
    }

    override fun observeViewModel() {}
}