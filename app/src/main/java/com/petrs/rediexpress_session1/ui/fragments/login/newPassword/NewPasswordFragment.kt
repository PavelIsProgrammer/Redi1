package com.petrs.rediexpress_session1.ui.fragments.login.newPassword

import android.content.Intent
import androidx.fragment.app.Fragment
import com.petrs.rediexpress_session1.databinding.FragmentNewPasswordBinding
import com.petrs.rediexpress_session1.ui.activity.main.MainActivity
import com.petrs.rediexpress_session1.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 * Use the [NewPasswordFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NewPasswordFragment : BaseFragment<FragmentNewPasswordBinding, NewPasswordViewModel>(
    FragmentNewPasswordBinding::inflate
) {
    override val viewModel: NewPasswordViewModel by viewModel()

    override fun initView() {
        binding.apply {
            btnLogIn.setOnClickListener {
                if (!etNewPassword.text.isNullOrBlank() && !etConfirmPassword.text.isNullOrBlank() && etNewPassword.text == etConfirmPassword.text) {
                    //TODO update password and login
                    startMainActivity()
                }
            }
        }
    }

    override fun observeViewModel() {
        binding.apply {

        }
    }

    private fun startMainActivity() {
        val i = Intent(requireContext(), MainActivity::class.java)
        startActivity(i)
    }
}