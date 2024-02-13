package com.azimuton.domain.usecase.english

import com.azimuton.domain.models.english.Word
import com.azimuton.domain.repository.roomrepository.english.WordRepository

class WordDeleteUseCase( private val wordRepository: WordRepository) {
     suspend fun execute(word: Word){
        return wordRepository.deleteWord(word)
    }
}