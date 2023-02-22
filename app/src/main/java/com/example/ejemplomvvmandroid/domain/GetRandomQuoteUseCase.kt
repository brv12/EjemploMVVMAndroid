package com.example.ejemplomvvmandroid.domain

import com.example.ejemplomvvmandroid.data.model.QuoteModel
import com.example.ejemplomvvmandroid.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    operator fun invoke(): QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}