package com.azimuton.data.mappers.roommapper.english

import com.azimuton.data.mappers.roommapper.Mapper
import com.azimuton.data.roomstorage.models.english.LearnedWordEntity
import com.azimuton.domain.models.english.LearnedWord

class LearnedWordMapper : Mapper<LearnedWordEntity, LearnedWord> {

    override fun mapFromEntity(type: LearnedWordEntity): LearnedWord {
        return  LearnedWord(id = type.id,
        englishLearnedWord = type.learnedEnglishWord,
        translateLearnedWord = type.learnedTranslateWord)
    }

    override fun mapToEntity(type: LearnedWord): LearnedWordEntity {
        return LearnedWordEntity(id = type.id,
        learnedEnglishWord = type.englishLearnedWord,
        learnedTranslateWord = type.translateLearnedWord)
    }
}