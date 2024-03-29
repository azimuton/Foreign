package com.azimuton.data.roomstorage.room.dao.english

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.azimuton.data.roomstorage.models.english.LearnedWordEntity

@Dao
interface LearnedWordsDao {

    @Query("SELECT * FROM learnedwords")
    suspend fun getAll(): List<LearnedWordEntity>

//    @Query("SELECT * FROM notes_table WHERE title LIKE '%' || :title || '%'")
//    fun searchByTitle(title: String): Flow<List<NoteEntity>>

    @Query("SELECT  COUNT(DISTINCT id) as count FROM learnedwords")
    suspend fun count(): Int

    @Query("SELECT * FROM learnedwords  ORDER BY RANDOM() LIMIT 1")
    suspend fun randoms() : LearnedWordEntity

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertLearnedWord(learnedWordEntity: LearnedWordEntity)

    @Delete
    suspend fun deleteLearnedWord(learnedWordEntity: LearnedWordEntity)

}