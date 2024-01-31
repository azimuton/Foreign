package com.azimuton.data.mappers.roommapper.english

import com.azimuton.data.mappers.roommapper.Mapper
import com.azimuton.data.roomstorage.models.english.WordEntity
import com.azimuton.domain.models.english.Word

class WordListMapper : Mapper<List<WordEntity>, List<Word>> {

    override fun mapFromEntity(type: List<WordEntity>): List<Word> {
        val listWord = ArrayList<Word>()

        type.forEach { wordEntity ->
            listWord.add(
                Word(id = wordEntity.id,
                    englishWord = wordEntity.englishWord,
                    translateWord = wordEntity.translateWord
                )
            )
        }
        return listWord.toList()
    }

    override fun mapToEntity(type: List<Word>): List<WordEntity> {
        val listWord = ArrayList<WordEntity>()

        type.forEach { word ->
            listWord.add(
                WordEntity(id = word.id,
                    englishWord = word.englishWord,
                    translateWord = word.translateWord
                )
            )
        }
        return listWord.toList()
    }
}