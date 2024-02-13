package com.azimuton.domain.repository.roomrepository.english


import com.azimuton.domain.models.english.Word

interface WordRepository {

    suspend fun getAll(): List<Word>

    suspend fun copyId(id: Int)

    suspend fun copy()

    suspend fun deleteAll()

    suspend fun insertWord(word: Word)

    suspend fun deleteWord(word: Word)

    suspend fun updateWord(word: Word)

    suspend fun getWordById(id: Int): Word?
}