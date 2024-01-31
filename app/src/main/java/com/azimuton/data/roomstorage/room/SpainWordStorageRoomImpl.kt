package com.azimuton.data.roomstorage.room

import com.azimuton.data.roomstorage.SpainWordStorage
import com.azimuton.data.roomstorage.models.spain.SpainWordEntity
import com.azimuton.data.roomstorage.room.dao.spain.SpainWordDao

class SpainWordStorageRoomImpl(private  val spainWordDao : SpainWordDao) : SpainWordStorage {
    override fun getAll(): List<SpainWordEntity> {
        return spainWordDao.getAll()
    }

    override fun copy() {
        spainWordDao.copy()
    }

    override fun deleteAll() {
        spainWordDao.deleteAll()
    }

    override fun insertSpainWord(spainWordEntity: SpainWordEntity) {
        return spainWordDao.insertSpainWord(spainWordEntity = spainWordEntity)
    }

    override fun deleteSpainWord(spainWordEntity: SpainWordEntity) {
        return spainWordDao.deleteSpainWord(spainWordEntity = spainWordEntity)
    }

    override fun updateSpainWord(spainWordEntity: SpainWordEntity) {
        return spainWordDao.updateSpainWord(spainWordEntity = spainWordEntity)
    }

    override fun getSpainWordById(id: Int): SpainWordEntity? {
        return spainWordDao.getSpainWordById(id)
    }
}