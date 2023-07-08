package com.petrs.rediexpress_session1.ui.fragments.main.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnFocusChangeListener
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.petrs.rediexpress_session1.R
import com.petrs.rediexpress_session1.databinding.FragmentHomeBinding
import com.petrs.rediexpress_session1.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate
) {
    override val viewModel: HomeViewModel by viewModel()

    override fun initView() {
        binding.apply {
            btnCustomerCare.onFocusChangeListener = OnFocusChangeListener { _, hasFocus ->
                if (hasFocus) {
                    tvCustomerServiceTitle.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.white)
                } else {
                    tvCustomerServiceTitle.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.colorPrimary)
                }
            }


        }
    }

    override fun observeViewModel() {
        viewModel.apply {

        }
    }

}