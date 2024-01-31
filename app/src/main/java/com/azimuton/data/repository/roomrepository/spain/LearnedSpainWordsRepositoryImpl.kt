package com.azimuton.data.repository.roomrepository.spain

import com.azimuton.data.mappers.roommapper.spain.LearnedSpainWordListMapper
import com.azimuton.data.mappers.roommapper.spain.LearnedSpainWordMapper
import com.azimuton.data.roomstorage.LearnedSpainWordsStorage
import com.azimuton.data.roomstorage.models.spain.LearnedSpainWordEntity
import com.azimuton.domain.models.spain.LearnedSpainWord
import com.azimuton.domain.repository.roomrepository.spain.SpainLearnedWordsRepository

class LearnedSpainWordsRepositoryImpl(private val learnedSpainWordsStorage: LearnedSpainWordsStorage) :
    SpainLearnedWordsRepository {
    override fun getAll(): List<LearnedSpainWord> {
        return  LearnedSpainWordListMapper().mapFromEntity(learnedSpainWordsStorage.getAll())
    }

    override fun randoms() : LearnedSpainWordEntity {
        return learnedSpainWordsStorage.randoms()
    }

    override fun insertLearnedSpainWord(learnedSpainWord: LearnedSpainWord) {
        return learnedSpainWordsStorage.insertLearnedSpainWord(learnedSpainWordEntity =
        LearnedSpainWordMapper().mapToEntity(learnedSpainWord))
    }

    override fun deleteLearnedSpainWord(learnedSpainWord: LearnedSpainWord) {
        return learnedSpainWordsStorage.deleteLearnedSpainWord(learnedSpainWordEntity =
        LearnedSpainWordMapper().mapToEntity(learnedSpainWord))
    }
}