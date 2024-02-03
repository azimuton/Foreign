package com.azimuton.foreign.viewmodels.spain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.usecase.spain.SpainLearnedWordRandomUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WriteSpainViewModel @Inject constructor(
    private val learnedSpainWordRandomUseCase: SpainLearnedWordRandomUseCase) : ViewModel(){
    fun getRandomSpainWord() {
        viewModelScope.launch(){

        }
    }
}