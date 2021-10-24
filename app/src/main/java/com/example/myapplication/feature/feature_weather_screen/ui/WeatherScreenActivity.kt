package com.example.myapplication.feature.feature_weather_screen.ui

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherDomainModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityWeatherBinding
import com.example.myapplication.feature.feature_wind_screen.ui.WindScreenActivity
import com.example.myapplication.ulil.setDebouncingTextListener

class WeatherScreenActivity() : AppCompatActivity() {

    val weatherScreenViewModel by viewModel<WeatherScreenViewModel>()

    private val binding: ActivityWeatherBinding by viewBinding(ActivityWeatherBinding::bind)

    private var speed: Double = 0.0
    private var degree: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        weatherScreenViewModel.lifeData.observe(this, ::renderWeather)

        weatherScreenViewModel.requestWeather("Moscow")

        val cityEditText = findViewById<EditText>(R.id.tvCityName)

        cityEditText.setDebouncingTextListener { weatherScreenViewModel.requestWeather(it) }

        val windButton = findViewById<Button>(R.id.windButton)
        windButton.setOnClickListener {
            val intent = Intent(this, WindScreenActivity::class.java)//.also { startActivity(it) }
            intent.putExtra("speed", speed)
            intent.putExtra("degree", degree)
            startActivity(intent)
        }
    }

    private fun renderWeather(state: WeatherDomainModel) {
        with(binding) {
            tvTemperature.text = state.temperature.toString()
            tvTempMax.text = state.tempMax.toString()
            tvTempMin.text = state.tempMin.toString()
            speed = state.wind.speedWind
            degree = state.wind.degree
        }
    }

}