package com.azimuton.data.roomstorage.room.dao.english


import androidx.room.*
import com.azimuton.data.roomstorage.models.english.LearnedWordEntity
import com.azimuton.data.roomstorage.models.english.WordEntity
import com.azimuton.domain.models.english.Word

@Dao
interface WordDao {

    @Query("SELECT * FROM word")
    suspend fun getAll(): List<WordEntity>

//    @Query("SELECT * FROM learnedwords WHERE learnedEnglishWord LIKE '%' || :title || '%'")
//    fun searchByTitle(title: String): List<LearnedWordEntity>

    @Transaction
    @Query("INSERT INTO learnedwords  SELECT * FROM word LIMIT 1 OFFSET :id")
    suspend fun copyId(id : Int)

    @Transaction
    @Query("INSERT INTO learnedwords SELECT * FROM word")
    suspend fun copy()

    @Query("DELETE FROM word")
    suspend fun deleteAll()

    @Insert
    suspend fun insertWord(wordEntity: WordEntity)

    @Delete
    suspend fun deleteWord(wordEntity: WordEntity)

    @Update
    suspend fun updateWord(wordEntity: WordEntity)

    @Query("SELECT * FROM word WHERE id = :id")
    suspend fun getWordById(id: Int): WordEntity?

}