package com.azimuton.foreign.viewmodels.spain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.models.spain.WordSpain
import com.azimuton.domain.usecase.spain.SpainWordCopyIdUseCase
import com.azimuton.domain.usecase.spain.SpainWordCopyUseCase
import com.azimuton.domain.usecase.spain.SpainWordDeleteUseCase
import com.azimuton.domain.usecase.spain.SpainWordGetAllUseCase
import com.azimuton.domain.usecase.spain.SpainWordInsertUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LearnSpainViewModel @Inject constructor(
    private var wordGetAllUseCase: SpainWordGetAllUseCase,
    private var wordDeleteUseCase: SpainWordDeleteUseCase,
    private var wordInsertUseCase: SpainWordInsertUseCase,
    private var wordCopyUseCase: SpainWordCopyUseCase,
    private var wordCopyIdUseCase: SpainWordCopyIdUseCase
) : ViewModel() {

    fun getAll(){
        viewModelScope.launch{
            wordGetAllUseCase.execute()
        }
    }
    fun delete(word : WordSpain){
        viewModelScope.launch(){
            wordDeleteUseCase.execute(word)
        }
    }
    fun insert(word: WordSpain){
        viewModelScope.launch(){
            wordInsertUseCase.execute(word)
        }
    }
    fun copy(){
        viewModelScope.launch(){
            wordCopyUseCase.execute()
        }
    }
    fun copyId(id : Int){
        viewModelScope.launch(){
            wordCopyIdUseCase.execute(id)
        }
    }
}