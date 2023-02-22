package com.example.ejemplomvvmandroid.data.model.network

import com.example.ejemplomvvmandroid.data.model.QuoteModel
import com.example.ejemplomvvmandroid.data.model.QuoteProvider

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}