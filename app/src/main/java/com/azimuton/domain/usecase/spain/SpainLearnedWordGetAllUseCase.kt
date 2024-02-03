package com.azimuton.domain.usecase.spain

import com.azimuton.domain.models.spain.LearnedSpainWord
import com.azimuton.domain.repository.roomrepository.spain.SpainLearnedWordsRepository

class SpainLearnedWordGetAllUseCase (private val learnedSpainWordsRepository: SpainLearnedWordsRepository) {
    fun execute(): List<LearnedSpainWord>{
        return learnedSpainWordsRepository.getAll()
    }
}