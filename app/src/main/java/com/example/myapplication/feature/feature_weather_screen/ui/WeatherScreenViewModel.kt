package com.example.myapplication.feature.feature_weather_screen.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.feature.feature_weather_screen.domain.WeatherInteractor
import kotlinx.coroutines.launch

class WeatherScreenViewModel(private val interactor: WeatherInteractor) : ViewModel() {

    val liveData : MutableLiveData<String> = MutableLiveData("")

    fun requestWeather() {

        viewModelScope.launch {
            liveData.postValue(interactor.getWeather())
        }

    }

}