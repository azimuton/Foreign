package com.azimuton.data.roomstorage.room.dao.italy

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.azimuton.data.roomstorage.models.italy.LearnedItalyWordEntity

@Dao
interface LearnedItalyWordsDao {

    @Query("SELECT * FROM learneditalywords")
    suspend fun getAll(): List<LearnedItalyWordEntity>

    @Query("SELECT  COUNT(DISTINCT id) as count FROM learneditalywords")
    suspend fun count(): Int

    @Query("SELECT * FROM learneditalywords  ORDER BY RANDOM() LIMIT 1")
    suspend fun randoms() : LearnedItalyWordEntity

    @Insert
    suspend fun insertLearnedItalyWord(learnedItalyWordEntity: LearnedItalyWordEntity)

    @Delete
    suspend fun deleteLearnedItalyWord(learnedItalyWordEntity: LearnedItalyWordEntity)
}