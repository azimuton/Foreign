package com.azimuton.data.repository.roomrepository.spain

import com.azimuton.data.mappers.roommapper.spain.SpainWordListMapper
import com.azimuton.data.mappers.roommapper.spain.SpainWordMapper
import com.azimuton.data.roomstorage.SpainWordStorage
import com.azimuton.domain.models.spain.WordSpain
import com.azimuton.domain.repository.roomrepository.spain.SpainWordRepository

class SpainWordRepositoryImpl (private val spainWordStorage: SpainWordStorage) :
    SpainWordRepository {
    override fun getAll(): List<WordSpain> {
        return SpainWordListMapper().mapFromEntity(spainWordStorage.getAll())
    }

    override fun copy(){
        spainWordStorage.copy()
    }

    override fun deleteAll() {
        spainWordStorage.deleteAll()
    }

    override fun insertSpainWord(wordSpain: WordSpain) {
        return spainWordStorage.insertSpainWord(spainWordEntity = SpainWordMapper().mapToEntity(wordSpain))
    }

    override fun deleteSpainWord(wordSpain: WordSpain) {
        return spainWordStorage.deleteSpainWord(spainWordEntity = SpainWordMapper().mapToEntity(wordSpain))
    }

    override fun updateSpainWord(wordSpain : WordSpain) {
        return spainWordStorage.updateSpainWord(spainWordEntity = SpainWordMapper().mapToEntity(wordSpain))
    }

    override fun getSpainWordById(id: Int): WordSpain? {
        return spainWordStorage.getSpainWordById(id)?.let { SpainWordMapper().mapFromEntity(it) }
    }
}