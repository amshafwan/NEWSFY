package com.fahmi.fullviewpager.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.fahmi.fullviewpager.data.model.NewsResponse
import com.fahmi.fullviewpager.data.repository.NewsRepository

class NewsViewModel(private val repository: NewsRepository) : ViewModel() {
    val antaraNews: LiveData<NewsResponse> = repository.antaraNews
    val cnbcNews: LiveData<NewsResponse> = repository.cnbcNews
    val cnnNews: LiveData<NewsResponse> = repository.cnnNews

    fun getAntaraTerbaruNews() {
        repository.getAntaraTerbaruNews()
    }

    fun getAntaraPolitikNews() {
        repository.getAntaraPolitikNews()
    }

    fun getAntaraEkonomiNews() {
        repository.getAntaraEkonomiNews()
    }

    fun getCnbcTerbaruNews()
    {
        repository.getCnbcTerbaruNews()
    }

    fun getCnbcNews()
    {
        repository.getCnbcNews()
    }

    fun getCnbcMarketNews()
    {
        repository.getCnbcMarketNews()
    }

    fun getCnnTerbaruNews()
    {
        repository.getCnnTerbaruNews()
    }

    fun getCnnNasionalNews()
    {
        repository.getCnnNasionalNews()
    }

    fun getCnnInternasionalNews()
    {
        repository.getCnnInternasionalNews()
    }

}