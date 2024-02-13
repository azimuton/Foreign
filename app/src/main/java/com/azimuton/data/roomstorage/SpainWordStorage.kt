package com.azimuton.data.roomstorage

import com.azimuton.data.roomstorage.models.spain.SpainWordEntity

interface SpainWordStorage {

    suspend fun getAll(): List<SpainWordEntity>

    suspend fun copyId(id : Int)

    suspend fun copy()

    suspend fun deleteAll()

    suspend fun insertSpainWord(spainWordEntity: SpainWordEntity)

    suspend fun deleteSpainWord(spainWordEntity: SpainWordEntity)

    suspend fun updateSpainWord(spainWordEntity: SpainWordEntity)

    suspend fun getSpainWordById(id: Int): SpainWordEntity?
}