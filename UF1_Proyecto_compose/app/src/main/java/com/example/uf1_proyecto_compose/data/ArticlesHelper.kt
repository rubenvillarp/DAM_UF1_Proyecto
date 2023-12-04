package com.example.uf1_proyecto_compose.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ArticlesHelper {
    private const val BASE_URL = "https://nhdiario.es/feed/"
    
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val newsService: NewsApi by lazy {
        retrofit.create(NewsApi::class.java)
    }
}