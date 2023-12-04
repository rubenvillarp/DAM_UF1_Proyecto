package com.example.uf1_proyecto_compose.data

class NewsRepository {
    private val newsService = ArticlesHelper.newsService

    suspend fun getArticles(): Articles {
        return newsService.getArticles()
    }
}