package com.example.myapplication.feature.feature_weather_screen.data.api

import com.example.myapplication.feature.feature_weather_screen.data.toDomain
import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherDomainModel

class WeatherRepoImpl(private val source: WeatherRemoteSource) : WeatherRepo {

    override suspend fun getWeather(): WeatherDomainModel {
        return source.getWeather().toDomain()
    }

}