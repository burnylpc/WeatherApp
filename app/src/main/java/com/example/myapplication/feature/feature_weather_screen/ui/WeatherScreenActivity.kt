package com.example.myapplication.feature.feature_weather_screen.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.myapplication.R
import com.example.myapplication.feature.feature_weather_screen.domain.model.WeatherDomainModel
import com.example.myapplication.feature.feature_wind_screen.ui.WindScreenActivity
import org.koin.android.viewmodel.ext.android.viewModel



class WeatherScreenActivity() : AppCompatActivity() { //почему это добавили в манифест?

    private val weatherScreenViewModel by viewModel<WeatherScreenViewModel>()
    private var speed: Double = 0.0
    private var degree: Int = 0
    private val cityName = "Moscow"//R.id.tvCityName


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        weatherScreenViewModel.lifeData.observe(this, Observer(::render))
        weatherScreenViewModel.requestWeather(cityName)

        val windButton = findViewById<Button>(R.id.windButton)
        windButton.setOnClickListener {
            val intent = Intent(this, WindScreenActivity::class.java)//.also { startActivity(it) }
            intent.putExtra("speed", speed)
            intent.putExtra("degree", degree)
            startActivity(intent)
        }
    }

    private fun render(state: WeatherDomainModel) {
        findViewById<TextView>(R.id.tvTemperature).let { it.text = state.temperature.toString() }
        findViewById<TextView>(R.id.tvTempMax).let { it.text = state.tempMax.toString() }
        findViewById<TextView>(R.id.tvTempMin).let { it.text = state.tempMin.toString() }
        speed = state.wind.speedWind
        degree = state.wind.degree
    }

//https://github.com/skull615d/weather

}