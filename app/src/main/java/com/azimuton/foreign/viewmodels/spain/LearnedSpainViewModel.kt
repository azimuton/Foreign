package com.azimuton.foreign.viewmodels.spain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.models.english.LearnedWord
import com.azimuton.domain.models.spain.LearnedSpainWord
import com.azimuton.domain.usecase.english.LearnedWordDeleteUseCase
import com.azimuton.domain.usecase.english.LearnedWordGetAllUseCase
import com.azimuton.domain.usecase.english.LearnedWordRandomUseCase
import com.azimuton.domain.usecase.spain.SpainLearnedWordDeleteUseCase
import com.azimuton.domain.usecase.spain.SpainLearnedWordGetAllUseCase
import com.azimuton.domain.usecase.spain.SpainLearnedWordRandomUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LearnedSpainViewModel @Inject constructor(
    private var learnedSpainWordGetAllUseCase: SpainLearnedWordGetAllUseCase,
    private var learnedSpainWordDeleteUseCase: SpainLearnedWordDeleteUseCase,
    private val learnedSpainWordRandomUseCase: SpainLearnedWordRandomUseCase
) : ViewModel() {

    fun getAll(){
        viewModelScope.launch(Dispatchers.IO){
            learnedSpainWordGetAllUseCase.execute()
        }
    }
    fun delete(learnedSpainWord : LearnedSpainWord){
        viewModelScope.launch(Dispatchers.IO) {
            learnedSpainWordDeleteUseCase.execute(learnedSpainWord)
        }
    }
    fun random(){
        viewModelScope.launch(Dispatchers.IO){
            learnedSpainWordRandomUseCase.execute()
        }
    }
}