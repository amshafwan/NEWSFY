package com.aone.fullviewpager.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aone.fullviewpager.data.repository.NewsRepository
import com.aone.fullviewpager.ui.NewsViewModel

class NewsViewModelFactory(private val repository: NewsRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NewsViewModel::class.java)){
            return NewsViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}