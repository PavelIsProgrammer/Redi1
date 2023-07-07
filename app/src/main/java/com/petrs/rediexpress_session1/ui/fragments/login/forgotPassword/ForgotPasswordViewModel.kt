package com.petrs.rediexpress_session1.ui.fragments.login.forgotPassword

import android.text.TextUtils
import androidx.lifecycle.ViewModel

class ForgotPasswordViewModel : ViewModel() {

    fun checkEmail(email: String): Boolean {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}