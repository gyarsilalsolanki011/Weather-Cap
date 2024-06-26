package com.gyarsilalsolanki011.weathercap.dataclasses

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)