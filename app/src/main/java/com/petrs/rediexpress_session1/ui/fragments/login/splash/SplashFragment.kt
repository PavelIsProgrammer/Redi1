package com.petrs.rediexpress_session1.ui.fragments.login.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.petrs.rediexpress_session1.databinding.FragmentSplashBinding
import com.petrs.rediexpress_session1.domain.DomainResult
import com.petrs.rediexpress_session1.ui.base.BaseFragment
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 * Use the [SplashFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SplashFragment : BaseFragment<FragmentSplashBinding, SplashViewModel>(
    FragmentSplashBinding::inflate
) {
    override val viewModel: SplashViewModel by viewModel()

    override fun initView() {
        viewModel.getOnboardingStatus()
    }

    override fun observeViewModel() {
        viewModel.apply {
            onboardingStatus.observe {
                when (it) {
                    is DomainResult.Error -> {}
                    is DomainResult.Loading -> {}
                    is DomainResult.Success -> {
                        if (it.data) {
//                            findNavController().navigate()
                        } else {
                            findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToOnboardingFragment())
                        }
                    }
                }
            }
        }
    }

}