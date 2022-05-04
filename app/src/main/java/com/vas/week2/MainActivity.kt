package com.vas.week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.vas.week2.databinding.ActivityMainBinding

/**
 * Жизненный цикл - это серия обратных вызовов, выполняемых в определенном порядке при изменении
 * статуса активити или фрагмента.
 * Жизненный цикл важен потому что определенные действия должны выполняться при нахождении активити
 * или фрагмента в определенном состоянии.
 * Примеры: настройка макета активности в onCreate(),
 * очистка ресурсов активности в onDestroy(),
 * включение чтения местоположения в onStart() - GoogleMaps,
 * останавливать ресурсоемкие задачи в onPause() - остановка видео в вк.
 */

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("activity1", "onCreate")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.buttonTransition?.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun onStart() {
        Log.d("activity1", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("activity1", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("activity1", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("activity1", "onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.d("activity1", "onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        binding = null
        Log.d("activity1", "onDestroy")
        super.onDestroy()
    }
}