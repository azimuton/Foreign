package com.azimuton.domain.repository.roomrepository.spain

import com.azimuton.domain.models.spain.WordSpain

interface SpainWordRepository {

    suspend fun getAll(): List<WordSpain>

    suspend fun copyId(id : Int)

    suspend fun copy()

    suspend fun deleteAll()

    suspend fun insertSpainWord(wordSpain: WordSpain)

    suspend fun deleteSpainWord(wordSpain: WordSpain)

    suspend fun updateSpainWord(wordSpain: WordSpain)

    suspend fun getSpainWordById(id: Int): WordSpain?
}