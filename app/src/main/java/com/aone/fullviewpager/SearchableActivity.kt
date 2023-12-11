package com.aone.fullviewpager

import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import com.aone.fullviewpager.data.repository.NewsRepository
import com.aone.fullviewpager.databinding.ActivitySearchableBinding
import com.aone.fullviewpager.ui.NewsViewModel
import com.aone.fullviewpager.utils.NewsViewModelFactory

class SearchableActivity : AppCompatActivity() {

    lateinit var binding: ActivitySearchableBinding
    private val searchViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }

    private var querySearch: String? = null


}