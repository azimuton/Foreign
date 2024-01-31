package com.azimuton.data.roomstorage

import com.azimuton.data.roomstorage.models.spain.LearnedSpainWordEntity

interface LearnedSpainWordsStorage {

    fun getAll(): List<LearnedSpainWordEntity>

    fun randoms() : LearnedSpainWordEntity

    fun insertLearnedSpainWord(learnedSpainWordEntity: LearnedSpainWordEntity)

    fun deleteLearnedSpainWord(learnedSpainWordEntity: LearnedSpainWordEntity)
}