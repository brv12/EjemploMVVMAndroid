package com.example.ejemplomvvmandroid.data.model.network

import com.example.ejemplomvvmandroid.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}