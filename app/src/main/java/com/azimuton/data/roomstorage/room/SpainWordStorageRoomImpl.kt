package com.azimuton.data.roomstorage.room

import com.azimuton.data.roomstorage.SpainWordStorage
import com.azimuton.data.roomstorage.models.spain.SpainWordEntity
import com.azimuton.data.roomstorage.room.dao.spain.SpainWordDao

class SpainWordStorageRoomImpl(private  val spainWordDao : SpainWordDao) : SpainWordStorage {
    override suspend fun getAll(): List<SpainWordEntity> {
        return spainWordDao.getAll()
    }

    override suspend fun copyId(id: Int) {
        spainWordDao.copyId(id)
    }

    override suspend fun copy() {
        spainWordDao.copy()
    }

    override suspend fun deleteAll() {
        spainWordDao.deleteAll()
    }

    override suspend fun insertSpainWord(spainWordEntity: SpainWordEntity) {
        return spainWordDao.insertSpainWord(spainWordEntity = spainWordEntity)
    }

    override suspend fun deleteSpainWord(spainWordEntity: SpainWordEntity) {
        return spainWordDao.deleteSpainWord(spainWordEntity = spainWordEntity)
    }

    override suspend fun updateSpainWord(spainWordEntity: SpainWordEntity) {
        return spainWordDao.updateSpainWord(spainWordEntity = spainWordEntity)
    }

    override suspend fun getSpainWordById(id: Int): SpainWordEntity? {
        return spainWordDao.getSpainWordById(id)
    }
}