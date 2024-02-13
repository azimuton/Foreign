package com.azimuton.data.roomstorage

import com.azimuton.data.roomstorage.models.spain.LearnedSpainWordEntity

interface LearnedSpainWordsStorage {

    suspend fun getAll(): List<LearnedSpainWordEntity>

    suspend fun randoms() : LearnedSpainWordEntity

    suspend fun insertLearnedSpainWord(learnedSpainWordEntity: LearnedSpainWordEntity)

    suspend fun deleteLearnedSpainWord(learnedSpainWordEntity: LearnedSpainWordEntity)
}