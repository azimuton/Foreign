package com.azimuton.data.mappers.roommapper.spain

import com.azimuton.data.mappers.roommapper.Mapper
import com.azimuton.data.roomstorage.models.spain.SpainWordEntity
import com.azimuton.domain.models.spain.WordSpain

class SpainWordListMapper: Mapper<List<SpainWordEntity>, List<WordSpain>> {

    override fun mapFromEntity(type: List<SpainWordEntity>): List<WordSpain> {
        val listWord = ArrayList<WordSpain>()

        type.forEach { wordEntity ->
            listWord.add(
                WordSpain(id = wordEntity.id,
                    spainWord = wordEntity.spainWord,
                    translateSpainWord = wordEntity.translateSpainWord
                )
            )
        }
        return listWord.toList()
    }

    override fun mapToEntity(type: List<WordSpain>): List<SpainWordEntity> {
        val listWord = ArrayList<SpainWordEntity>()

        type.forEach { word ->
            listWord.add(
                SpainWordEntity(id = word.id,
                    spainWord = word.spainWord,
                    translateSpainWord = word.translateSpainWord
                )
            )
        }
        return listWord.toList()
    }
}