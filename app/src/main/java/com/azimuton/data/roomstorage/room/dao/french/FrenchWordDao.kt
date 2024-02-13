package com.azimuton.data.roomstorage.room.dao.french

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.azimuton.data.roomstorage.models.french.FrenchWordEntity

@Dao
interface FrenchWordDao {

    @Query("SELECT * FROM frenchword")
    suspend fun getAll(): List<FrenchWordEntity>

    @Transaction
    @Query("INSERT INTO learnedfrenchwords  SELECT * FROM frenchword LIMIT 1 OFFSET :id")
    suspend fun copyId(id : Int)

    @Transaction
    @Query("INSERT INTO learnedfrenchwords SELECT * FROM frenchword")
    suspend fun copy()

    @Query("DELETE FROM frenchword")
    suspend fun deleteAll()

    @Insert
    suspend fun insertFrenchWord(frenchWordEntity: FrenchWordEntity)

    @Delete
    suspend fun deleteFrenchWord(frenchWordEntity: FrenchWordEntity)

    @Update
    suspend fun updateFrenchWord(frenchWordEntity: FrenchWordEntity)

    @Query("SELECT * FROM frenchword WHERE id = :id")
    suspend fun getFrenchWordById(id: Int): FrenchWordEntity?

}