package com.fahmi.fullviewpager.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.fahmi.fullviewpager.data.model.NewsResponse
import com.fahmi.fullviewpager.data.network.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository {
    private val _antaraNews = MutableLiveData<NewsResponse>()
    val antaraNews: LiveData<NewsResponse> = _antaraNews
    private val _cnbcNews = MutableLiveData<NewsResponse>()
    val cnbcNews: LiveData<NewsResponse> = _cnbcNews
    private val _cnnNews = MutableLiveData<NewsResponse>()
    val cnnNews: LiveData<NewsResponse> = _cnnNews
    private val _searchNews = MutableLiveData<NewsResponse>()
    val searchNews: LiveData<NewsResponse> = _searchNews

//    ANTARA NEWS

    fun getAntaraTerbaruNews() {
        ApiConfig.getAllService.getAntaraTerbaruList()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _antaraNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getAntaraPolitikNews() {
        ApiConfig.getAllService.getAntaraPolitikList()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _antaraNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getAntaraEkonomiNews() {
        ApiConfig.getAllService.getAntaraEkonomiList()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _antaraNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

//    CNBC NEWS

    fun getCnbcTerbaruNews() {
        ApiConfig.getAllService.getCnbcTerbaruList()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _cnbcNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getCnbcNews() {
        ApiConfig.getAllService.getCnbcNewsList()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _cnbcNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getCnbcMarketNews() {
        ApiConfig.getAllService.getCnbcMarketList()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _cnbcNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

//    CNN NEWS

    fun getCnnTerbaruNews() {
        ApiConfig.getAllService.getCnnTerbaruList()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _cnnNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getCnnNasionalNews() {
        ApiConfig.getAllService.getCnnNasionalList()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _cnnNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

    fun getCnnInternasionalNews() {
        ApiConfig.getAllService.getCnnInternasionalList()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _cnnNews.postValue(response.body())
                        }
                        else {
                            Log.e(
                                "Repository",
                                "onResponse: Call error with HTTP status code"
                                        + response.code()
                            )
                        }
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: "
                                + t.localizedMessage)
                }

            })
    }

}
