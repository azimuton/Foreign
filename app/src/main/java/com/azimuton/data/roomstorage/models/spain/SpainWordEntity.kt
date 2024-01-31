package com.azimuton.data.roomstorage.models.spain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "spainword")
class SpainWordEntity (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "spainWord")val spainWord: String,
    @ColumnInfo(name = "translateSpainWord")val translateSpainWord: String
)