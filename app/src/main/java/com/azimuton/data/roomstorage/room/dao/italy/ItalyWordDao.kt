package com.azimuton.data.roomstorage.room.dao.italy

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.azimuton.data.roomstorage.models.italy.ItalyWordEntity

@Dao
interface ItalyWordDao {

    @Query("SELECT * FROM italyword")
    suspend fun getAll(): List<ItalyWordEntity>

    @Transaction
    @Query("INSERT INTO learneditalywords  SELECT * FROM italyword LIMIT 1 OFFSET :id")
    suspend fun copyId(id : Int)

    @Transaction
    @Query("INSERT INTO learneditalywords SELECT * FROM italyword")
    suspend fun copy()

    @Query("DELETE FROM italyword")
    suspend fun deleteAll()

    @Insert
    suspend fun insertItalyWord(italyWordEntity: ItalyWordEntity)

    @Delete
    suspend fun deleteItalyWord(italyWordEntity: ItalyWordEntity)

    @Update
    suspend fun updateItalyWord(italyWordEntity: ItalyWordEntity)

    @Query("SELECT * FROM italyword WHERE id = :id")
    suspend fun getItalyWordById(id: Int): ItalyWordEntity?

}