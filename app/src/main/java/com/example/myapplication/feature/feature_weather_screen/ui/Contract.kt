package com.example.myapplication.feature.feature_weather_screen.ui

import com.example.myapplication.base.Event
import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherDomainModel

data class ViewState(
    val weatherDomainModel: WeatherDomainModel,
    val errorMessage: String?
    //val isLoading: Boolean
)

sealed class UIEvent() : Event {
    object GetCurrentWeather: UIEvent()
}

sealed class DataEvent() : Event {
    //символизирует о том, что происходит (команда)
    //object OnLoadData: DataEvent()
    data class WeatherRequest(val weatherDomainModel: WeatherDomainModel) : DataEvent()
}