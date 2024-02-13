package com.azimuton.domain.usecase.spain

import com.azimuton.domain.repository.roomrepository.spain.SpainLearnedWordsRepository

class SpainLearnedWordRandomUseCase (private val learnedSpainWordsRepository: SpainLearnedWordsRepository) {
    suspend fun execute(){
        learnedSpainWordsRepository.randoms()
    }
}