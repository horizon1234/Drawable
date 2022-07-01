package com.zyh.drawable

import android.graphics.drawable.TransitionDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_transition_drawable.*

class TransitionDrawableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition_drawable)

        change.setOnClickListener {
            val drawable = transitionDrawable.background as TransitionDrawable
            drawable.startTransition(1000)
        }
    }
}