package com.vas.week2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vas.week2.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null

    override fun onAttach(context: Context) {
        Log.d("fragment1", "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("fragment1", "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("fragment1", "onCreateView")

        binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding?.buttonFragmentSecond?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, SecondFragment())
                .hide(this)
                .addToBackStack(null)
                .commit()
        }

        return binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("fragment1", "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("fragment1", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("fragment1", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("fragment1", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("fragment1", "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("fragment1", "onDestroyView")
        binding = null
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("fragment1", "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("fragment1", "onDetach")
        super.onDetach()
    }

}