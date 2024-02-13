package com.azimuton.data.repository.roomrepository.spain

import com.azimuton.data.mappers.roommapper.spain.LearnedSpainWordListMapper
import com.azimuton.data.mappers.roommapper.spain.LearnedSpainWordMapper
import com.azimuton.data.roomstorage.LearnedSpainWordsStorage
import com.azimuton.data.roomstorage.models.spain.LearnedSpainWordEntity
import com.azimuton.domain.models.spain.LearnedSpainWord
import com.azimuton.domain.repository.roomrepository.spain.SpainLearnedWordsRepository

class LearnedSpainWordsRepositoryImpl(private val learnedSpainWordsStorage: LearnedSpainWordsStorage) :
    SpainLearnedWordsRepository {
    override suspend fun getAll(): List<LearnedSpainWord> {
        return  LearnedSpainWordListMapper().mapFromEntity(learnedSpainWordsStorage.getAll())
    }

    override suspend fun randoms() : LearnedSpainWordEntity {
        return learnedSpainWordsStorage.randoms()
    }

    override suspend fun insertLearnedSpainWord(learnedSpainWord: LearnedSpainWord) {
        return learnedSpainWordsStorage.insertLearnedSpainWord(learnedSpainWordEntity =
        LearnedSpainWordMapper().mapToEntity(learnedSpainWord))
    }

    override suspend fun deleteLearnedSpainWord(learnedSpainWord: LearnedSpainWord) {
        return learnedSpainWordsStorage.deleteLearnedSpainWord(learnedSpainWordEntity =
        LearnedSpainWordMapper().mapToEntity(learnedSpainWord))
    }
}