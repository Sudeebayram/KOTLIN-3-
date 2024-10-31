package com.example.uygulama12

import retrofit2.http.GET

interface ApiServices {
    @GET("countries")
    suspend fun getFlags(): List<FlagsModel>
}