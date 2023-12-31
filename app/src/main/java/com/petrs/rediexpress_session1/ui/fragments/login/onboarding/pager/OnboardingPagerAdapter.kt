package com.petrs.rediexpress_session1.ui.fragments.login.onboarding.pager

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.petrs.rediexpress_session1.domain.models.OnboardingData

class OnboardingPagerAdapter(fragment: Fragment, private val onboardingData: List<OnboardingData>) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = onboardingData.size

    override fun createFragment(position: Int) = OnboardingPagerFragment.getInstance(
        OnboardingPagerFragmentParams(
            title = onboardingData[position].title,
            description = onboardingData[position].description,
            image = onboardingData[position].image
        )
    )

}