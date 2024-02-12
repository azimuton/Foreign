package com.azimuton.data.repository.roomrepository.english

import com.azimuton.data.mappers.roommapper.english.WordListMapper
import com.azimuton.data.mappers.roommapper.english.WordMapper
import com.azimuton.data.roomstorage.WordStorage
import com.azimuton.domain.models.english.Word
import com.azimuton.domain.repository.roomrepository.english.WordRepository

class WordRepositoryImpl(private val wordStorage: WordStorage) : WordRepository {
    override fun getAll(): List<Word> {
        return WordListMapper().mapFromEntity(wordStorage.getAll())
    }

    override fun copyId(id: Int) {
        wordStorage.copyId(id)
    }

    override fun copy(){
        wordStorage.copy()
    }

    override fun deleteAll() {
        wordStorage.deleteAll()
    }

    override fun insertWord(word: Word) {
       return wordStorage.insertWord(wordEntity = WordMapper().mapToEntity(word))
    }

    override fun deleteWord(word: Word) {
        return wordStorage.deleteWord(wordEntity = WordMapper().mapToEntity(word))
    }

    override fun updateWord(word: Word) {
        return wordStorage.updateWord(wordEntity = WordMapper().mapToEntity(word))
    }

    override fun getWordById(id: Int): Word? {
        return wordStorage.getWordById(id)?.let { WordMapper().mapFromEntity(it) }
    }
}