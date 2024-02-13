package com.azimuton.data.roomstorage.room.dao.german

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.azimuton.data.roomstorage.models.german.GermanWordEntity

@Dao
interface GermanWordDao {

    @Query("SELECT * FROM germanword")
    suspend fun getAll(): List<GermanWordEntity>

    @Transaction
    @Query("INSERT INTO learnedgermanwords  SELECT * FROM germanword LIMIT 1 OFFSET :id")
    suspend fun copyId(id : Int)

    @Transaction
    @Query("INSERT INTO learnedgermanwords SELECT * FROM germanword")
    suspend fun copy()

    @Query("DELETE FROM germanword")
    suspend fun deleteAll()

    @Insert
    suspend fun insertGermanWord(germanWordEntity: GermanWordEntity)

    @Delete
    suspend fun deleteGermanWord(germanWordEntity: GermanWordEntity)

    @Update
    suspend fun updateGermanWord(germanWordEntity: GermanWordEntity)

    @Query("SELECT * FROM germanword WHERE id = :id")
    suspend fun getGermanWordById(id: Int): GermanWordEntity?

}