package com.azimuton.domain.repository.roomrepository.english

import com.azimuton.data.roomstorage.models.english.LearnedWordEntity
import com.azimuton.domain.models.english.LearnedWord

interface LearnedWordsRepository {

    suspend fun getAll(): List<LearnedWord>

    suspend fun count(): Int

    suspend fun randoms() : LearnedWordEntity

    suspend fun insertLearnedWord(learnedWord : LearnedWord)

    suspend fun deleteLearnedWord(learnedWord : LearnedWord)

}