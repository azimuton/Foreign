package com.azimuton.foreign.viewmodels.english

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.models.english.Word
import com.azimuton.domain.usecase.english.WordInsertUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FrasalVerbsTwoModel @Inject constructor(
    private var insertUseCase: WordInsertUseCase
) : ViewModel(){
    fun insert(word: Word){
        viewModelScope.launch(Dispatchers.IO){
            insertUseCase.execute(word)
        }
    }
}