package com.azimuton.data.roomstorage.room.dao.spain

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.azimuton.data.roomstorage.models.spain.SpainWordEntity

interface SpainWordDao {

    @Query("SELECT * FROM spainword")
    fun getAll(): List<SpainWordEntity>

//    @Transaction
//    @Query("INSERT INTO learnedwords  SELECT englishWord, translateWord FROM word WHERE id = :id LIMIT 1")
//    fun copyId(id : Int)
//
//    @Query("DELETE FROM word WHERE id = :id")
//    fun deleteId(id : Int)

    @Transaction
    @Query("INSERT INTO learnedspainwords SELECT * FROM spainword")
    fun copy()

    @Query("DELETE FROM spainword")
    fun deleteAll()

    @Insert
    fun insertSpainWord(spainWordEntity: SpainWordEntity)

    @Delete
    fun deleteSpainWord(spainWordEntity: SpainWordEntity)

    @Update
    fun updateSpainWord(spainWordEntity: SpainWordEntity)

    @Query("SELECT * FROM spainword WHERE id = :id")
    fun getSpainWordById(id: Int): SpainWordEntity?

}