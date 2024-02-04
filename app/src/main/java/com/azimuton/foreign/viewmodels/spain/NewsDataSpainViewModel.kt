package com.azimuton.foreign.viewmodels.spain

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewsDataSpainViewModel : ViewModel(){
    val vmsImage : MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val vmsTitle : MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val vmsDesc : MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val vmsContent : MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
}