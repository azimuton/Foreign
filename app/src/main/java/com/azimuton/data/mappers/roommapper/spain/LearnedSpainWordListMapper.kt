package com.azimuton.data.mappers.roommapper.spain

import com.azimuton.data.mappers.roommapper.Mapper
import com.azimuton.data.roomstorage.models.spain.LearnedSpainWordEntity
import com.azimuton.domain.models.spain.LearnedSpainWord

class LearnedSpainWordListMapper : Mapper<List<LearnedSpainWordEntity>, List<LearnedSpainWord>> {

    override fun mapFromEntity(type: List<LearnedSpainWordEntity>): List<LearnedSpainWord> {
        val listLearnedSpainWord = ArrayList<LearnedSpainWord>()
        type.forEach { learnedSpainWordEntity ->
            listLearnedSpainWord.add(
                LearnedSpainWord(id = learnedSpainWordEntity.id,
                    spainLearnedWord = learnedSpainWordEntity.learnedSpainWord,
                    translateLearnedSpainWord = learnedSpainWordEntity.learnedTranslateSpainWord)
            )
        }
        return  listLearnedSpainWord.toList()
    }

    override fun mapToEntity(type: List<LearnedSpainWord>): List<LearnedSpainWordEntity> {
        val listLearnedSpainWord = ArrayList<LearnedSpainWordEntity>()

        type.forEach { learnedSpainWord ->
            listLearnedSpainWord.add(
                LearnedSpainWordEntity(id = learnedSpainWord.id,
                    learnedSpainWord = learnedSpainWord.spainLearnedWord,
                    learnedTranslateSpainWord = learnedSpainWord.translateLearnedSpainWord)
            )
        }
        return  listLearnedSpainWord.toList()
    }
}