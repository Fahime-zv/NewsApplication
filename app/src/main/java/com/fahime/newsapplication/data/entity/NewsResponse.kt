package com.fahime.newsapplication.data.entity


data class NewsResponse(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>,
)

data class Article(
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImage: String?="https://www.hollywoodreporter.com/wp-content/uploads/2023/12/170130_0023-H-2023.jpg?w=1296&h=730&crop=1&resize=681%2C383",
    val publisherAt: String?,
    val content: String?,
    val source: Source?
)
data class Source(
    val id:String?,
    val name:String?
)