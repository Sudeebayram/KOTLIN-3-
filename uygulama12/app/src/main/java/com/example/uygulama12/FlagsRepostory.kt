package com.example.uygulama12

import javax.inject.Inject

class FlagsRepostory @Inject constructor(private val apiServices: ApiServices) {
    suspend fun getAllFlags(): List<FlagsModel> = apiServices.getFlags()

}