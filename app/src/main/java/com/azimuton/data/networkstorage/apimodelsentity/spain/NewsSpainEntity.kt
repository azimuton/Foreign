package com.azimuton.data.networkstorage.apimodelsentity.spain

import com.azimuton.domain.apimodels.spain.Article

class NewsSpainEntity (
    val articlesEntities: List<Article>,
    val status: String,
    val totalResults: Int
)