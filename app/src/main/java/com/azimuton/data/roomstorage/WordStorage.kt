package com.azimuton.data.roomstorage

import com.azimuton.data.roomstorage.models.english.WordEntity

interface WordStorage {

    suspend fun getAll(): List<WordEntity>

    suspend fun copyId(id: Int)

    suspend fun copy()

    suspend fun deleteAll()

    suspend fun insertWord(wordEntity: WordEntity)

    suspend fun deleteWord(wordEntity: WordEntity)

    suspend fun updateWord(wordEntity: WordEntity)

    suspend fun getWordById(id: Int): WordEntity?
}