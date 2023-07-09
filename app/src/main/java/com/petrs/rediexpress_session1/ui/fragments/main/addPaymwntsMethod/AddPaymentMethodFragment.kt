package com.petrs.rediexpress_session1.ui.fragments.main.addPaymwntsMethod

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.petrs.rediexpress_session1.R
import com.petrs.rediexpress_session1.databinding.FragmentAddPaymentMethodBinding
import com.petrs.rediexpress_session1.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 * Use the [AddPaymentMethodFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddPaymentMethodFragment : BaseFragment<FragmentAddPaymentMethodBinding, AddPaymentMethodViewModel>(
    FragmentAddPaymentMethodBinding::inflate
) {
    override val viewModel: AddPaymentMethodViewModel by viewModel()

    override fun initView() {
        TODO("Not yet implemented")
    }

    override fun observeViewModel() {
        TODO("Not yet implemented")
    }

}