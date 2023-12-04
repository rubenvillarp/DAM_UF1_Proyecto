package com.example.uf1_proyecto_compose.ui.news

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.uf1_proyecto_compose.data.Articles
import com.example.uf1_proyecto_compose.data.NewsRepository
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {

    private val repository = NewsRepository()

    private val _articles = MutableLiveData<Articles>()
    val articles: LiveData<Articles> = _articles

    fun fetchNews() {
        viewModelScope.launch {
            try {
                val news = repository.getArticles()
                _articles.value = news
                Log.d("NEWS: ", news.toString())
            } catch (e: Exception) {
                Log.d("NEWSERROR", e.toString())
            }
        }
    }
}