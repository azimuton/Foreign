package com.azimuton.data.mappers.networkmapper.remote.spain

import com.azimuton.data.mappers.networkmapper.Mapper
import com.azimuton.data.networkstorage.apimodelsentity.spain.NewsSpainEntity

class SpainNewsEntityMapper : Mapper<NewsSpainEntity, com.azimuton.domain.apimodels.spain.News> {

    override fun mapFromEntity(type: NewsSpainEntity): com.azimuton.domain.apimodels.spain.News =
        com.azimuton.domain.apimodels.spain.News(
            articles = type.articlesEntities,
            status = type.status,
            totalResults = type.totalResults
        )
}