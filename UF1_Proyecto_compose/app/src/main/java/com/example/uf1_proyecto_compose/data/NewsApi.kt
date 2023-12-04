package com.example.uf1_proyecto_compose.data

import retrofit2.http.GET

interface NewsApi {
    @GET("json")
    suspend fun getArticles(): Articles
}