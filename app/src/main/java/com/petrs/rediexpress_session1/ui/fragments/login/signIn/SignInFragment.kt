package com.petrs.rediexpress_session1.ui.fragments.login.signIn

import android.content.Intent
import android.text.Spannable
import android.text.SpannableString
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.method.PasswordTransformationMethod
import android.text.style.ClickableSpan
import android.view.View
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.petrs.rediexpress_session1.R
import com.petrs.rediexpress_session1.databinding.FragmentSignInBinding
import com.petrs.rediexpress_session1.ui.activity.main.MainActivity
import com.petrs.rediexpress_session1.ui.base.BaseFragment
import com.petrs.rediexpress_session1.ui.base.error_dialog.ErrorDialog
import com.petrs.rediexpress_session1.ui.base.error_dialog.ErrorDialogParams
import org.koin.androidx.viewmodel.ext.android.viewModel

class SignInFragment : BaseFragment<FragmentSignInBinding, SignInViewModel>(
    FragmentSignInBinding::inflate
) {
    override val viewModel: SignInViewModel by viewModel()

    override fun initView() {
        binding.apply {
            val spannableString = SpannableString(getString(R.string.text_don_t_have_an_account_sign_up))
            val clickableSpan = object : ClickableSpan() {
                override fun onClick(widget: View) {
                    findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
                }

                override fun updateDrawState(ds: TextPaint) {
                    super.updateDrawState(ds)

                    ds.color = ContextCompat.getColor(requireContext(), R.color.colorPrimary)
                    ds.isUnderlineText = false
                }
            }
            spannableString.setSpan(clickableSpan, 22, spannableString.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
            tvDontHaveAnAccount.movementMethod = LinkMovementMethod()
            tvDontHaveAnAccount.text = spannableString

            tvForgotPassword.setOnClickListener {
                findNavController().navigate(R.id.action_signInFragment_to_forgotPasswordFragment)
            }

            btnSignIn.setOnClickListener {
                if (viewModel.checkEmail(etEmail.text.toString())) {
                    //TODO checkAuthData
                    startMainActivity()
                } else {
                    val dialog =
                        ErrorDialog.getInstance(ErrorDialogParams("Некорректный адрес электронной почты"))
                    dialog.show(childFragmentManager, ErrorDialog.TAG)
                }
            }

            btnViewPassword.setOnClickListener {
                if (etPassword.transformationMethod != null)
                    etPassword.transformationMethod = null
                else
                    etPassword.transformationMethod = PasswordTransformationMethod()
            }

            btnGoogle.setOnClickListener {
                //TODO google authorization
            }
        }
    }

    override fun observeViewModel() {
        viewModel.apply {

        }
    }

    private fun startMainActivity() {
        val i = Intent(requireContext(), MainActivity::class.java)
        startActivity(i)
    }


}