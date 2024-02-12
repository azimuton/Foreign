package com.azimuton.data.roomstorage.room.dao.english


import androidx.room.*
import com.azimuton.data.roomstorage.models.english.LearnedWordEntity
import com.azimuton.data.roomstorage.models.english.WordEntity
import com.azimuton.domain.models.english.Word

@Dao
interface WordDao {

    @Query("SELECT * FROM word")
    fun getAll(): List<WordEntity>

//    @Query("SELECT * FROM learnedwords WHERE learnedEnglishWord LIKE '%' || :title || '%'")
//    fun searchByTitle(title: String): List<LearnedWordEntity>

    @Transaction
    @Query("INSERT INTO learnedwords  SELECT * FROM word LIMIT 1 OFFSET :id")
    fun copyId(id : Int)

    @Transaction
    @Query("INSERT INTO learnedwords SELECT * FROM word")
    fun copy()

    @Query("DELETE FROM word")
    fun deleteAll()

    @Insert
    fun insertWord(wordEntity: WordEntity)

    @Delete
    fun deleteWord(wordEntity: WordEntity)

    @Update
    fun updateWord(wordEntity: WordEntity)

    @Query("SELECT * FROM word WHERE id = :id")
    fun getWordById(id: Int): WordEntity?

}