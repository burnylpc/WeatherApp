package com.example.myapplication.feature.feature_wind_screen.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityWindBinding

class WindScreenActivity : AppCompatActivity() {

    private val binding: ActivityWindBinding by viewBinding(ActivityWindBinding::bind)

    @SuppressLint("StringFormatMatches")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wind)
        val speed= intent.extras?.get("speed")
        val degree = intent.extras?.get("degree")
        binding.tvWind.text = speed.toString()
        binding.tvDegree.text = degree.toString()
    }

}