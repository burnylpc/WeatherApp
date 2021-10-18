package com.example.myapplication.feature.feature_weather_screen.domain.model

data class WeatherDomainModel(val temperature: Double, val tempMax: Double, val tempMin: Double, val wind: WeatherWindDomainModel)
