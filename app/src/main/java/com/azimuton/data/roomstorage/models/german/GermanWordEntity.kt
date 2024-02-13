package com.azimuton.data.roomstorage.models.german

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "germanword")
data class GermanWordEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "germanWord")val germanWord: String,
    @ColumnInfo(name = "translateGermanWord")val translateGermanWord: String
)
