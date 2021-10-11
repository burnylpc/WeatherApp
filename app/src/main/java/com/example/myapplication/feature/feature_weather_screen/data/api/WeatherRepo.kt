package com.example.myapplication.feature.feature_weather_screen.data.api

interface WeatherRepo {
    suspend fun getWeather(): String
}