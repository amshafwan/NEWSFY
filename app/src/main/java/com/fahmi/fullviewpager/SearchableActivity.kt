package com.fahmi.fullviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fahmi.fullviewpager.data.repository.NewsRepository
import com.fahmi.fullviewpager.databinding.ActivitySearchableBinding
import com.fahmi.fullviewpager.ui.NewsViewModel
import com.fahmi.fullviewpager.utils.NewsViewModelFactory

class SearchableActivity : AppCompatActivity() {

    lateinit var binding: ActivitySearchableBinding
    private val searchViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }

    private var querySearch: String? = null


}