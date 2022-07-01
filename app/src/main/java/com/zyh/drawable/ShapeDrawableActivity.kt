package com.zyh.drawable

import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_shape_drawable.*

class ShapeDrawableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shape_drawable)
    }

    override fun onResume() {
        super.onResume()
        gradientView2.post {
            val gradientDrawable = gradientView2.background as GradientDrawable
            gradientDrawable.gradientRadius = gradientView2.width / 2F
        }
    }

}