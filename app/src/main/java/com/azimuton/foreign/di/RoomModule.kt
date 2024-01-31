package com.azimuton.foreign.di

import android.content.Context
import com.azimuton.data.roomstorage.room.AppRoomDatabase
import com.azimuton.data.roomstorage.room.dao.english.LearnedWordsDao
import com.azimuton.data.roomstorage.room.dao.english.WordDao
import com.azimuton.data.roomstorage.room.dao.spain.LearnedSpainWordsDao
import com.azimuton.data.roomstorage.room.dao.spain.SpainWordDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RoomModule {

    @Singleton
    @Provides
    fun provideAppDatabase(
        @ApplicationContext appContext: Context
    ): AppRoomDatabase {
        return AppRoomDatabase.getDatabase(context = appContext)
    }

    @Singleton
    @Provides
    fun provideWordDao(appRoomDatabase : AppRoomDatabase): WordDao {
        return appRoomDatabase.wordDao()
    }

    @Singleton
    @Provides
    fun provideSpainWordDao(appRoomDatabase : AppRoomDatabase): SpainWordDao {
        return appRoomDatabase.spainWordDao()
    }

    @Singleton
    @Provides
    fun provideLearnedWordsDao(appRoomDatabase : AppRoomDatabase): LearnedWordsDao {
        return appRoomDatabase.learnedWordDao()
    }

    @Singleton
    @Provides
    fun provideLearnedSpainWordsDao(appRoomDatabase : AppRoomDatabase): LearnedSpainWordsDao {
        return appRoomDatabase.learnedSpainWordDao()
    }
}