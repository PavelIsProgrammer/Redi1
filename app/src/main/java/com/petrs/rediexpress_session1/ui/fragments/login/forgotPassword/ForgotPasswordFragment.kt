package com.petrs.rediexpress_session1.ui.fragments.login.forgotPassword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.petrs.rediexpress_session1.R
import com.petrs.rediexpress_session1.databinding.FragmentForgotPasswordBinding
import com.petrs.rediexpress_session1.ui.base.BaseFragment
import com.petrs.rediexpress_session1.ui.base.error_dialog.ErrorDialog
import com.petrs.rediexpress_session1.ui.base.error_dialog.ErrorDialogParams
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 * Use the [ForgotPasswordFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ForgotPasswordFragment : BaseFragment<FragmentForgotPasswordBinding, ForgotPasswordViewModel>(
    FragmentForgotPasswordBinding::inflate
) {
    override val viewModel: ForgotPasswordViewModel by viewModel()

    override fun initView() {
        binding.apply {
            btnSendOtp.setOnClickListener {
                if (viewModel.checkEmail(etEmail.text.toString())) {
                    //TODO checkEmailInDatabase and if sendCode
                    findNavController().navigate(R.id.action_forgotPasswordFragment_to_OTPVerificationFragment)
                } else {
                    val dialog =
                        ErrorDialog.getInstance(ErrorDialogParams("Некорректный адрес электронной почты"))
                    dialog.show(childFragmentManager, ErrorDialog.TAG)
                }
            }
        }
    }

    override fun observeViewModel() {
        viewModel.apply {

        }
    }

}