package com.petrs.rediexpress_session1.data.repository.impl

import com.petrs.rediexpress_session1.data.DataResult
import com.petrs.rediexpress_session1.data.repository.SharedPrefsRepository
import com.petrs.rediexpress_session1.data.sharedPrefs.SharedPrefsHandler

class SharedPrefsRepositoryImpl(private val handler: SharedPrefsHandler) : SharedPrefsRepository {

    override fun getOnboardingStatus(): DataResult<Boolean> = DataResult.Success(handler.getOnboardingStatus())

    override fun setOnboardingStatus(status: Boolean): DataResult<Unit> = DataResult.Success(handler.setOnboardingStatus(status))
}