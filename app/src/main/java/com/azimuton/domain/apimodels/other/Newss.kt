package com.azimuton.domain.apimodels.other

data class Newss(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)