package com.azimuton.domain.usecase.spain

import com.azimuton.domain.repository.roomrepository.spain.SpainLearnedWordsRepository

class SpainLearnedWordRandomUseCase (private val learnedSpainWordsRepository: SpainLearnedWordsRepository) {
    fun execute(){
        learnedSpainWordsRepository.randoms()
    }
}