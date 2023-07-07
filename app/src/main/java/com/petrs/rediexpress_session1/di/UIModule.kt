package com.petrs.rediexpress_session1.di

import com.petrs.rediexpress_session1.ui.activity.login.LoginViewModel
import com.petrs.rediexpress_session1.ui.activity.main.MainViewModel
import com.petrs.rediexpress_session1.ui.fragments.login.forgotPassword.ForgotPasswordFragment
import com.petrs.rediexpress_session1.ui.fragments.login.forgotPassword.ForgotPasswordViewModel
import com.petrs.rediexpress_session1.ui.fragments.login.newPassword.NewPasswordViewModel
import com.petrs.rediexpress_session1.ui.fragments.login.onboarding.OnboardingViewModel
import com.petrs.rediexpress_session1.ui.fragments.login.otpVerification.OTPVerificationViewModel
import com.petrs.rediexpress_session1.ui.fragments.login.privacyPolicy.PrivacyPolicyViewModel
import com.petrs.rediexpress_session1.ui.fragments.login.signIn.SignInViewModel
import com.petrs.rediexpress_session1.ui.fragments.login.signUp.SignUpFragment
import com.petrs.rediexpress_session1.ui.fragments.login.signUp.SignUpViewModel
import com.petrs.rediexpress_session1.ui.fragments.login.splash.SplashViewModel
import com.petrs.rediexpress_session1.ui.fragments.main.home.HomeViewModel
import com.petrs.rediexpress_session1.ui.fragments.main.profile.ProfileViewModel
import com.petrs.rediexpress_session1.ui.fragments.main.track.TrackViewModel
import com.petrs.rediexpress_session1.ui.fragments.main.wallet.WalletViewModel
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

    viewModel {
        SignInViewModel()
    }

    viewModel {
        SignUpViewModel()
    }

    viewModel {
        ForgotPasswordViewModel()
    }

    viewModel {
        OTPVerificationViewModel()
    }

    viewModel {
        NewPasswordViewModel()
    }

    viewModel {
        HomeViewModel()
    }

    viewModel {
        WalletViewModel()
    }

    viewModel {
        TrackViewModel()
    }

    viewModel {
        ProfileViewModel()
    }

    viewModel {
        PrivacyPolicyViewModel()
    }
}