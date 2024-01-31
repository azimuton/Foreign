package com.azimuton.domain.usecase.english

import com.azimuton.domain.models.english.Word
import com.azimuton.domain.repository.roomrepository.english.WordRepository

class WordGetWordByIdUseCase(private val wordRepository: WordRepository) {
    fun execute(id : Int) : Word? {
        return wordRepository.getWordById(id = id)
    }
}