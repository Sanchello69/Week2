package com.vas.week2

import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.vas.week2.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var binding: FragmentSecondBinding? = null
    private var alertDialog: AlertDialog? = null

    override fun onAttach(context: Context) {
        Log.d("fragment2", "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("fragment2", "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("fragment2", "onCreateView")

        binding = FragmentSecondBinding.inflate(inflater, container, false)

        createAlertDialog()
        binding?.buttonTapAlertDialog?.setOnClickListener {
            startAlertDialog()
        }

        return binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("fragment2", "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("fragment2", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("fragment2", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("fragment2", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("fragment2", "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("fragment2", "onDestroyView")
        binding = null
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("fragment2", "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("fragment2", "onDetach")
        super.onDetach()
    }

    fun startAlertDialog(){
        alertDialog?.show()
    }

    fun createAlertDialog(){
        alertDialog = activity?.let {
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