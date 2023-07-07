package com.petrs.rediexpress_session1.ui.fragments.login.signUp

import android.text.TextUtils
import androidx.lifecycle.ViewModel

class SignUpViewModel : ViewModel() {

    fun checkEmail(email: String): Boolean {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}