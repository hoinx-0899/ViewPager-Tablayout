package com.sun.viewpager_tablayout

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sun.viewpager_tablayout.R

class TwoFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Two-FRAGMENT", "onCreate")

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("Two-FRAGMENT", "onCreateView")

        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Two-FRAGMENT", "onActivityCreated")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Two-FRAGMENT", "onViewCreated")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Two-FRAGMENT", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Two-FRAGMENT", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Two-FRAGMENT", "onPause")


    }

    override fun onStop() {
        super.onStop()
        Log.d("Two-FRAGMENT", "onStop")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Two-FRAGMENT", "onDestroyView")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Two-FRAGMENT", "onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Two-FRAGMENT", "onDetach")

    }

}