package com.azimuton.data.roomstorage.models.italy

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "italyword")
data class ItalyWordEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "italyWord")val italyWord: String,
    @ColumnInfo(name = "translateItalyWord")val translateItalyWord: String
)
