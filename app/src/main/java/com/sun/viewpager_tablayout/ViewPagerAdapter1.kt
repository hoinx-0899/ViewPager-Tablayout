package com.sun.viewpager_tablayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.item_page.view.*

class ViewPagerAdapter1 : PagerAdapter() {

    override fun isViewFromObject(view: View, objectss: Any): Boolean = view == objectss

    override fun getCount(): Int = colors.size

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(container.context)
        val itemView = inflater.inflate(R.layout.item_page, container, false)
        itemView.run {
            tvTitle.text = "item $position"
            container.setBackgroundResource(colors[position])
        }
        return itemView
    }

    private val colors = intArrayOf(
            android.R.color.black,
            android.R.color.holo_red_light,
            android.R.color.holo_blue_dark,
            android.R.color.holo_purple
    )


}

