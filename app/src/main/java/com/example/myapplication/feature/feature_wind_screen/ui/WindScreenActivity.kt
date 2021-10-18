package com.example.myapplication.feature.feature_wind_screen.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.myapplication.R
import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherWindDomainModel
import com.example.myapplication.feature.feature_weather_screen.ui.WeatherScreenViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class WindScreenActivity : AppCompatActivity() { //почему это добавили в манифест?

    val weatherScreenViewModel by viewModel<WeatherScreenViewModel>()

    val cityName = "Moscow"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wind)
        //weatherScreenViewModel.lifeData.observe(this, Observer(::render))
        weatherScreenViewModel.requestWeather(cityName)


    }

    private fun render(state: WeatherWindDomainModel) {
        findViewById<TextView>(R.id.tvWind).let { it.text = state.speedWind.toString() }
    }

}