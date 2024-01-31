package com.azimuton.foreign.di

import com.azimuton.data.networkstorage.apimodelsentity.english.GetNewsDataSource
import com.azimuton.data.networkstorage.apimodelsentity.english.NewsDataSource
import com.azimuton.data.networkstorage.apimodelsentity.spain.GetSpainNewsDataSource
import com.azimuton.data.networkstorage.apimodelsentity.spain.SpainNewsDataSource
import com.azimuton.data.repository.networkrepository.english.NetworkRepositoryImpl
import com.azimuton.data.repository.networkrepository.spain.SpainNetworkRepositoryImpl
import com.azimuton.data.repository.roomrepository.english.LearnedWordsRepositoryImpl
import com.azimuton.data.repository.roomrepository.english.WordRepositoryImpl
import com.azimuton.data.repository.roomrepository.spain.LearnedSpainWordsRepositoryImpl
import com.azimuton.data.repository.roomrepository.spain.SpainWordRepositoryImpl
import com.azimuton.data.roomstorage.LearnedSpainWordsStorage
import com.azimuton.data.roomstorage.LearnedWordsStorage
import com.azimuton.data.roomstorage.SpainWordStorage
import com.azimuton.data.roomstorage.WordStorage
import com.azimuton.data.roomstorage.room.LearnedSpainWordStorageRoomImpl
import com.azimuton.data.roomstorage.room.LearnedWordStorageRoomImpl
import com.azimuton.data.roomstorage.room.SpainWordStorageRoomImpl
import com.azimuton.data.roomstorage.room.WordStorageRoomImpl
import com.azimuton.data.roomstorage.room.dao.english.LearnedWordsDao
import com.azimuton.data.roomstorage.room.dao.english.WordDao
import com.azimuton.data.roomstorage.room.dao.spain.LearnedSpainWordsDao
import com.azimuton.data.roomstorage.room.dao.spain.SpainWordDao
import com.azimuton.domain.repository.networkrepository.english.NetworkRepository
import com.azimuton.domain.repository.networkrepository.spain.SpainNetworkRepository
import com.azimuton.domain.repository.roomrepository.english.LearnedWordsRepository
import com.azimuton.domain.repository.roomrepository.english.WordRepository
import com.azimuton.domain.repository.roomrepository.spain.SpainLearnedWordsRepository
import com.azimuton.domain.repository.roomrepository.spain.SpainWordRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Singleton
    @Provides
    fun provideWordStorage(wordDao: WordDao): WordStorage {
        return WordStorageRoomImpl(wordDao = wordDao)
    }
    @Singleton
    @Provides
    fun provideSpainWordStorage(spainWordDao: SpainWordDao): SpainWordStorage {
        return SpainWordStorageRoomImpl(spainWordDao = spainWordDao)
    }
    @Singleton
    @Provides
    fun provideNetworkStorage(): NewsDataSource {
        return GetNewsDataSource()
    }
    @Singleton
    @Provides
    fun provideSpainNetworkStorage(): SpainNewsDataSource {
        return GetSpainNewsDataSource()
    }
    @Singleton
    @Provides
    fun provideLearnedWordsStorage(learnedWordsDao: LearnedWordsDao): LearnedWordsStorage {
        return LearnedWordStorageRoomImpl(learnedWordsDao = learnedWordsDao)
    }
    @Singleton
    @Provides
    fun provideLearnedSpainWordsStorage(learnedSpainWordsDao: LearnedSpainWordsDao): LearnedSpainWordsStorage {
        return LearnedSpainWordStorageRoomImpl(learnedSpainWordsDao = learnedSpainWordsDao)
    }

    @Singleton
    @Provides
    fun provideWordRepository(wordStorage: WordStorage): WordRepository {
        return  WordRepositoryImpl(wordStorage = wordStorage)
    }
    @Singleton
    @Provides
    fun provideSpainWordRepository(spainWordStorage: SpainWordStorage): SpainWordRepository {
        return  SpainWordRepositoryImpl(spainWordStorage = spainWordStorage)
    }

    @Singleton
    @Provides
    fun provideLearnedWordsRepository(learnedWordsStorage: LearnedWordsStorage): LearnedWordsRepository {
        return  LearnedWordsRepositoryImpl(learnedWordsStorage = learnedWordsStorage)
    }
    @Singleton
    @Provides
    fun provideLearnedSpainWordsRepository(learnedSpainWordsStorage: LearnedSpainWordsStorage): SpainLearnedWordsRepository {
        return  LearnedSpainWordsRepositoryImpl(learnedSpainWordsStorage = learnedSpainWordsStorage)
    }
    @Singleton
    @Provides
    fun provideNetworkRepository(networkStorage : NewsDataSource): NetworkRepository {
        return  NetworkRepositoryImpl(newsDataSource = networkStorage)
    }
    @Singleton
    @Provides
    fun provideSpainNetworkRepository(spainNetworkStorage : SpainNewsDataSource): SpainNetworkRepository {
        return  SpainNetworkRepositoryImpl(spainNewsDataSource = spainNetworkStorage)
    }
}