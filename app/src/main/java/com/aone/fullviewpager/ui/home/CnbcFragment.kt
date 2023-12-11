package com.aone.fullviewpager.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aone.fullviewpager.adapter.SectionPagerCnbcAdapter
import com.aone.fullviewpager.databinding.FragmentCnbcBinding
import com.google.android.material.tabs.TabLayoutMediator

class CnbcFragment : Fragment() {

    lateinit var binding: FragmentCnbcBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCnbcBinding.inflate(layoutInflater)
        setUpViewPager()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun setUpViewPager() {
        val tabList = arrayOf(
            "Terbaru",
            "News",
            "Market",
        )

        val sectionPagerAdapter = SectionPagerCnbcAdapter(requireActivity())
        binding.vpNews.adapter = sectionPagerAdapter

        TabLayoutMediator(binding.tabs, binding.vpNews) { tab, page ->
            tab.text = tabList[page]
        }.attach()
    }

}