package com.azimuton.domain.apimodels.spain

data class News(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)