package com.azimuton.domain.repository.roomrepository.english


import com.azimuton.domain.models.english.Word

interface WordRepository {

    fun getAll(): List<Word>

    fun copy()

    fun deleteAll()

    fun insertWord(word: Word)

    fun deleteWord(word: Word)

    fun updateWord(word: Word)

    fun getWordById(id: Int): Word?
}