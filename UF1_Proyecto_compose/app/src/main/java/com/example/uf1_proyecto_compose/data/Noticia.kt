package com.example.uf1_proyecto_compose.data

import java.net.URL

data class Noticia (
    val id:String,
    val url:String,
    val title:String,
    val contentHtml:String,
    val contentText:String,
    val datePublished:String,
    val dateModified:String,


)