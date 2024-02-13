package com.azimuton.domain.usecase.spain

import com.azimuton.domain.repository.roomrepository.spain.SpainWordRepository

class SpainWordDeleteAllUseCase (private val wordSpainRepository: SpainWordRepository) {
    suspend fun execute(){
        wordSpainRepository.deleteAll()
    }
}