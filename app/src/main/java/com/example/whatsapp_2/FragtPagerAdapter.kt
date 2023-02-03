package com.example.whatsapp_2

import android.os.Parcel
import android.os.Parcelable
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter

class FragtPagerAdapter(fm: FragmentManager, frags: Array<Fragment>, title: Array<String>): FragmentPagerAdapter(fm) {

    var frags=frags
    var title=title

    override fun getCount(): Int {
        return frags.size
    }

    override fun getItem(position: Int): Fragment {
        return frags.get(position)

    }
    override fun getPageTitle(position: Int): CharSequence {
        return title.get(position)


    }


}
