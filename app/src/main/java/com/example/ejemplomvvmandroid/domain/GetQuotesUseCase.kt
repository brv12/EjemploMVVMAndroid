package com.example.ejemplomvvmandroid.domain

import com.example.ejemplomvvmandroid.data.model.QuoteModel
import com.example.ejemplomvvmandroid.data.model.network.QuoteRepository

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}