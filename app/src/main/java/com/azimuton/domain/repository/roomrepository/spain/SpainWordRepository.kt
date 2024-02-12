package com.azimuton.domain.repository.roomrepository.spain

import com.azimuton.domain.models.spain.WordSpain

interface SpainWordRepository {

    fun getAll(): List<WordSpain>

    fun copyId(id : Int)

    fun copy()

    fun deleteAll()

    fun insertSpainWord(wordSpain: WordSpain)

    fun deleteSpainWord(wordSpain: WordSpain)

    fun updateSpainWord(wordSpain: WordSpain)

    fun getSpainWordById(id: Int): WordSpain?
}