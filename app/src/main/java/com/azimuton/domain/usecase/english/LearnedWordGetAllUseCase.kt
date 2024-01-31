package com.azimuton.domain.usecase.english

import com.azimuton.domain.models.english.LearnedWord
import com.azimuton.domain.repository.roomrepository.english.LearnedWordsRepository

class LearnedWordGetAllUseCase(private val learnedWordsRepository: LearnedWordsRepository) {
    fun execute(): List<LearnedWord>{
        return learnedWordsRepository.getAll()
    }
}