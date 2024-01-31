package com.azimuton.data.roomstorage.room.dao.english


import androidx.room.*
import com.azimuton.data.roomstorage.models.english.WordEntity

@Dao
interface WordDao {

    @Query("SELECT * FROM word")
    fun getAll(): List<WordEntity>

//    @Transaction
//    @Query("INSERT INTO learnedwords  SELECT englishWord, translateWord FROM word WHERE id = :id LIMIT 1")
//    fun copyId(id : Int)
//
//    @Query("DELETE FROM word WHERE id = :id")
//    fun deleteId(id : Int)

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