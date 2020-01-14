package com.example.viewmodeldemo

import android.os.SystemClock
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import java.util.*

class ChronometerViewModel constructor(val savedStateHandle:SavedStateHandle):  ViewModel() {
    private val nameKey: String = "name"

    val name:LiveData<String>
    get() = savedStateHandle.getLiveData<String>(nameKey)


    fun setName(value:String) {
        savedStateHandle.set(nameKey,value)
    }
}