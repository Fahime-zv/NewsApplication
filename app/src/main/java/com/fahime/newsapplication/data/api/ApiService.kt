package com.fahime.newsapplication.data.api

import com.fahime.newsapplication.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
   suspend fun getNewsHeadLine(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "a94bda251bd8490d850b92a43620ea79",
    ): Response<NewsResponse>
}