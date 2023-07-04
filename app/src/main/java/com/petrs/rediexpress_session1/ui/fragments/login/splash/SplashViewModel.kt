package com.petrs.rediexpress_session1.ui.fragments.login.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.petrs.rediexpress_session1.domain.DomainResult
import com.petrs.rediexpress_session1.domain.LoadingState
import com.petrs.rediexpress_session1.domain.interactors.StartInteractor
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SplashViewModel(private val startInteractor: StartInteractor) : ViewModel() {

    private val _onboardingStatus: MutableStateFlow<DomainResult<Boolean>> =
        MutableStateFlow(DomainResult.Loading(LoadingState.INITIAL))
    val onboardingStatus = _onboardingStatus.asStateFlow()

    fun getOnboardingStatus() = viewModelScope.launch {
        _onboardingStatus.value = startInteractor.getOnboardingStatus()
    }
}