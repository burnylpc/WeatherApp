package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { //onCreate - 1 из методов жизненного цикла, онвы зывается, когда приложение создано
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //метод устанавливает вёрстку, соответствующий файл xml

//        val textView = findViewById<TextView>(R.id.textView) //нашли по id с помощью генерируемого класса R (реестр имен?)
//        textView.text = "Погода:" //все, что есть в верстке игнорируется и устанавливается программно
//
//        textView.text = presenter.gerTemperature()
//
//
//
//        val list = listOf(1, 2, 3, 3, 4, 5)
//
//        val filter = list.filter { it >= 3 }
//
//        Log.d("TAB", "$filter") //что за Log? d?
//
//        filter.let { list -> textView.text = list.toString() }




    }


}