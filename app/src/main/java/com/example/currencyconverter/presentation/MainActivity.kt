package com.example.currencyconverter.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.currencyconverter.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.host, UsdFragment())
            .commit()
    }
}