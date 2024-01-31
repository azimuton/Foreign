package com.azimuton.data.mappers.roommapper.english

import com.azimuton.data.mappers.roommapper.Mapper
import com.azimuton.data.roomstorage.models.english.LearnedWordEntity
import com.azimuton.domain.models.english.LearnedWord

class LearnedWordListMapper : Mapper<List<LearnedWordEntity>, List<LearnedWord>> {

    override fun mapFromEntity(type: List<LearnedWordEntity>): List<LearnedWord> {
        val listLearnedWord = ArrayList<LearnedWord>()
        type.forEach { learnedWordEntity ->
            listLearnedWord.add(
                LearnedWord(id = learnedWordEntity.id,
                englishLearnedWord = learnedWordEntity.learnedEnglishWord,
                translateLearnedWord = learnedWordEntity.learnedTranslateWord)
            )
        }
        return  listLearnedWord.toList()
    }

    override fun mapToEntity(type: List<LearnedWord>): List<LearnedWordEntity> {
        val listLearnedWord = ArrayList<LearnedWordEntity>()

        type.forEach { learnedWord ->
            listLearnedWord.add(
                LearnedWordEntity(id = learnedWord.id,
                learnedEnglishWord = learnedWord.englishLearnedWord,
                learnedTranslateWord = learnedWord.translateLearnedWord)
            )
        }
        return  listLearnedWord.toList()
    }
}