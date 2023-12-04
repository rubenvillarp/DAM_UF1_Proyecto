package com.example.uf1_proyecto_compose.data

import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("author")
    val author: Author,
    @SerializedName("authors")
    val authors: List<Author>,
    @SerializedName("content_html")
    val contentHtml: String,
    @SerializedName("content_text")
    val contentText: String,
    @SerializedName("date_modified")
    val dateModified: String,
    @SerializedName("date_published")
    val datePublished: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("tags")
    val tags: List<String>,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String
)
