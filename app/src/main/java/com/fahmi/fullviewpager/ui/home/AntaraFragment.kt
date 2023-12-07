package com.fahmi.fullviewpager.ui.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.fahmi.fullviewpager.R
import com.fahmi.fullviewpager.adapter.SectionPagerAdapter
import com.fahmi.fullviewpager.databinding.FragmentAntaraBinding
import com.google.android.material.tabs.TabLayoutMediator

class AntaraFragment : Fragment() {
    lateinit var  binding: FragmentAntaraBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAntaraBinding.inflate(inflater, container, false)
        setUpViewPager()
        return binding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setUpViewPager() {
        val tabList = arrayOf(
            "Terbaru",
            "Politik",
            "Ekonomi",
        )

        val sectionPagerAdapter = SectionPagerAdapter(requireActivity())
        binding.vpNews.adapter = sectionPagerAdapter

        TabLayoutMediator(binding.tabs, binding.vpNews) { tab, page ->
            tab.text = tabList[page]
        }.attach()
    }

    private fun setSupportActionBar(toolbar: androidx.appcompat.widget.Toolbar) {
        // Assuming you have an AppCompatActivity
        (requireActivity() as AppCompatActivity).setSupportActionBar(toolbar)
    }


    }



