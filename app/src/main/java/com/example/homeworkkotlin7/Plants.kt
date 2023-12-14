package com.example.homeworkkotlin7

import java.io.Serializable

data class Plants(
    val plantsImage: String, //Картинка
    val name: String, //Название
    val leaves: Int //Листья
) : Serializable
