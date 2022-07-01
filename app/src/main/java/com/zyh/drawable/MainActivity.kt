package com.zyh.drawable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.logging.Level

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.drawableBitmap).setOnClickListener {
            startActivity(Intent(this, BitmapDrawableActivity::class.java))
        }
        findViewById<Button>(R.id.shapeDrawable).setOnClickListener {
            startActivity(Intent(this, ShapeDrawableActivity::class.java))
        }
        findViewById<Button>(R.id.layerDrawable).setOnClickListener {
            startActivity(Intent(this, LayerDrawableActivity::class.java))
        }
        findViewById<Button>(R.id.stateListDrawable).setOnClickListener {
            startActivity(Intent(this, StateListDrawableActivity::class.java))
        }
        findViewById<Button>(R.id.levelListDrawable).setOnClickListener {
            startActivity(Intent(this, LevelListDrawableActivity::class.java))
        }
        findViewById<Button>(R.id.transitionDrawable).setOnClickListener {
            startActivity(Intent(this, TransitionDrawableActivity::class.java))
        }
        findViewById<Button>(R.id.clipDrawable).setOnClickListener {
            startActivity(Intent(this, ClipDrawableActivity::class.java))
        }
    }
}