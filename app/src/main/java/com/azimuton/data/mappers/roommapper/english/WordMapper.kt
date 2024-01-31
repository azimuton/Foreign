package com.azimuton.data.mappers.roommapper.english

import com.azimuton.data.mappers.roommapper.Mapper
import com.azimuton.data.roomstorage.models.english.WordEntity
import com.azimuton.domain.models.english.Word

class WordMapper : Mapper<WordEntity, Word> {
    override fun mapFromEntity(type: WordEntity): Word {
        return Word(id = type.id,
            englishWord = type.englishWord,
        translateWord = type.translateWord)
    }

    override fun mapToEntity(type: Word): WordEntity {
        return WordEntity(id = type.id,
        englishWord = type.englishWord,
        translateWord = type.translateWord)
    }
}