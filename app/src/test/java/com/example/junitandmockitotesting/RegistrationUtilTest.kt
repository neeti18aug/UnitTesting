package com.example.junitandmockitotesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result= RegistrationUtil.validateRegistrationInput(
            userName = "",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result= RegistrationUtil.validateRegistrationInput(
            userName = "Neeti",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exits returns false`(){
        val result= RegistrationUtil.validateRegistrationInput(
            userName = "Peter",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result= RegistrationUtil.validateRegistrationInput(
            userName = "Chang",
            password = "",
            confirmPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password repeated incorrectly returns false`(){
        val result= RegistrationUtil.validateRegistrationInput(
            userName = "Chang",
            password = "1234",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits returns false`(){
        val result= RegistrationUtil.validateRegistrationInput(
            userName = "Chang",
            password = "sdsd",
            confirmPassword = "sdsd"
        )
        assertThat(result).isFalse()
    }
}