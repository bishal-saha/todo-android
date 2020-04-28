package com.gentryx.todoapp.util

import com.gentryx.todoapp.util.Validator.validateEmail
import com.gentryx.todoapp.util.Validator.validatePassword
import org.junit.Assert.*
import org.junit.Test

class ValidatorTest {

    @Test
    fun validateEmail_whenValidEmail_returnTrue() {
        // GIVEN a valid email
        val email = "demo1@gmail.com"

        // WHEN you call a validate function validateEmail()
        val result = validateEmail(email)

        // THEN we should get a true value
        assertTrue(result)
    }

    @Test
    fun validatePassword_whenValidPassword_returnTrue() {
        assertEquals(true, validatePassword("1234567"))
    }
}