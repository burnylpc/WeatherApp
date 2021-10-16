package com.example.myapplication.feature.feature_weather_screen.di

import com.example.myapplication.feature.feature_weather_screen.data.api.WeatherApi
import com.example.myapplication.feature.feature_weather_screen.data.api.WeatherRemoteSource
import com.example.myapplication.feature.feature_weather_screen.data.api.WeatherRepo
import com.example.myapplication.feature.feature_weather_screen.data.api.WeatherRepoImpl
import com.example.myapplication.feature.feature_weather_screen.domain.WeatherInteractor
import com.example.myapplication.feature.feature_weather_screen.ui.WeatherScreenViewModel
import okhttp3.OkHttpClient
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
const val BASE_URL = "https://api.openweathermap.org/"
val appModule = module {

    //single Возвращает единственный элемент или выдает исключение, если массив пуст или имеет более одного элемента.

    single<OkHttpClient> {
        OkHttpClient.Builder()
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single<WeatherApi> {
        get<Retrofit>().create(WeatherApi::class.java)
    }

    single<WeatherRemoteSource> {
        WeatherRemoteSource(get<WeatherApi>())
    }

    single<WeatherRepo> {
        WeatherRepoImpl(get<WeatherRemoteSource>())
    }

    single<WeatherInteractor> {
        WeatherInteractor(get<WeatherRepo>())
    }

    viewModel<WeatherScreenViewModel> {
        WeatherScreenViewModel(get<WeatherInteractor>())
    }

}