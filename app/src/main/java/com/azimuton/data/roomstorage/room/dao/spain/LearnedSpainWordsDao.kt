package com.azimuton.data.roomstorage.room.dao.spain

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.azimuton.data.roomstorage.models.english.LearnedWordEntity
import com.azimuton.data.roomstorage.models.spain.LearnedSpainWordEntity

interface LearnedSpainWordsDao {

    @Query("SELECT * FROM learnedspainwords")
    fun getAll(): List<LearnedSpainWordEntity>

//    @Query("SELECT * FROM notes_table WHERE title LIKE '%' || :title || '%'")
//    fun searchByTitle(title: String): Flow<List<NoteEntity>>

    @Query("SELECT  COUNT(DISTINCT id) as count FROM learnedspainwords")
    fun count(): Int

    @Query("SELECT * FROM learnedspainwords  ORDER BY RANDOM() LIMIT 1")
    fun randoms() : LearnedSpainWordEntity

    @Insert
    fun insertLearnedSpainWord(learnedSpainWordEntity: LearnedSpainWordEntity)

    @Delete
    fun deleteLearnedSpainWord(learnedSpainWordEntity: LearnedSpainWordEntity)

}