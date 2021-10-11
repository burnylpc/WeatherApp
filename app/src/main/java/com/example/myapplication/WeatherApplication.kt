package com.example.myapplication

import android.app.Application
import com.example.myapplication.feature.feature_weather_screen.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class WeatherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin {
            androidLogger()
            androidContext(this@WeatherApplication) //мы явно указали контекст (this@WeatherApplication), т.е. из класса WeatherApplication
            modules(appModule)
        }
    }

}
