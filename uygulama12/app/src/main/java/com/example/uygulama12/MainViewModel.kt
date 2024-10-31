package com.example.uygulama12

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
class MainViewModel @Inject constructor() : ViewModel(){
    private val _count = mutableStateOf(0)
    val count : State<Int> = _count
}