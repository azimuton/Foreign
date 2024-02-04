package com.azimuton.data.networkstorage.apimodelsentity.spain

import com.azimuton.domain.apimodels.spain.Source

class ArticleEntity (
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
)