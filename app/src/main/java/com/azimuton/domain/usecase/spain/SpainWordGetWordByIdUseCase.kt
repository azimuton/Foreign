package com.azimuton.domain.usecase.spain

import com.azimuton.domain.models.spain.WordSpain
import com.azimuton.domain.repository.roomrepository.spain.SpainWordRepository

class SpainWordGetWordByIdUseCase (private val wordSpainRepository: SpainWordRepository) {
    suspend fun execute(id : Int) : WordSpain? {
        return wordSpainRepository.getSpainWordById(id = id)
    }
}