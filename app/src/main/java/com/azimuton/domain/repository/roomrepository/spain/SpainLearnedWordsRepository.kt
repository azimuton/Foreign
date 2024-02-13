package com.azimuton.domain.repository.roomrepository.spain

import com.azimuton.data.roomstorage.models.spain.LearnedSpainWordEntity
import com.azimuton.domain.models.spain.LearnedSpainWord

interface SpainLearnedWordsRepository {

    suspend fun getAll(): List<LearnedSpainWord>

    suspend fun randoms() : LearnedSpainWordEntity

    suspend fun insertLearnedSpainWord(learnedSpainWord : LearnedSpainWord)

    suspend fun deleteLearnedSpainWord(learnedSpainWord : LearnedSpainWord)
}