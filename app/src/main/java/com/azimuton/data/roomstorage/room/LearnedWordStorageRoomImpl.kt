package com.azimuton.data.roomstorage.room

import com.azimuton.data.roomstorage.LearnedWordsStorage
import com.azimuton.data.roomstorage.models.english.LearnedWordEntity
import com.azimuton.data.roomstorage.room.dao.english.LearnedWordsDao

class LearnedWordStorageRoomImpl(private val learnedWordsDao: LearnedWordsDao) : LearnedWordsStorage {
    override suspend fun getAll(): List<LearnedWordEntity> {
       return learnedWordsDao.getAll()
    }

    override suspend fun count(): Int {
        return learnedWordsDao.count()
    }

    override suspend fun randoms() : LearnedWordEntity {
        return learnedWordsDao.randoms()
    }

    override suspend fun insertLearnedWord(learnedWordEntity: LearnedWordEntity) {
        learnedWordsDao.insertLearnedWord(learnedWordEntity = learnedWordEntity)
    }

    override suspend fun deleteLearnedWord(learnedWordEntity: LearnedWordEntity) {
        learnedWordsDao.deleteLearnedWord(learnedWordEntity = learnedWordEntity)
    }
}