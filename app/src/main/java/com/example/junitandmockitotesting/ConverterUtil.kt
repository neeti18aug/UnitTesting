package com.example.junitandmockitotesting

class ConverterUtil {

    fun convertFahrenheitToCelsius(fahrenheit: Float): Float {
        return ((fahrenheit - 32) * 5 / 9)
    }

    fun convertCelsiusToFahrenheit(celsius: Float): Float {
        return ((celsius * 9 / 5) + 32)
    }
}