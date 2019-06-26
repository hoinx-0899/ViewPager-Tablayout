package com.sun.viewpager_tablayout
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sun.viewpager_tablayout.MainActivity
import com.sun.viewpager_tablayout.R
import kotlinx.android.synthetic.main.fragment_three.*

class ThreeFragment :Fragment(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Three-FRAGMENT","onCreate")

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("Three-FRAGMENT","onCreateView")

        return inflater.inflate(R.layout.fragment_three,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Three-FRAGMENT","onActivityCreated")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Three-FRAGMENT","onViewCreated")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Three-FRAGMENT","onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Three-FRAGMENT","onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Three-FRAGMENT","onPause")


    }

    override fun onStop() {
        super.onStop()
        Log.d("Three-FRAGMENT","onStop")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Three-FRAGMENT","onDestroyView")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Three-FRAGMENT","onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Three-FRAGMENT","onDetach")

    }
}