package com.azimuton.domain.usecase.english

import com.azimuton.domain.repository.networkrepository.english.NetworkRepository

class GetNewsUseCase (private val networkRepository: NetworkRepository) {
    fun execute() {
        networkRepository.getNews()
    }
}