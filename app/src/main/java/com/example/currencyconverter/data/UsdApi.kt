package com.example.currencyconverter.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UsdApi {
    @GET ("latest?")
    fun getUSD(@Query("base") start2:String): Call<UsdResponse>
}