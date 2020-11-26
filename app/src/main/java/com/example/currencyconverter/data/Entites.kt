package com.example.currencyconverter.data

data class UsdResponse(
    val rates: UsdItem,
    val EUR:String,
    val base: String

)
{
    data class UsdItem(
        val RUB: Double
    )

}