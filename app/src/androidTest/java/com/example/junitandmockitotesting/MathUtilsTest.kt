package com.example.junitandmockitotesting

import junit.framework.TestCase
import org.junit.Test

class MathUtilsTest : TestCase() {

    private var mathUtils: MathUtils = MathUtils()

    @Test
    private fun testAdd() {
        val expected = 10
        mathUtils.add(5, 5).also { assertEquals(expected, it) }
    }

    @Test
    private fun testComputeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10.0))
    }
}