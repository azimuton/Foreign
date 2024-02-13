package com.azimuton.data.roomstorage.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.azimuton.data.roomstorage.models.english.LearnedWordEntity
import com.azimuton.data.roomstorage.models.english.WordEntity
import com.azimuton.data.roomstorage.models.french.FrenchWordEntity
import com.azimuton.data.roomstorage.models.french.LearnedFrenchWordEntity
import com.azimuton.data.roomstorage.models.german.GermanWordEntity
import com.azimuton.data.roomstorage.models.german.LearnedGermanWordEntity
import com.azimuton.data.roomstorage.models.italy.ItalyWordEntity
import com.azimuton.data.roomstorage.models.italy.LearnedItalyWordEntity
import com.azimuton.data.roomstorage.models.spain.LearnedSpainWordEntity
import com.azimuton.data.roomstorage.models.spain.SpainWordEntity
import com.azimuton.data.roomstorage.room.dao.english.LearnedWordsDao
import com.azimuton.data.roomstorage.room.dao.english.WordDao
import com.azimuton.data.roomstorage.room.dao.french.FrenchWordDao
import com.azimuton.data.roomstorage.room.dao.french.LearnedFrenchWordsDao
import com.azimuton.data.roomstorage.room.dao.german.GermanWordDao
import com.azimuton.data.roomstorage.room.dao.german.LearnedGermanWordsDao
import com.azimuton.data.roomstorage.room.dao.italy.ItalyWordDao
import com.azimuton.data.roomstorage.room.dao.italy.LearnedItalyWordsDao
import com.azimuton.data.roomstorage.room.dao.spain.LearnedSpainWordsDao
import com.azimuton.data.roomstorage.room.dao.spain.SpainWordDao

@Database(entities = [WordEntity::class, LearnedWordEntity::class,
    SpainWordEntity::class, LearnedSpainWordEntity::class,
    FrenchWordEntity::class, LearnedFrenchWordEntity::class,
            GermanWordEntity::class, LearnedGermanWordEntity::class,
            ItalyWordEntity::class, LearnedItalyWordEntity::class], version = 1)
abstract class AppRoomDatabase: RoomDatabase() {

    abstract fun wordDao(): WordDao
    abstract fun spainWordDao(): SpainWordDao
    abstract fun frenchWordDao(): FrenchWordDao
    abstract fun germanWordDao(): GermanWordDao
    abstract fun italyWordDao(): ItalyWordDao
    abstract fun learnedWordDao(): LearnedWordsDao
    abstract fun learnedSpainWordDao(): LearnedSpainWordsDao
    abstract fun learnedFrenchWordDao(): LearnedFrenchWordsDao
    abstract fun learnedGermanWordDao(): LearnedGermanWordsDao
    abstract fun learnedItalyWordDao(): LearnedItalyWordsDao

    companion object {
        @Volatile
        private var INSTANCE: AppRoomDatabase? = null

        fun getDatabase(context: Context): AppRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppRoomDatabase::class.java,
                    "words_database")
                    //.allowMainThreadQueries()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}