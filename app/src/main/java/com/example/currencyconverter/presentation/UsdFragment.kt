package com.example.currencyconverter.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.currencyconverter.R
import com.example.currencyconverter.data.UsdRepository
import com.example.currencyconverter.data.UsdResponse
import kotlinx.android.synthetic.main.fragment_usd.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class UsdFragment:Fragment(), CoroutineScope {
    override val coroutineContext: CoroutineContext = Dispatchers.Main
    val repository = UsdRepository()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_usd, container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        buttonOk.setOnClickListener {
            val USD = EditUSD.text.toString()
            if (USD.isEmpty() || USD.isBlank()) return@setOnClickListener
                launch {
                    val response = repository.getUSD(USD)
                    response?.apply {
                        course.text = rates.RUB.toString()
                    }

                }

        }
    }
}