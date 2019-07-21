package com.sun.viewpager_tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewStatePagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    private var data = emptyList<Fragment>()

    fun submitData(list: List<Fragment>) {
        data = list
        notifyDataSetChanged()
    }

    override fun getItem(position: Int): Fragment = data[position]

    override fun getCount(): Int = data.size

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0-> "Title 1"
            1-> "Title 2"
            2->"Title 3"
            else-> "Title 4"
        }
    }

}