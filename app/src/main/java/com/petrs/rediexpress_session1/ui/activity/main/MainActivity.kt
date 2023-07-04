package com.petrs.rediexpress_session1.ui.activity.main

import com.petrs.rediexpress_session1.databinding.ActivityMainBinding
import com.petrs.rediexpress_session1.ui.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    ActivityMainBinding::inflate
) {
    override val viewModel: MainViewModel by viewModel()

    override fun initView() {}

    override fun observeViewModel() {}

}