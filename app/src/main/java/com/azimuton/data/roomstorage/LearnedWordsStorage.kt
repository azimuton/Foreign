package com.azimuton.data.roomstorage

import com.azimuton.data.roomstorage.models.english.LearnedWordEntity


interface LearnedWordsStorage {

    suspend fun getAll(): List<LearnedWordEntity>

    suspend fun count() : Int

    suspend fun randoms() : LearnedWordEntity

    suspend fun insertLearnedWord(learnedWordEntity: LearnedWordEntity)

    suspend fun deleteLearnedWord(learnedWordEntity: LearnedWordEntity)
}