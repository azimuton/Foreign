package com.azimuton.foreign.di

import com.azimuton.domain.repository.networkrepository.english.NetworkRepository
import com.azimuton.domain.repository.networkrepository.spain.SpainNetworkRepository
import com.azimuton.domain.repository.roomrepository.english.LearnedWordsRepository
import com.azimuton.domain.repository.roomrepository.english.WordRepository
import com.azimuton.domain.repository.roomrepository.spain.SpainLearnedWordsRepository
import com.azimuton.domain.repository.roomrepository.spain.SpainWordRepository
import com.azimuton.domain.usecase.*
import com.azimuton.domain.usecase.english.GetNewsUseCase
import com.azimuton.domain.usecase.english.LearnedWordDeleteUseCase
import com.azimuton.domain.usecase.english.LearnedWordGetAllUseCase
import com.azimuton.domain.usecase.english.LearnedWordRandomUseCase
import com.azimuton.domain.usecase.english.WordCopyUseCase
import com.azimuton.domain.usecase.english.WordDeleteAllUseCase
import com.azimuton.domain.usecase.english.WordDeleteUseCase
import com.azimuton.domain.usecase.english.WordGetAllUseCase
import com.azimuton.domain.usecase.english.WordGetWordByIdUseCase
import com.azimuton.domain.usecase.english.WordInsertUseCase
import com.azimuton.domain.usecase.spain.SpainGetNewsUseCase
import com.azimuton.domain.usecase.spain.SpainLearnedWordDeleteUseCase
import com.azimuton.domain.usecase.spain.SpainLearnedWordGetAllUseCase
import com.azimuton.domain.usecase.spain.SpainLearnedWordRandomUseCase
import com.azimuton.domain.usecase.spain.SpainWordCopyUseCase
import com.azimuton.domain.usecase.spain.SpainWordDeleteAllUseCase
import com.azimuton.domain.usecase.spain.SpainWordDeleteUseCase
import com.azimuton.domain.usecase.spain.SpainWordGetAllUseCase
import com.azimuton.domain.usecase.spain.SpainWordGetWordByIdUseCase
import com.azimuton.domain.usecase.spain.SpainWordInsertUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Provides
    fun provideGetNewsUseCase(networkRepository: NetworkRepository) : GetNewsUseCase {
        return GetNewsUseCase(networkRepository = networkRepository)
    }
    @Provides
    fun provideSpainGetNewsUseCase(networkRepository: SpainNetworkRepository) : SpainGetNewsUseCase {
        return SpainGetNewsUseCase(spainNetworkRepository = networkRepository)
    }

    @Provides
    fun provideWordDeleteUseCase(wordRepository: WordRepository): WordDeleteUseCase {
        return  WordDeleteUseCase(wordRepository = wordRepository)
    }
    @Provides
    fun provideSpainWordDeleteUseCase(wordRepository: SpainWordRepository): SpainWordDeleteUseCase {
        return  SpainWordDeleteUseCase(wordSpainRepository = wordRepository)
    }
    @Provides
    fun provideWordCopyUseCase(wordRepository: WordRepository): WordCopyUseCase {
        return  WordCopyUseCase(wordRepository = wordRepository)
    }
    @Provides
    fun provideSpainWordCopyUseCase(wordRepository: SpainWordRepository): SpainWordCopyUseCase {
        return  SpainWordCopyUseCase(wordSpainRepository = wordRepository)
    }
    @Provides
    fun provideWordDeleteAllUseCase(wordRepository: WordRepository): WordDeleteAllUseCase {
        return  WordDeleteAllUseCase(wordRepository = wordRepository)
    }
    @Provides
    fun provideSpainWordDeleteAllUseCase(wordRepository: SpainWordRepository): SpainWordDeleteAllUseCase {
        return  SpainWordDeleteAllUseCase(wordSpainRepository = wordRepository)
    }
    @Provides
    fun provideWordGetAllUseCase(wordRepository: WordRepository): WordGetAllUseCase {
        return WordGetAllUseCase(wordRepository = wordRepository)
    }
    @Provides
    fun provideSpainWordGetAllUseCase(wordRepository: SpainWordRepository): SpainWordGetAllUseCase {
        return SpainWordGetAllUseCase(wordSpainRepository = wordRepository)
    }
    @Provides
    fun provideWordInsertUseCase(wordRepository: WordRepository): WordInsertUseCase {
        return  WordInsertUseCase(wordRepository = wordRepository)
    }
    @Provides
    fun provideSpainWordInsertUseCase(wordRepository: SpainWordRepository): SpainWordInsertUseCase {
        return  SpainWordInsertUseCase(wordSpainRepository = wordRepository)
    }
//    @Provides
//    fun provideNoteUpdateUseCase(noteRepository: SaveDataNoteRepository):NoteUpdateUseCase{
//        return  NoteUpdateUseCase(saveDataNoteRepository = noteRepository)
//    }
    @Provides
    fun provideGetWordByIdUseCase(wordRepository: WordRepository): WordGetWordByIdUseCase {
        return  WordGetWordByIdUseCase(wordRepository = wordRepository)
    }
    @Provides
    fun provideSpainGetWordByIdUseCase(wordRepository: SpainWordRepository): SpainWordGetWordByIdUseCase {
        return  SpainWordGetWordByIdUseCase(wordSpainRepository = wordRepository)
    }
    @Provides
    fun provideLearnedWordsGetAllUseCase(learnedWordsRepository: LearnedWordsRepository) : LearnedWordGetAllUseCase {
        return LearnedWordGetAllUseCase(learnedWordsRepository = learnedWordsRepository)
    }
    @Provides
    fun provideSpainLearnedWordsGetAllUseCase(learnedWordsRepository: SpainLearnedWordsRepository) : SpainLearnedWordGetAllUseCase {
        return SpainLearnedWordGetAllUseCase(learnedSpainWordsRepository = learnedWordsRepository)
    }
    @Provides
    fun provideLearnedWordsDeleteUseCase(learnedWordsRepository: LearnedWordsRepository) : LearnedWordDeleteUseCase {
        return LearnedWordDeleteUseCase(learnedWordsRepository = learnedWordsRepository)
    }
    @Provides
    fun provideSpainLearnedWordsDeleteUseCase(learnedWordsRepository: SpainLearnedWordsRepository) : SpainLearnedWordDeleteUseCase {
        return SpainLearnedWordDeleteUseCase(spainLearnedWordsRepository = learnedWordsRepository)
    }
    @Provides
    fun provideLearnedWordsRandomUseCase(learnedWordsRepository : LearnedWordsRepository) : LearnedWordRandomUseCase {
        return LearnedWordRandomUseCase(learnedWordsRepository = learnedWordsRepository)
    }
    @Provides
    fun provideSpainLearnedWordsRandomUseCase(learnedWordsRepository : SpainLearnedWordsRepository) : SpainLearnedWordRandomUseCase {
        return SpainLearnedWordRandomUseCase(learnedSpainWordsRepository = learnedWordsRepository)
    }
}