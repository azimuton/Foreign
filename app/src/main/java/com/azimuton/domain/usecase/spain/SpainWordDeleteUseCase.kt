package com.azimuton.domain.usecase.spain

import com.azimuton.domain.models.spain.WordSpain
import com.azimuton.domain.repository.roomrepository.spain.SpainWordRepository

class SpainWordDeleteUseCase ( private val wordSpainRepository: SpainWordRepository) {
    suspend fun execute(wordSpain: WordSpain){
        return wordSpainRepository.deleteSpainWord(wordSpain)
    }
}