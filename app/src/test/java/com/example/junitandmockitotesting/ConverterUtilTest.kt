@file:Suppress("DEPRECATION")

package com.example.junitandmockitotesting

import junit.framework.Assert.assertEquals
import org.junit.Test

class ConverterUtilTest {

    @Test
    fun convertFahrenheitToCelsius() {
        val input = 100f
        val expected = 37.77778f
        val mConverterUtil = ConverterUtil()
        val actual: Float = mConverterUtil.convertFahrenheitToCelsius(input)
        assertEquals(expected, actual)
    }

    @Test
    fun convertCelsiusToFahrenheit() {
        val input = 50f
        val expected = 122f
        val mConverterUtil = ConverterUtil()
        val actual: Float = mConverterUtil.convertCelsiusToFahrenheit(input)
        assertEquals(expected, actual)
    }
}