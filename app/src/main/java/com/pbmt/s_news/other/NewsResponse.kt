package com.pbmt.s_news.other

import com.pbmt.s_news.other.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)