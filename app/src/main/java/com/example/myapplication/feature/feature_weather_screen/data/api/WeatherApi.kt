package com.example.myapplication.feature.feature_weather_screen.data.api

import com.example.myapplication.feature.feature_weather_screen.data.api.model.WeatherModel
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

//77f04c24400418f18b935291932c4dfc

//api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}

interface WeatherApi {

    @GET("data/2.5/weather")
    suspend fun getWeather( //suspend - значит можно остановить
        @Query("q") cityName: String,
        @Query("appid") appId: String = "77f04c24400418f18b935291932c4dfc",
        @Query("units") units: String = "metric"
    ): WeatherModel

}