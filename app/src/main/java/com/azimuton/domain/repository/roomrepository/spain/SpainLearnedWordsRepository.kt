package com.azimuton.domain.repository.roomrepository.spain

import com.azimuton.data.roomstorage.models.spain.LearnedSpainWordEntity
import com.azimuton.domain.models.spain.LearnedSpainWord

interface SpainLearnedWordsRepository {

    fun getAll(): List<LearnedSpainWord>

    fun randoms() : LearnedSpainWordEntity

    fun insertLearnedSpainWord(learnedSpainWord : LearnedSpainWord)

    fun deleteLearnedSpainWord(learnedSpainWord : LearnedSpainWord)
}