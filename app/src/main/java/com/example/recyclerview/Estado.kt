package com.example.recyclerview

import java.io.Serializable

data class Estado(
    val nome: String,
    val capital: String,
    val populacao: String,
    val regiao: String,
    val bandeiraResId: Int
) : Serializable
