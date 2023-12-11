package com.aone.fullviewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.aone.fullviewpager.ui.detailAntara.AntaraEkonomiFragment
import com.aone.fullviewpager.ui.detailAntara.AntaraPolitikFragment
import com.aone.fullviewpager.ui.detailAntara.AntaraTerbaruFragment

class SectionPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AntaraTerbaruFragment()
            1 -> AntaraPolitikFragment()
            2 -> AntaraEkonomiFragment()
            else -> AntaraTerbaruFragment()
        }
    }
}
