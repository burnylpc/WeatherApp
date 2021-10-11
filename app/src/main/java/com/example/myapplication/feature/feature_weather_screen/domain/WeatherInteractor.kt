package com.example.myapplication.feature.feature_weather_screen.domain

import com.example.myapplication.feature.feature_weather_screen.data.api.WeatherRepo

class WeatherInteractor(private val repository: WeatherRepo) {

    suspend fun getWeather() : String {
        return repository.getWeather()
    }

}