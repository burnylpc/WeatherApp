package com.example.myapplication.feature.feature_weather_screen.domain

import com.example.myapplication.feature.feature_weather_screen.data.api.WeatherRepo
import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherDomainModel

class WeatherInteractor(private val repository: WeatherRepo) {

    suspend fun getWeather(cityName: String) : WeatherDomainModel {
        return repository.getWeather(cityName)
    }

}