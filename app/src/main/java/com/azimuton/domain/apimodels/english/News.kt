package com.azimuton.domain.apimodels.english

data class News(
    val nextPage: String,
    val results: List<Result>,
    val status: String,
    val totalResults: Int
)