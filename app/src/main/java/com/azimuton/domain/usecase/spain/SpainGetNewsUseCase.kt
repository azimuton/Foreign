package com.azimuton.domain.usecase.spain

import com.azimuton.domain.repository.networkrepository.spain.SpainNetworkRepository

class SpainGetNewsUseCase(private val spainNetworkRepository: SpainNetworkRepository) {
    fun execute() {
        spainNetworkRepository.getNews()
    }
}