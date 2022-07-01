package com.zyh.drawable

import android.graphics.drawable.LevelListDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_level_list_drawable.*
import java.util.*
import kotlin.random.Random

class LevelListDrawableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_list_drawable)
        startTimer()
    }

    var color = 0

    private fun startTimer(){
        val timeTask = object : TimerTask(){
            override fun run() {
                val level = color % 7
                runOnUiThread {
                    (levelListView.background as LevelListDrawable).level = level
                }
                color ++
            }
        }
        Timer().schedule(timeTask, Date(),300)
    }
}