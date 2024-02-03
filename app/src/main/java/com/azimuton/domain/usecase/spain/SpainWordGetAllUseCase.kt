package com.azimuton.domain.usecase.spain

import com.azimuton.domain.models.spain.WordSpain
import com.azimuton.domain.repository.roomrepository.spain.SpainWordRepository

class SpainWordGetAllUseCase (private val wordSpainRepository: SpainWordRepository) {
    fun execute(): List<WordSpain>{
        return wordSpainRepository.getAll()
    }
}