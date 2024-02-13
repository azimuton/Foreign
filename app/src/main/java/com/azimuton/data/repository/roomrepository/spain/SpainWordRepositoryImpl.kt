package com.azimuton.data.repository.roomrepository.spain

import com.azimuton.data.mappers.roommapper.spain.SpainWordListMapper
import com.azimuton.data.mappers.roommapper.spain.SpainWordMapper
import com.azimuton.data.roomstorage.SpainWordStorage
import com.azimuton.domain.models.spain.WordSpain
import com.azimuton.domain.repository.roomrepository.spain.SpainWordRepository

class SpainWordRepositoryImpl (private val spainWordStorage: SpainWordStorage) :
    SpainWordRepository {
    override suspend fun getAll(): List<WordSpain> {
        return SpainWordListMapper().mapFromEntity(spainWordStorage.getAll())
    }

    override suspend fun copyId(id: Int) {
        spainWordStorage.copyId(id)
    }

    override suspend fun copy(){
        spainWordStorage.copy()
    }

    override suspend fun deleteAll() {
        spainWordStorage.deleteAll()
    }

    override suspend fun insertSpainWord(wordSpain: WordSpain) {
        return spainWordStorage.insertSpainWord(spainWordEntity = SpainWordMapper().mapToEntity(wordSpain))
    }

    override suspend fun deleteSpainWord(wordSpain: WordSpain) {
        return spainWordStorage.deleteSpainWord(spainWordEntity = SpainWordMapper().mapToEntity(wordSpain))
    }

    override suspend fun updateSpainWord(wordSpain : WordSpain) {
        return spainWordStorage.updateSpainWord(spainWordEntity = SpainWordMapper().mapToEntity(wordSpain))
    }

    override suspend fun getSpainWordById(id: Int): WordSpain? {
        return spainWordStorage.getSpainWordById(id)?.let { SpainWordMapper().mapFromEntity(it) }
    }
}