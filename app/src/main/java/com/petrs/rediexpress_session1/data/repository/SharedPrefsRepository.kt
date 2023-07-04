package com.petrs.rediexpress_session1.data.repository

import com.petrs.rediexpress_session1.data.DataResult

interface SharedPrefsRepository {

    fun getOnboardingStatus(): DataResult<Boolean>
    fun setOnboardingStatus(status: Boolean): DataResult<Unit>
}