package com.petrs.rediexpress_session1.domain.models

import androidx.annotation.DrawableRes

data class OnboardingData(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)
