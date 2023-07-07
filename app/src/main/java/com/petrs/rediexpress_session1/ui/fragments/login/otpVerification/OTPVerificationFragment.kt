package com.petrs.rediexpress_session1.ui.fragments.login.otpVerification

import android.os.BaseBundle
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.petrs.rediexpress_session1.R
import com.petrs.rediexpress_session1.databinding.FragmentOTPVerificationBinding
import com.petrs.rediexpress_session1.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 * Use the [OTPVerificationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OTPVerificationFragment : BaseFragment<FragmentOTPVerificationBinding, OTPVerificationViewModel>(
    FragmentOTPVerificationBinding::inflate
) {
    override val viewModel: OTPVerificationViewModel by viewModel()

    override fun initView() {
        binding.apply {
            val spannableString = SpannableString(getString(R.string.text_if_you_didn_t_receive_code_resend))
            val clickableSpan = object : ClickableSpan() {
                override fun onClick(widget: View) {
                    //TODO addResendingCode
                }

                override fun updateDrawState(ds: TextPaint) {
                    super.updateDrawState(ds)

                    ds.color = ContextCompat.getColor(requireContext(), R.color.colorPrimary)
                    ds.isUnderlineText = false
                }
            }
            spannableString.setSpan(clickableSpan, 27, spannableString.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
            tvDidnTReceiveCode.movementMethod = LinkMovementMethod()
            tvDidnTReceiveCode.text = spannableString
        }
    }

    override fun observeViewModel() {
        viewModel.apply {

        }
    }

}