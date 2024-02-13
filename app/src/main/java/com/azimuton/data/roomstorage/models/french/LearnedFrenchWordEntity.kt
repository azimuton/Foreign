package com.azimuton.data.roomstorage.models.french

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "learnedfrenchwords")
class LearnedFrenchWordEntity (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "learnedFrenchWord")val learnedFrenchWord: String,
    @ColumnInfo(name = "learnedTranslateFrenchWord")val learnedTranslateFrenchWord: String
)