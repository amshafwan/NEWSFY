package com.aone.fullviewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.aone.fullviewpager.ui.detailCnbc.CnbcMarketFragment
import com.aone.fullviewpager.ui.detailCnbc.CnbcNewsFragment
import com.aone.fullviewpager.ui.detailCnbc.CnbcTerbaruFragment

class SectionPagerCnbcAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CnbcTerbaruFragment()
            1 -> CnbcNewsFragment()
            2 -> CnbcMarketFragment()
            else -> CnbcTerbaruFragment()
        }
    }
}