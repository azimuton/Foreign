package com.azimuton.data.roomstorage.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.azimuton.data.roomstorage.models.english.LearnedWordEntity
import com.azimuton.data.roomstorage.models.english.WordEntity
import com.azimuton.data.roomstorage.models.spain.LearnedSpainWordEntity
import com.azimuton.data.roomstorage.models.spain.SpainWordEntity
import com.azimuton.data.roomstorage.room.dao.english.LearnedWordsDao
import com.azimuton.data.roomstorage.room.dao.english.WordDao
import com.azimuton.data.roomstorage.room.dao.spain.LearnedSpainWordsDao
import com.azimuton.data.roomstorage.room.dao.spain.SpainWordDao

@Database(entities = [WordEntity::class, LearnedWordEntity::class,
    SpainWordEntity::class, LearnedSpainWordEntity::class], version = 1)
abstract class AppRoomDatabase: RoomDatabase() {

    abstract fun wordDao(): WordDao
    abstract fun spainWordDao(): SpainWordDao
    abstract fun learnedWordDao(): LearnedWordsDao
    abstract fun learnedSpainWordDao(): LearnedSpainWordsDao

    companion object {
        @Volatile
        private var INSTANCE: AppRoomDatabase? = null

        fun getDatabase(context: Context): AppRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppRoomDatabase::class.java,
                    "words_database")
                    .allowMainThreadQueries()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}