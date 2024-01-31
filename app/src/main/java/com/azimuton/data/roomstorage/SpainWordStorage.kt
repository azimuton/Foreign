package com.azimuton.data.roomstorage

import com.azimuton.data.roomstorage.models.spain.SpainWordEntity

interface SpainWordStorage {

    fun getAll(): List<SpainWordEntity>

    fun copy()

    fun deleteAll()

    fun insertSpainWord(spainWordEntity: SpainWordEntity)

    fun deleteSpainWord(spainWordEntity: SpainWordEntity)

    fun updateSpainWord(spainWordEntity: SpainWordEntity)

    fun getSpainWordById(id: Int): SpainWordEntity?
}