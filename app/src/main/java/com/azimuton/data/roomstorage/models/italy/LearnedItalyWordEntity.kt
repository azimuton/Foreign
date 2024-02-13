package com.azimuton.data.roomstorage.models.italy

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "learneditalywords")
data class LearnedItalyWordEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "learnedItalyWord")val learnedItalyWord: String,
    @ColumnInfo(name = "learnedTranslateItalyWord")val learnedTranslateItalyWord: String
)
