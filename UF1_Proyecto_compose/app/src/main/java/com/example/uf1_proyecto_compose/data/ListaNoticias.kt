package com.example.uf1_proyecto_compose.data

import com.google.gson.annotations.SerializedName


data class ListaNoticias(
    @SerializedName("items")
    var noticias: MutableList<Noticia>
)
