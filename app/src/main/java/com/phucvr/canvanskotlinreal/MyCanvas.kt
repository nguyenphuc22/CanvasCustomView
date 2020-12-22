package com.phucvr.canvanskotlinreal

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.MotionEvent
import android.view.View

class MyCanvas(context: Context?) : View(context) {

    lateinit var rect: Rect
    lateinit var paint: Paint
    var xPos = 0f
    var yPos = 0f
    var xPos1 = 0f
    var yPos1 = 0f
    var xPos2 = 0f
    var yPos2 = 0f
    var point = 1
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        rect = Rect(300,400,500,600)
        paint = Paint()
        paint.setColor(Color.GREEN)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 10f
        // let's change Circle
        canvas?.drawCircle(xPos,yPos,100f,paint)

        // Draw Line
        //if (point == 2) {
        //    canvas?.drawLine(xPos1,yPos1,xPos2,yPos2,paint)
        //}
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        /*
        if (point == 1) {
            xPos1 = event!!.x
            yPos1 = event!!.y
            point = 2
        } else {
            xPos2 = event!!.x
            yPos2 = event!!.y
            point = 1
        }
        */
        xPos = event!!.x
        yPos = event!!.y
        
        invalidate()
        return super.onTouchEvent(event)
    }

}