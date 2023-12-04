package com.example.uf1_proyecto_compose.data

import com.google.gson.annotations.SerializedName

data class Articles(
    @SerializedName("feed_url")
    val feedUrl: String,
    @SerializedName("home_page_url")
    val homePageUrl: String,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("items")
    val items: List<Article>,
    @SerializedName("language")
    val language: String,
    @SerializedName("next_url")
    val nextUrl: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("user_comment")
    val userComment: String,
    @SerializedName("version")
    val version: String
)
