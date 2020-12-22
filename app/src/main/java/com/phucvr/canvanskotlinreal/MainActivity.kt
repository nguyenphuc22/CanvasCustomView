package com.phucvr.canvanskotlinreal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var myCanvas: MyCanvas

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myCanvas = MyCanvas(this)
        setContentView(myCanvas)
    }
}