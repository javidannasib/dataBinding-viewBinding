package com.example.a1912_kotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var name = MutableLiveData<String>()
    var surName = MutableLiveData<String>()
    var fullName = MutableLiveData<String>()

    fun updateName(prm:String, surname : String) {
        name.postValue(prm)
        surName.postValue(surname)
    }

    fun updateFullName(){
        fullName.postValue("${name.value} ${surName.value}")
    }
}