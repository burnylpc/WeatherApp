package com.example.myapplication.feature.feature_weather_screen.data.api

class WeatherRepoImpl(private val source: WeatherRemoteSource) : WeatherRepo {

    override suspend fun getWeather(): String {
        return source.getWeather().weatherMainModel.temp
    }

}