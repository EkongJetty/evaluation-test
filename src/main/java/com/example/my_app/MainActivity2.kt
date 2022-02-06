package com.example.my_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.handleCoroutineException

class MainActivity2 : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long = 5000 // 1sec


    @InternalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        Handler()
            .postDelayed(

                }
            )
    }
}