package com.azimuton.data.roomstorage.room

import com.azimuton.data.roomstorage.WordStorage
import com.azimuton.data.roomstorage.models.english.WordEntity
import com.azimuton.data.roomstorage.room.dao.english.WordDao

class WordStorageRoomImpl(private  val wordDao : WordDao) : WordStorage {
    override suspend fun getAll(): List<WordEntity> {
        return  wordDao.getAll()
    }

    override suspend fun copyId(id: Int) {
        wordDao.copyId(id)
    }

    override suspend fun copy() {
        wordDao.copy()
    }

    override suspend fun deleteAll() {
        wordDao.deleteAll()
    }

    override suspend fun insertWord(wordEntity: WordEntity) {
        return wordDao.insertWord(wordEntity = wordEntity)
    }

    override suspend fun deleteWord(wordEntity: WordEntity) {
        return wordDao.deleteWord(wordEntity = wordEntity)
    }

    override suspend fun updateWord(wordEntity: WordEntity) {
        return wordDao.updateWord(wordEntity = wordEntity)
    }

    override suspend fun getWordById(id: Int): WordEntity? {
        return wordDao.getWordById(id)
    }
}