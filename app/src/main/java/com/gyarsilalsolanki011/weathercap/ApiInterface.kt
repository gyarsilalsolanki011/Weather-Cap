package com.gyarsilalsolanki011.weathercap

import com.gyarsilalsolanki011.weathercap.dataclasses.WeatherCap
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("weather")
    fun getWeatherData(
        @Query("q") city: String,
        @Query("appid") appid: String,
        @Query("units") units: String
    ) : Call<WeatherCap>
}