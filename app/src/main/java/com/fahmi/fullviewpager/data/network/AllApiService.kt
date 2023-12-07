package com.fahmi.fullviewpager.data.network

import com.fahmi.fullviewpager.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface AllApiService {
    @GET("/antara/terbaru")
    fun getAntaraTerbaruList(): Call<NewsResponse>

    @GET("/antara/politik")
    fun getAntaraPolitikList(): Call<NewsResponse>

    @GET("/antara/ekonomi")
    fun getAntaraEkonomiList(): Call<NewsResponse>

    @GET("/cnbc/terbaru/")
    fun getCnbcTerbaruList(): Call<NewsResponse>

    @GET("/cnbc/news/")
    fun getCnbcNewsList(): Call<NewsResponse>

    @GET("/cnbc/market/")
    fun getCnbcMarketList(): Call<NewsResponse>

    @GET("/cnn/terbaru/")
    fun getCnnTerbaruList(): Call<NewsResponse>

    @GET("/cnn/nasional/")
    fun getCnnNasionalList(): Call<NewsResponse>

    @GET("/cnn/internasional/")
    fun getCnnInternasionalList(): Call<NewsResponse>

}