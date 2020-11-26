package com.example.currencyconverter.data

import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UsdRepository {
    private val coroutinesContext = Dispatchers.IO
    private val UsdApi = Retrofit.Builder()
        .baseUrl("https://api.exchangeratesapi.io/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(UsdApi::class.java)

    suspend fun getUSD (start: String) = withContext(coroutinesContext){
        val usd = "$start"

        UsdApi.getUSD(usd).execute().body()
    }
}