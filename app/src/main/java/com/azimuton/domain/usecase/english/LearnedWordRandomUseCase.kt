package com.azimuton.domain.usecase.english

import com.azimuton.domain.repository.roomrepository.english.LearnedWordsRepository

class LearnedWordRandomUseCase(private val learnedWordsRepository: LearnedWordsRepository) {
    suspend fun execute(){
        learnedWordsRepository.randoms()
    }
}