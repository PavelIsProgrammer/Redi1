package com.petrs.rediexpress_session1.domain.interactors

import com.petrs.rediexpress_session1.domain.DomainResult

interface StartInteractor {

    fun getOnboardingStatus(): DomainResult<Boolean>
    fun setOnboardingStatus(status: Boolean): DomainResult<Unit>


}