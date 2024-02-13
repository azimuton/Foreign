package com.azimuton.data.roomstorage.room.dao.spain

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.azimuton.data.roomstorage.models.spain.SpainWordEntity

@Dao
interface SpainWordDao {

    @Query("SELECT * FROM spainword")
    suspend fun getAll(): List<SpainWordEntity>

    @Transaction
    @Query("INSERT INTO learnedspainwords  SELECT * FROM spainword LIMIT 1 OFFSET :id")
    suspend fun copyId(id : Int)

    @Transaction
    @Query("INSERT INTO learnedspainwords SELECT * FROM spainword")
    suspend fun copy()

    @Query("DELETE FROM spainword")
    suspend fun deleteAll()

    @Insert
    suspend fun insertSpainWord(spainWordEntity: SpainWordEntity)

    @Delete
    suspend fun deleteSpainWord(spainWordEntity: SpainWordEntity)

    @Update
    suspend fun updateSpainWord(spainWordEntity: SpainWordEntity)

    @Query("SELECT * FROM spainword WHERE id = :id")
    suspend fun getSpainWordById(id: Int): SpainWordEntity?

}