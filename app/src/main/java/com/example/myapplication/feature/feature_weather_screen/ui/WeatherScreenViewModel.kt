package com.example.myapplication.feature.feature_weather_screen.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.base.BaseViewModel
import com.example.myapplication.base.Event
import com.example.myapplication.feature.feature_weather_screen.domain.WeatherInteractor
import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherDomainModel
import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherWindDomainModel
import kotlinx.coroutines.launch

class WeatherScreenViewModel(private val weatherInteractor: WeatherInteractor) : BaseViewModel<ViewState>() {

    val lifeData : MutableLiveData<WeatherDomainModel> = MutableLiveData()

    fun requestWeather(cityName: String) {

        viewModelScope.launch {
            try {
                val result =  weatherInteractor.getWeather(cityName)
                lifeData.postValue(result)
            } catch (e: Exception){
                e
            }
        }

    }

    override fun initialViewState(): ViewState {
        return ViewState(WeatherDomainModel(0.0, 0.0, 0.0, WeatherWindDomainModel(0.0, 0.0)), "")
    }

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when(event) {
            is DataEvent.WeatherRequest -> {
                weatherInteractor.getWeather("Moscow")
            }
        }
        return null
    }

}

//object OnLoadData: DataEvent()
//data class SuccessWeatherRequest(val weatherDomainModel: WeatherDomainModel) : DataEvent()