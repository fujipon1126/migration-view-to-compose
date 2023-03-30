package com.example.migration_view_to_compose.ui.sub5

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.MotionEvent.INVALID_POINTER_ID
import android.view.ScaleGestureDetector
import androidx.appcompat.widget.AppCompatEditText


class CustomEditText : AppCompatEditText {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    private var mScaleFactor = 1f

    private val scaleListener = object : ScaleGestureDetector.SimpleOnScaleGestureListener() {

        override fun onScale(detector: ScaleGestureDetector): Boolean {
            mScaleFactor *= detector.scaleFactor

            // Don't let the object get too small or too large.
            mScaleFactor = 0.1f.coerceAtLeast(mScaleFactor.coerceAtMost(5.0f))

            scaleX = mScaleFactor
            scaleY = mScaleFactor

            invalidate()
            return true
        }
    }

    private val mScaleDetector = ScaleGestureDetector(context, scaleListener)

    override fun onTouchEvent(event: MotionEvent): Boolean {
        mScaleDetector.onTouchEvent(event)
        return true
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas?.apply {
            save()
            scale(mScaleFactor, mScaleFactor)
            // onDraw() code goes here
            restore()
        }
    }
}