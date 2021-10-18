package com.example.myapplication.feature.feature_weather_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class WeatherSpeedModel (
    @SerializedName("speed")
    val speed: Double,
    @SerializedName("degree")
    val degree: Int
)

//"wind": {
//    "speed": 1.5,
//    "deg": 350
//},