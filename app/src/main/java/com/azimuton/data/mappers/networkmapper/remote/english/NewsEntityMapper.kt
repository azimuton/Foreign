package com.azimuton.data.mappers.networkmapper.remote.english

import com.azimuton.data.mappers.networkmapper.Mapper
import com.azimuton.data.networkstorage.apimodelsentity.english.NewsEntity
import com.azimuton.domain.apimodels.english.News

class NewsEntityMapper : Mapper<NewsEntity, News> {

    override fun mapFromEntity(type: NewsEntity): News =
        News(
            nextPage = type.nextPage,
            results = ResultEntityMapper().mapFromEntity(type.resultEntities),
            status = type.status,
            totalResults = type.totalResults
        )
}