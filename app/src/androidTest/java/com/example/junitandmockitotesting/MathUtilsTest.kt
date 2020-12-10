package com.example.junitandmockitotesting

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test
import java.lang.ArithmeticException

class MathUtilsTest : TestCase() {

   var mathUtils: MathUtils

    init {
         mathUtils = MathUtils()
    }

    @Test
    fun testAdd() {
        val expected: Int = 10
        val actual: Int = mathUtils.add(5,5)
        assertEquals(expected, actual)
    }

    @Test
    fun testComputeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10.0))

    }

    @Test
    fun testDivide() {
       // assertThrows(ArithmeticException.class, {mathUtils.divide(1,0)}, "Divide by zero should throw")
    }


}