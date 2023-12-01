package com.example.uf1_proyecto_compose.data

import com.google.gson.annotations.SerializedName

data class Noticia(
    @SerializedName("id")
    var id: String,
    @SerializedName("url")
    var url: String,
    @SerializedName("title")
    var title: String,
    @SerializedName("content_text")
    var content: String,
    @SerializedName("image")
    var imgUrl: String,
    @SerializedName("tags")
    var tags: List<String>?
)