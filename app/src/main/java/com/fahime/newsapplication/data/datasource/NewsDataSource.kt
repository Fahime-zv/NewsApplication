package com.fahime.newsapplication.data.datasource

import com.fahime.newsapplication.data.api.ApiService
import com.fahime.newsapplication.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

interface NewsDataSource {

    suspend fun getNewsHeadline(country: String): Response<NewsResponse>
}

class NewsDataSourceImpl @Inject constructor(
    private val apiService: ApiService,
) : NewsDataSource {

    override suspend fun getNewsHeadline(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadLine(country)
    }


}