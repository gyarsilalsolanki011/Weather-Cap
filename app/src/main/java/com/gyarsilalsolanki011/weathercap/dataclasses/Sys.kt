package com.gyarsilalsolanki011.weathercap.dataclasses

data class Sys(
    val country: String,
    val id: Int,
    val sunrise: Int,
    val sunset: Int,
    val type: Int
)