package com.example.uf1_proyecto_compose.data


import com.google.gson.annotations.SerializedName

data class Author(
    @SerializedName("avatar")
    val avatar: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)