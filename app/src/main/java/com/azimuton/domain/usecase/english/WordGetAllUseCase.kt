package com.azimuton.domain.usecase.english

import com.azimuton.domain.models.english.Word
import com.azimuton.domain.repository.roomrepository.english.WordRepository

class WordGetAllUseCase(private val wordRepository: WordRepository) {
    fun execute(): List<Word>{
        return wordRepository.getAll()
    }
}