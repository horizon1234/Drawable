package com.zyh.drawable

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.drawable.Drawable

class CustomDrawable(val color: Int) : Drawable(){

    private var mPaint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)

    init {
        mPaint.color = color
    }

    override fun draw(canvas: Canvas) {
        val rect = bounds
        val centerX = rect.exactCenterX()
        val centerY = rect.exactCenterY()
        canvas.drawCircle(centerX,centerY, centerX.coerceAtMost(centerY),mPaint)
    }

    override fun setAlpha(alpha: Int) {
        mPaint.alpha = alpha
        invalidateSelf()
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        mPaint.colorFilter = colorFilter
        invalidateSelf()
    }

    override fun getOpacity(): Int {
        return PixelFormat.TRANSLUCENT
    }
}