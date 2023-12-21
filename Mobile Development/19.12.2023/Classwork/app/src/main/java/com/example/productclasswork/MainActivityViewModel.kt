package com.example.productclasswork

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewProduct

////MVVM
//class MainActivityViewProduct : ViewProduct() {
//
//    val productList = mutableListOf<Product>()
//
//    var productName = MutableLiveData<String>()
//    var productCode = MutableLiveData<String>()
//    var productDescription = MutableLiveData<String>()
//
//    fun aboutProduct(name : String, code : String) {
//        productName.postValue(name)
//        productCode.postValue(code)
//    }
//
//    fun productDescription() {
//        productDescription.postValue("${name.value} ${code.value}")
//    }
//}

//MVVM
class MainActivityViewProduct : ViewProduct() {

    val productList = mutableListOf<Product>()

    var name = MutableLiveData<String>()
    var surName = MutableLiveData<String>()
    var fullName = MutableLiveData<String>()

    fun productName(prm : String, surname : String) {
        name.postValue(prm)
        surName.postValue(surname)
    }

    fun productDescription() {
        fullName.postValue("${name.value} ${surName.value}")
    }
}