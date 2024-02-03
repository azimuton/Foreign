package com.azimuton.foreign.viewmodels.spain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.models.spain.WordSpain
import com.azimuton.domain.usecase.spain.SpainWordInsertUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TranslateSpainViewModel @Inject constructor(
    private var insertSpainUseCase: SpainWordInsertUseCase
) : ViewModel(){
    fun insert(word: WordSpain){
        viewModelScope.launch(Dispatchers.IO){
            insertSpainUseCase.execute(word)
        }
    }
}