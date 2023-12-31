package com.azimuton.data.roomstorage.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.azimuton.data.roomstorage.models.LearnedWordEntity

@Dao
interface LearnedWordsDao {

    @Query("SELECT * FROM learnedwords")
    fun getAll(): List<LearnedWordEntity>

//    @Query("SELECT * FROM notes_table WHERE title LIKE '%' || :title || '%'")
//    fun searchByTitle(title: String): Flow<List<NoteEntity>>

    @Query("SELECT  COUNT(DISTINCT id) as count FROM learnedwords")
    fun count(): Int

    @Query("SELECT * FROM learnedwords  ORDER BY RANDOM() LIMIT 1")
    fun randoms() : LearnedWordEntity

    @Insert
    fun insertLearnedWord(learnedWordEntity: LearnedWordEntity)

    @Delete
    fun deleteLearnedWord(learnedWordEntity: LearnedWordEntity)

}