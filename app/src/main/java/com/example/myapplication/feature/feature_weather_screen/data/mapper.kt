package com.example.myapplication.feature.feature_weather_screen.data

import com.example.myapplication.feature.feature_weather_screen.data.api.model.WeatherModel
import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherDomainModel

fun WeatherModel.toDomain(): WeatherDomainModel{
    return WeatherDomainModel(
        this.main.temp
    )
}