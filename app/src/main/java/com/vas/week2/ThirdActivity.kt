package com.vas.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        Log.d("activity3", "onCreate")

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, FirstFragment()).commit()
        }
    }

    override fun onStart() {
        Log.d("activity3", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("activity3", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("activity3", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("activity3", "onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.d("activity3", "onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d("activity3", "onDestroy")
        super.onDestroy()
    }
}