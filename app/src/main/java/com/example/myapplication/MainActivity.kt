package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.feature.feature_weather_screen.ui.WeatherScreenActivity
import com.example.myapplication.feature.feature_wind_screen.ui.WindScreenActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { //onCreate - 1 из методов жизненного цикла, онвы зывается, когда приложение создано
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //метод устанавливает вёрстку, соответствующий файл xml

        val weatherButton = findViewById<Button>(R.id.weatherButton)
        weatherButton.setOnClickListener{
            Intent(this,  WeatherScreenActivity::class.java).also { startActivity(it) }

        }

    }


}