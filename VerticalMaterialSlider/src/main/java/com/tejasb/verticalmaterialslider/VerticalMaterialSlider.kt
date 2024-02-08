package com.tejasb.verticalmaterialslider

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.core.content.ContextCompat
import com.google.android.material.slider.Slider

class VerticalMaterialSlider : Slider {

    constructor(context: Context) : super(context) {
        initView(context)
    }

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyle: Int,
    ) : super(context, attrs, defStyle) {
        initView(context)
    }

    constructor(
        context: Context,
        attrs: AttributeSet?,
    ) : super(context, attrs) {
        initView(context)
    }

    private fun initView(context: Context) {
        setCustomThumbDrawable(
            ContextCompat.getDrawable(
                context,
                R.drawable.vertical_progress_thumb
            )!!
        )
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(h, w, oldh, oldw)
    }

    @Synchronized
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(heightMeasureSpec, widthMeasureSpec)
        setMeasuredDimension(measuredHeight, measuredWidth)
    }

    override fun onDraw(c: Canvas) {
        c.rotate(-90f)
        c.translate(-height.toFloat(), 0f)
        super.onDraw(c)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (!isEnabled) {
            return false
        }
        when (event.action) {
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_MOVE, MotionEvent.ACTION_UP -> {
                value =
                    (valueTo - (valueTo * event.y / height).toInt()).coerceIn(valueFrom, valueTo)
                onSizeChanged(width, height, 0, 0)
            }

            MotionEvent.ACTION_CANCEL -> {
            }
        }
        return true
    }
}
