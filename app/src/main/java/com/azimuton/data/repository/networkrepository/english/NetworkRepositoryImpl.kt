package com.azimuton.data.repository.networkrepository.english

import com.azimuton.data.networkstorage.apimodelsentity.english.NewsDataSource
import com.azimuton.domain.repository.networkrepository.english.NetworkRepository

class NetworkRepositoryImpl( private val newsDataSource : NewsDataSource) : NetworkRepository {
    override  fun getNews() {
        newsDataSource.getNews()
    }
    }
