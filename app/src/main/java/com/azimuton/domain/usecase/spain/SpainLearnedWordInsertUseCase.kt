package com.azimuton.domain.usecase.spain

import com.azimuton.domain.models.spain.LearnedSpainWord
import com.azimuton.domain.repository.roomrepository.spain.SpainLearnedWordsRepository

class SpainLearnedWordInsertUseCase ( private val learnedSpainWordsRepository: SpainLearnedWordsRepository) {
    suspend fun execute(learnedSpainWord: LearnedSpainWord){
        return learnedSpainWordsRepository.insertLearnedSpainWord(learnedSpainWord)
    }
}