package com.azimuton.domain.usecase.spain

import com.azimuton.domain.repository.roomrepository.spain.SpainWordRepository

class SpainWordCopyUseCase (private val wordSpainRepository: SpainWordRepository) {
    suspend fun execute(){
        wordSpainRepository.copy()
    }
}