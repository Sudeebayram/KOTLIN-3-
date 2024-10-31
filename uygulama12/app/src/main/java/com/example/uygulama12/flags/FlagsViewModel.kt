package com.example.uygulama12.flags

import androidx.compose.runtime.Recomposer
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.uygulama12.FlagsModel
import com.example.uygulama12.GetFlagsUseCase
import javax.inject.Inject
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlin.text.Typography.dagger


@HiltViewModel
class FlagsViewModel @Inject constructor(
    private val getFlagsUseCase: GetFlagsUseCase
) : ViewModel(){
    private val _flags = mutableStateOf<List<FlagsModel>>(emptyList())
    val flags: State<List<FlagsModel>> = _flags


    init {
        getFlags()
        }

    private fun getFlags() {
        viewModelScope.launch {
            _flags.value = getFlagsUseCase()
        }
    }
    }
