package com.fahmi.fullviewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.fahmi.fullviewpager.ui.detailAntara.AntaraEkonomiFragment
import com.fahmi.fullviewpager.ui.detailAntara.AntaraPolitikFragment
import com.fahmi.fullviewpager.ui.detailAntara.AntaraTerbaruFragment
import com.fahmi.fullviewpager.ui.home.AntaraFragment
import com.fahmi.fullviewpager.ui.home.CnbcFragment
import com.fahmi.fullviewpager.ui.home.CnnFragment

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
