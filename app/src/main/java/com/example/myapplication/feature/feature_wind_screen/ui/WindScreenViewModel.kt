package com.example.myapplication.feature.feature_wind_screen.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.feature.feature_weather_screen.domain.WeatherInteractor
import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherDomainModel
import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherWindDomainModel
import kotlinx.coroutines.launch

class WindScreenViewModel() : ViewModel() {

    val liveData : MutableLiveData<WeatherWindDomainModel> = MutableLiveData()

}