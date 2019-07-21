package com.sun.viewpager_tablayout
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sun.viewpager_tablayout.MainActivity
import com.sun.viewpager_tablayout.R
import kotlinx.android.synthetic.main.fragment_three.*

class FourFragment :Fragment(){

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Four-FRAGMENT","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Four-FRAGMENT","onCreate")

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("Four-FRAGMENT","onCreateView")

        return inflater.inflate(R.layout.fragment_three,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Four-FRAGMENT","onActivityCreated")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Four-FRAGMENT","onViewCreated")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Four-FRAGMENT","onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Four-FRAGMENT","onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Four-FRAGMENT","onPause")


    }

    override fun onStop() {
        super.onStop()
        Log.d("Four-FRAGMENT","onStop")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Four-FRAGMENT","onDestroyView")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Four-FRAGMENT","onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Four-FRAGMENT","onDetach")

    }
}