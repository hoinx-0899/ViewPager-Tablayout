package com.sun.viewpager_tablayout
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sun.viewpager_tablayout.R

class OneFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("ONE-FRAGMENT","onAttach")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ONE-FRAGMENT","onCreate")

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("ONE-FRAGMENT","onCreateView")

        return inflater.inflate(R.layout.fragment_one,container,false)
    }

    fun doSomething(){

        val fragmentManager=childFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("ONE-FRAGMENT","onActivityCreated")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("ONE-FRAGMENT","onViewCreated")

    }

    override fun onStart() {
        super.onStart()
        Log.d("ONE-FRAGMENT","onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("ONE-FRAGMENT","onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("ONE-FRAGMENT","onPause")


    }

    override fun onStop() {
        super.onStop()
        Log.d("ONE-FRAGMENT","onStop")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("ONE-FRAGMENT","onDestroyView")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ONE-FRAGMENT","onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d("ONE-FRAGMENT","onDetach")

    }


}