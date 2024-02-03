package com.azimuton.domain.usecase.spain

import com.azimuton.domain.models.spain.LearnedSpainWord
import com.azimuton.domain.repository.roomrepository.spain.SpainLearnedWordsRepository

class SpainLearnedWordDeleteUseCase ( private val spainLearnedWordsRepository: SpainLearnedWordsRepository) {
    fun execute(learnedSpainWord: LearnedSpainWord){
        return spainLearnedWordsRepository.deleteLearnedSpainWord(learnedSpainWord)
    }
}