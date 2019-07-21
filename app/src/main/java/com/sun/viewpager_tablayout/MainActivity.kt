package com.sun.viewpager_tablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var data = listOf<Fragment>(OneFragment(), TwoFragment(), ThreeFragment())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Using viewpager 1
        //viewPager.adapter = ViewPagerAdapter1()

        //using viewpager2
        // viewPager.adapter = ViewPagerAdapter()
        //viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        //adapter fragment
        val mAdapter = ViewStatePagerAdapter(supportFragmentManager)
        mAdapter.submitData(data)
        viewPager.adapter = mAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}
