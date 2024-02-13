package com.azimuton.foreign.viewmodels.spain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.models.spain.WordSpain
import com.azimuton.domain.usecase.spain.SpainWordCopyIdUseCase
import com.azimuton.domain.usecase.spain.SpainWordCopyUseCase
import com.azimuton.domain.usecase.spain.SpainWordDeleteAllUseCase
import com.azimuton.domain.usecase.spain.SpainWordDeleteUseCase
import com.azimuton.domain.usecase.spain.SpainWordGetAllUseCase
import com.azimuton.domain.usecase.spain.SpainWordInsertUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LearnSpainViewModel @Inject constructor(
    private var wordGetAllUseCase: SpainWordGetAllUseCase,
    private var wordDeleteUseCase: SpainWordDeleteUseCase,
    private var wordDeleteAllUseCase: SpainWordDeleteAllUseCase,
    private var wordInsertUseCase: SpainWordInsertUseCase,
    private var wordCopyUseCase: SpainWordCopyUseCase,
    private var wordCopyIdUseCase: SpainWordCopyIdUseCase
) : ViewModel() {

    fun getAll(){
        viewModelScope.launch(Dispatchers.IO){
            wordGetAllUseCase.execute()
        }
    }
    fun delete(word : WordSpain){
        viewModelScope.launch(Dispatchers.IO){
            wordDeleteUseCase.execute(word)
        }
    }
    fun deleteAll(){
        viewModelScope.launch(Dispatchers.IO){
            wordDeleteAllUseCase.execute()
        }
    }
    fun insert(word: WordSpain){
        viewModelScope.launch(Dispatchers.IO){
            wordInsertUseCase.execute(word)
        }
    }
    fun copy(){
        viewModelScope.launch(Dispatchers.IO){
            wordCopyUseCase.execute()
        }
    }
    fun copyId(id : Int){
        viewModelScope.launch(Dispatchers.IO){
            wordCopyIdUseCase.execute(id)
        }
    }
}