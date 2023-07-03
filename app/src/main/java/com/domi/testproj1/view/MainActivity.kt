package com.domi.testproj1.view

import com.domi.testproj1.R
import com.domi.testproj1.base.BaseActivity
import com.domi.testproj1.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onResume() {
        super.onResume()
        dataBinding.tvTest1.text = "testSample"
    }
}