package com.petrs.rediexpress_session1.domain.interactors.impl

import com.petrs.rediexpress_session1.data.repository.RediRepository
import com.petrs.rediexpress_session1.data.repository.SharedPrefsRepository
import com.petrs.rediexpress_session1.domain.DomainResult
import com.petrs.rediexpress_session1.domain.interactors.BaseInteractor
import com.petrs.rediexpress_session1.domain.interactors.StartInteractor

class StartInteractorImpl(private val repository: RediRepository, private val sharedPrefs: SharedPrefsRepository) : BaseInteractor(), StartInteractor {

    override fun getOnboardingStatus(): DomainResult<Boolean> = returnDomainResult {
        sharedPrefs.getOnboardingStatus()
    }

    override fun setOnboardingStatus(status: Boolean): DomainResult<Unit> = returnDomainResult {
        sharedPrefs.setOnboardingStatus(status)
    }

}