package com.petrs.rediexpress_session1.di

import com.petrs.rediexpress_session1.ui.activity.login.LoginViewModel
import com.petrs.rediexpress_session1.ui.activity.main.MainViewModel
import com.petrs.rediexpress_session1.ui.fragments.login.onboarding.OnboardingViewModel
import com.petrs.rediexpress_session1.ui.fragments.login.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule = module {

    viewModel {
        LoginViewModel()
    }

    viewModel {
        MainViewModel()
    }

    viewModel {
        SplashViewModel(
            startInteractor = get()
        )
    }

    viewModel {
        OnboardingViewModel(
            startInteractor = get()
        )
    }

}