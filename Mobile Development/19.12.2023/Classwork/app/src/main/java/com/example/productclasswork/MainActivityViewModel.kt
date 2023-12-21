package com.example.productclasswork

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val productList = mutableListOf<Product>()

    var productName = MutableLiveData<String>()
    var productCode = MutableLiveData<String>()
    var productDescription = MutableLiveData<String>()

    fun aboutProduct(name : String, code : String) {
        productName.postValue(name)
        productCode.postValue(code)
    }

    fun updateProductDescription() {
        productDescription.value = "Product details - ${productName.value} ${productCode.value}"
    }
    }
