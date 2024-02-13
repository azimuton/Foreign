package com.azimuton.domain.usecase.spain

import com.azimuton.domain.repository.roomrepository.spain.SpainWordRepository

class SpainWordCopyIdUseCase (private val wordSpainRepository: SpainWordRepository) {
    suspend fun execute(id : Int){
        wordSpainRepository.copyId(id)
    }
}