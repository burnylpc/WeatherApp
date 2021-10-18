package com.example.myapplication.feature.feature_weather_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class WeatherMainModel(
    @SerializedName("temp")
    val temp: Double,
    @SerializedName("temp_min")
    val tempMin: Double,
    @SerializedName("temp_max")
    val tempMax: Double
)



//"wind": {
//    "speed": 1.5,
//    "deg": 350
//},

//"weather": [
//{
//    "id": 800,
//    "main": "Clear",
//    "description": "clear sky",
//    "icon": "01d"
//}
//],
//"base": "stations",
//"main": {
//    "temp": 282.55,
//    "feels_like": 281.86,
//    "temp_min": 280.37,
//    "temp_max": 284.26,
//    "pressure": 1023,
//    "humidity": 100
//},}
