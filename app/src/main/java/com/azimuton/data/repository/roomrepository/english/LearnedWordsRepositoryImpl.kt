package com.azimuton.data.repository.roomrepository.english

import com.azimuton.data.mappers.roommapper.english.LearnedWordListMapper
import com.azimuton.data.mappers.roommapper.english.LearnedWordMapper
import com.azimuton.data.roomstorage.LearnedWordsStorage
import com.azimuton.data.roomstorage.models.english.LearnedWordEntity
import com.azimuton.domain.models.english.LearnedWord
import com.azimuton.domain.repository.roomrepository.english.LearnedWordsRepository

class LearnedWordsRepositoryImpl(private val learnedWordsStorage: LearnedWordsStorage) :
    LearnedWordsRepository {
    override fun getAll(): List<LearnedWord> {
        return  LearnedWordListMapper().mapFromEntity(learnedWordsStorage.getAll())
    }

    override fun randoms() : LearnedWordEntity {
       return learnedWordsStorage.randoms()
    }

    override fun insertLearnedWord(learnedWord: LearnedWord) {
        return learnedWordsStorage.insertLearnedWord(learnedWordEntity =
        LearnedWordMapper().mapToEntity(learnedWord))
    }

    override fun deleteLearnedWord(learnedWord: LearnedWord) {
        return learnedWordsStorage.deleteLearnedWord(learnedWordEntity =
        LearnedWordMapper().mapToEntity(learnedWord))
    }
}