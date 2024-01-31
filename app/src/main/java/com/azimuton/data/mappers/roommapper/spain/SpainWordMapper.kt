package com.azimuton.data.mappers.roommapper.spain

import com.azimuton.data.mappers.roommapper.Mapper
import com.azimuton.data.roomstorage.models.spain.SpainWordEntity
import com.azimuton.domain.models.spain.WordSpain

class SpainWordMapper : Mapper<SpainWordEntity, WordSpain> {
    override fun mapFromEntity(type: SpainWordEntity): WordSpain {
        return WordSpain(id = type.id,
            spainWord = type.spainWord,
            translateSpainWord = type.translateSpainWord)
    }

    override fun mapToEntity(type: WordSpain): SpainWordEntity {
        return SpainWordEntity(id = type.id,
            spainWord = type.spainWord,
            translateSpainWord = type.translateSpainWord)
    }
}