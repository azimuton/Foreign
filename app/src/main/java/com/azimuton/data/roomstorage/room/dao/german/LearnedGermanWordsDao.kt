package com.azimuton.data.roomstorage.room.dao.german

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.azimuton.data.roomstorage.models.german.LearnedGermanWordEntity

@Dao
interface LearnedGermanWordsDao {

    @Query("SELECT * FROM learnedgermanwords")
    suspend fun getAll(): List<LearnedGermanWordEntity>

    @Query("SELECT  COUNT(DISTINCT id) as count FROM learnedgermanwords")
    suspend fun count(): Int

    @Query("SELECT * FROM learnedgermanwords  ORDER BY RANDOM() LIMIT 1")
    suspend fun randoms() : LearnedGermanWordEntity

    @Insert
    suspend fun insertLearnedGermanWord(learnedGermanWordEntity: LearnedGermanWordEntity)

    @Delete
    suspend fun deleteLearnedGermanWord(learnedGermanWordEntity: LearnedGermanWordEntity)
}