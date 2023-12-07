package com.fahmi.fullviewpager.ui.detailCnn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fahmi.fullviewpager.R
import com.fahmi.fullviewpager.adapter.NewsAdapter
import com.fahmi.fullviewpager.data.repository.NewsRepository
import com.fahmi.fullviewpager.databinding.FragmentCnnInternasionalBinding
import com.fahmi.fullviewpager.ui.NewsViewModel
import com.fahmi.fullviewpager.utils.NewsViewModelFactory

class CnnInternasionalFragment : Fragment() {
    lateinit var binding: FragmentCnnInternasionalBinding
    private val cnnInternasional: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCnnInternasionalBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()


        cnnInternasional.getCnnInternasionalNews()


        cnnInternasional.cnnNews.observe(viewLifecycleOwner) { dataNews ->
            dataNews?.data?.let { mAdapter.setData(it.posts) }
        }


            binding.rvCommonNews.apply {
                adapter = mAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }
        }
    }