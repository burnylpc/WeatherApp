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

    val weatherScreenViewModel by viewModel<WeatherScreenViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        weatherScreenViewModel.lifeData.observe(this, Observer(::render))
        weatherScreenViewModel.requestWeather()

        val windButton = findViewById<Button>(R.id.windButton)
        windButton.setOnClickListener{
            Intent(this, WindScreenActivity::class.java).also { startActivity(it) }
        }
    }

    private fun render(state: WeatherDomainModel) {
        findViewById<TextView>(R.id.tvTemperature).let { it.text = state.temperature }
        findViewById<TextView>(R.id.tvTempMax).let { it.text = state.tempMax }
        findViewById<TextView>(R.id.tvTempMin).let { it.text = state.tempMin }

    }

}