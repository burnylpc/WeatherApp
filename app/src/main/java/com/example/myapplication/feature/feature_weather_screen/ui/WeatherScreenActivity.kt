package com.example.myapplication.feature.feature_weather_screen.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.viewmodel.ext.android.viewModel

class WeatherScreenActivity() : AppCompatActivity() { //почему это добавили в манифест?

    val weatherViewModel by viewModel<WeatherScreenViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }





}