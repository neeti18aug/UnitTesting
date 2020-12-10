package com.example.junitandmockitotesting

import junit.framework.Assert.assertEquals
import org.junit.Test

class ConverterUtilTest {

    @Test
    fun convertFahrenheitToCelsius() {
        val input: Float = 100f
        val expected: Float = 37.77778f
        val mConverterUtil: ConverterUtil = ConverterUtil()
        val actual: Float = mConverterUtil.convertFahrenheitToCelsius(input)
        assertEquals(expected, actual)
    }

    @Test
    fun convertCelsiusToFahrenheit() {
        val input: Float = 50f
        val expected: Float = 122f
        val mConverterUtil: ConverterUtil = ConverterUtil()
        val actual: Float = mConverterUtil.convertCelsiusToFahrenheit(input)
        assertEquals(expected, actual)
    }
}