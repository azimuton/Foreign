package com.azimuton.domain.usecase.english

import com.azimuton.domain.repository.roomrepository.english.WordRepository

class WordCopyIdUseCase (private val wordRepository: WordRepository) {
    suspend fun execute(id : Int){
        wordRepository.copyId(id)
    }
}