package com.azimuton.data.mappers.roommapper.spain

import com.azimuton.data.mappers.roommapper.Mapper
import com.azimuton.data.roomstorage.models.spain.LearnedSpainWordEntity
import com.azimuton.domain.models.spain.LearnedSpainWord

class LearnedSpainWordMapper: Mapper<LearnedSpainWordEntity, LearnedSpainWord> {

    override fun mapFromEntity(type: LearnedSpainWordEntity): LearnedSpainWord {
        return  LearnedSpainWord(id = type.id,
            spainLearnedWord = type.learnedSpainWord,
            translateLearnedSpainWord = type.learnedTranslateSpainWord)
    }

    override fun mapToEntity(type: LearnedSpainWord): LearnedSpainWordEntity {
        return LearnedSpainWordEntity(id = type.id,
            learnedSpainWord = type.spainLearnedWord,
            learnedTranslateSpainWord = type.translateLearnedSpainWord)
    }
}