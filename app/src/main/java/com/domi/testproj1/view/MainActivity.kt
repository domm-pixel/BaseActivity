package com.domi.testproj1.view

import android.os.Bundle
import android.os.PersistableBundle
import com.domi.testproj1.R
import com.domi.testproj1.databinding.ActivityMainBinding
import com.domi.testproj1.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding.apply {
            tvTest1.text = "test1234"
        }
    }
}