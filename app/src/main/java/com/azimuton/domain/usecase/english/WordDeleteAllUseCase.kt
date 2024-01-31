package com.azimuton.domain.usecase.english

import com.azimuton.domain.repository.roomrepository.english.WordRepository

class WordDeleteAllUseCase (private val wordRepository: WordRepository) {
    fun execute(){
        wordRepository.deleteAll()
    }
}