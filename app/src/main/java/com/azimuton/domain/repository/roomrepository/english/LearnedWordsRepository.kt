package com.azimuton.domain.repository.roomrepository.english

import com.azimuton.data.roomstorage.models.english.LearnedWordEntity
import com.azimuton.domain.models.english.LearnedWord

interface LearnedWordsRepository {

    fun getAll(): List<LearnedWord>

    fun randoms() : LearnedWordEntity

    fun insertLearnedWord(learnedWord : LearnedWord)

    fun deleteLearnedWord(learnedWord : LearnedWord)

}