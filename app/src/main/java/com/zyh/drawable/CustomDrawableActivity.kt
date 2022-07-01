package com.zyh.drawable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_custom_drawable.*

class CustomDrawableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_drawable)

        val customDrawable = CustomDrawable(resources.getColor(R.color.blue))
        customBg.background = customDrawable
    }
}