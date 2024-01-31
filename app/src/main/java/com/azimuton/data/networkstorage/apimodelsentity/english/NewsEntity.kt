package com.azimuton.data.networkstorage.apimodelsentity.english

data class NewsEntity(
    val nextPage: String,
    val resultEntities: List<ResultEntity>,
    val status: String,
    val totalResults: Int
)