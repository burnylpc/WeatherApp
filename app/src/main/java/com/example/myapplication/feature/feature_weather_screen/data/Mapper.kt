package com.example.myapplication.feature.feature_weather_screen.data

import com.example.myapplication.feature.feature_weather_screen.data.api.model.WeatherModel
import com.example.myapplication.feature.feature_weather_screen.data.api.model.WeatherSpeedModel
import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherDomainModel
import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherWindDomainModel

fun WeatherModel.toDomain(): WeatherDomainModel{
    return WeatherDomainModel(
        this.main.temp,
        this.main.tempMax,
        this.main.tempMin,
        wind.toDomain()
    )
}

fun WeatherSpeedModel.toDomain() = WeatherWindDomainModel(speed , degree)