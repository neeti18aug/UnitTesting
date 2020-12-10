package com.example.junitandmockitotesting

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    /*
    *  the input is not valid if..
    * ...the username/password is empty
    * ...the username already taken
    * ...the confirmed password is not same as real password
    * ...the password contains less than 2 digits
    * */

    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (userName.isEmpty() || password.isEmpty()) {
            return false
        }
        if (userName in existingUsers) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}