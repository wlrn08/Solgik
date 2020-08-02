package com.example.solgikb.ui.main

import com.example.solgikb.R
import com.example.solgikb.BR
import com.example.solgikb.databinding.ActivityMainBinding
import com.example.solgikb.ui.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity: BaseActivity<ActivityMainBinding, MainViewModel>() {
    override val layoutResId: Int get() = R.layout.activity_main
    override val viewModel: MainViewModel by viewModel()
    override val bindingVariable: Int get() = BR.vm

    override fun initView() {

    }

}