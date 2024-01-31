package com.azimuton.data.roomstorage.models.spain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "learnedspainwords")
class LearnedSpainWordEntity (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "learnedSpainWord")val learnedSpainWord: String,
    @ColumnInfo(name = "learnedTranslateSpainWord")val learnedTranslateSpainWord: String
)