package com.example.myapplication.feature.feature_weather_screen.data.api

import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherDomainModel

interface WeatherRepo {
    suspend fun getWeather(cityName: String): WeatherDomainModel
}