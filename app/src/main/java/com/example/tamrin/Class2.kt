package com.example.tamrin

import android.util.Log
import javax.inject.Inject

class Class2 @Inject constructor(
    private val num : Class1
) {
    fun family(){
        Log.d("mohammad","Eblis")
        num.name()
    }
}