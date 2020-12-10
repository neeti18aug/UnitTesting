package com.example.junitandmockitotesting

class MathUtils {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    //TDD
    fun computeCircleArea(radius: Double): Double {
        return Math.PI * radius * radius
    }

    fun divide(a: Int, b: Int): Int {
        return a / b
    }
}