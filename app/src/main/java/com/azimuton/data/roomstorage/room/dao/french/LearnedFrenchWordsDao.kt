package com.azimuton.data.roomstorage.room.dao.french

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.azimuton.data.roomstorage.models.french.LearnedFrenchWordEntity

@Dao
interface LearnedFrenchWordsDao {

    @Query("SELECT * FROM learnedfrenchwords")
    suspend fun getAll(): List<LearnedFrenchWordEntity>

    @Query("SELECT  COUNT(DISTINCT id) as count FROM learnedfrenchwords")
    suspend fun count(): Int

    @Query("SELECT * FROM learnedfrenchwords  ORDER BY RANDOM() LIMIT 1")
    suspend fun randoms() : LearnedFrenchWordEntity

    @Insert
    suspend fun insertLearnedFrenchWord(learnedFrenchWordEntity: LearnedFrenchWordEntity)

    @Delete
    suspend fun deleteLearnedFrenchWord(learnedFrenchWordEntity: LearnedFrenchWordEntity)
}