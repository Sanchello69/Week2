package com.vas.week2

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.vas.week2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private var binding: ActivitySecondBinding? = null
    private var alertDialog: AlertDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("activity2", "onCreate")

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        createAlertDialog()

        binding?.buttonFragment?.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }

        binding?.buttonTapAlertDialog?.setOnClickListener {
            startAlertDialog()
        }
    }

    override fun onStart() {
        Log.d("activity2", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("activity2", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("activity2", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("activity2", "onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.d("activity2", "onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        binding = null
        alertDialog = null
        Log.d("activity2", "onDestroy")
        super.onDestroy()
    }

    fun startAlertDialog(){
        alertDialog?.show()
    }

    fun createAlertDialog(){
        alertDialog = let {
            val builder = AlertDialog.Builder(it)
            builder.apply {
                setTitle("Click please!")
                setPositiveButton("ok",
                    DialogInterface.OnClickListener { _, _ ->
                        Toast.makeText(context, "Click tap ok", Toast.LENGTH_SHORT).show()
                    })
                setNegativeButton("cancel",
                    DialogInterface.OnClickListener { _, _ ->
                        Toast.makeText(context, "Click tap cancel", Toast.LENGTH_SHORT).show()
                    })
            }
            builder.create()
        }
    }
}