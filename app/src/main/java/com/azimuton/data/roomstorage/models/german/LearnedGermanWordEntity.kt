package com.azimuton.data.roomstorage.models.german

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "learnedgermanwords")
data class LearnedGermanWordEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "learnedGermanWord")val learnedGermanWord: String,
    @ColumnInfo(name = "learnedTranslateGermanWord")val learnedTranslateGermanWord: String
)
