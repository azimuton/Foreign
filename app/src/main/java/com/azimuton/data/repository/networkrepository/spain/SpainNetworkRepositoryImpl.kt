package com.azimuton.data.repository.networkrepository.spain

import com.azimuton.data.networkstorage.apimodelsentity.english.NewsDataSource
import com.azimuton.data.networkstorage.apimodelsentity.spain.SpainNewsDataSource
import com.azimuton.domain.repository.networkrepository.spain.SpainNetworkRepository

class SpainNetworkRepositoryImpl( private val spainNewsDataSource : SpainNewsDataSource) :
    SpainNetworkRepository {
    override  fun getNews() {
        spainNewsDataSource.getSpainNews()
    }
}