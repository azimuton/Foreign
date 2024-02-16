package com.azimuton.foreign.viewmodels.english

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.models.english.LearnedWord
import com.azimuton.domain.usecase.english.LearnedWordCountUseCase
import com.azimuton.domain.usecase.english.LearnedWordDeleteUseCase
import com.azimuton.domain.usecase.english.LearnedWordGetAllUseCase
import com.azimuton.domain.usecase.english.LearnedWordRandomUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LearnedViewModel @Inject constructor(
    private var learnedWordGetAllUseCase: LearnedWordGetAllUseCase,
    private var learnedWordDeleteUseCase: LearnedWordDeleteUseCase,
    private val learnedWordRandomUseCase: LearnedWordRandomUseCase,
    private val learnedWordCountUseCase: LearnedWordCountUseCase
) : ViewModel() {

    fun getAll(){
        viewModelScope.launch(Dispatchers.IO){
            learnedWordGetAllUseCase.execute()
        }
    }
    fun delete(learnedWord : LearnedWord){
        viewModelScope.launch(Dispatchers.IO){
            learnedWordDeleteUseCase.execute(learnedWord)
       }
    }
    fun random(){
        viewModelScope.launch(Dispatchers.IO){
            learnedWordRandomUseCase.execute()
        }
    }
    fun count(){
        viewModelScope.launch(Dispatchers.IO) {
            learnedWordCountUseCase.execute()
        }
    }
}