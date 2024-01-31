package com.azimuton.data.roomstorage

import com.azimuton.data.roomstorage.models.english.LearnedWordEntity


interface LearnedWordsStorage {

    fun getAll(): List<LearnedWordEntity>

    fun randoms() : LearnedWordEntity

    fun insertLearnedWord(learnedWordEntity: LearnedWordEntity)

    fun deleteLearnedWord(learnedWordEntity: LearnedWordEntity)
}