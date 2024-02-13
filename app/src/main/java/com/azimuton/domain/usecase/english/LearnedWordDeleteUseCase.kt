package com.azimuton.domain.usecase.english

import com.azimuton.domain.models.english.LearnedWord
import com.azimuton.domain.repository.roomrepository.english.LearnedWordsRepository

class LearnedWordDeleteUseCase ( private val learnedWordsRepository: LearnedWordsRepository) {
     suspend fun execute(learnedWord: LearnedWord){
        return learnedWordsRepository.deleteLearnedWord(learnedWord)
    }
}