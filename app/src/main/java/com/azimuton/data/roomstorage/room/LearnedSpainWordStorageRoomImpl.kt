package com.azimuton.data.roomstorage.room

import com.azimuton.data.roomstorage.LearnedSpainWordsStorage
import com.azimuton.data.roomstorage.models.spain.LearnedSpainWordEntity
import com.azimuton.data.roomstorage.room.dao.spain.LearnedSpainWordsDao

class LearnedSpainWordStorageRoomImpl(private val learnedSpainWordsDao: LearnedSpainWordsDao) :
    LearnedSpainWordsStorage {
    override suspend fun getAll(): List<LearnedSpainWordEntity> {
        return learnedSpainWordsDao.getAll()
    }

    override suspend fun randoms() : LearnedSpainWordEntity {
        return learnedSpainWordsDao.randoms()
    }

    override suspend fun insertLearnedSpainWord(learnedSpainWordEntity: LearnedSpainWordEntity) {
        learnedSpainWordsDao.insertLearnedSpainWord(learnedSpainWordEntity = learnedSpainWordEntity)
    }

    override suspend fun deleteLearnedSpainWord(learnedSpainWordEntity: LearnedSpainWordEntity) {
        learnedSpainWordsDao.deleteLearnedSpainWord(learnedSpainWordEntity = learnedSpainWordEntity)
    }


}