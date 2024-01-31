package com.azimuton.domain.usecase.english

import com.azimuton.domain.models.english.LearnedWord
import com.azimuton.domain.repository.roomrepository.english.LearnedWordsRepository

class LearnedWordInsertUseCase ( private val learnedWordsRepository: LearnedWordsRepository) {
    suspend fun execute(learnedWord: LearnedWord){
        return learnedWordsRepository.insertLearnedWord(learnedWord)
    }
}