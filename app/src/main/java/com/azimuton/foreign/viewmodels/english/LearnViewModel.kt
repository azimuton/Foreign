package com.azimuton.foreign.viewmodels.english

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.models.english.Word
import com.azimuton.domain.usecase.english.WordCopyIdUseCase
import com.azimuton.domain.usecase.english.WordCopyUseCase
import com.azimuton.domain.usecase.english.WordDeleteUseCase
import com.azimuton.domain.usecase.english.WordGetAllUseCase
import com.azimuton.domain.usecase.english.WordInsertUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LearnViewModel @Inject constructor(
    private var wordGetAllUseCase: WordGetAllUseCase,
    private var wordDeleteUseCase: WordDeleteUseCase,
    private var wordInsertUseCase: WordInsertUseCase,
    private var wordCopyUseCase: WordCopyUseCase,
    private var wordCopyIdUseCase: WordCopyIdUseCase
) : ViewModel() {

    fun getAll(){
        viewModelScope.launch{
            wordGetAllUseCase.execute()
        }
    }
    fun delete(word : Word){
        viewModelScope.launch(){
            wordDeleteUseCase.execute(word)
        }
    }
    fun insert(word: Word){
        viewModelScope.launch(){
            wordInsertUseCase.execute(word)
        }
    }
    fun copy(){
        viewModelScope.launch(){
            wordCopyUseCase.execute()
        }
    }

    fun copyId(id : Int) {
        viewModelScope.launch(){
            wordCopyIdUseCase.execute(id)
        }
    }
}