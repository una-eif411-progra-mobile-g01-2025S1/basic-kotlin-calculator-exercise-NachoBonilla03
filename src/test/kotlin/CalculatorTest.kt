package org.example.calculator

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    //Test cases for addition operations
    @Test  //Positive values test
    @DisplayName("Should return the sum of 2 positive numbers")
    fun testPositiveAddition() {
        // Arrange
        val a:Double  = 3.0
        val b:Double = 2.0
        // Act
        val result:Double  = calculator.add(a, b)
        // Assert
        assertEquals(5.0, result, "3.0 + 2.0 should equal 5.0")
    }

    @Test //Negative values test
    @DisplayName("Should return the sum of 2 negative numbers")
    fun testNegativeAddition() {
        // Arrange
        val a:Double  = -3.0
        val b:Double  = -2.0
        // Act
        val result:Double  = calculator.add(a, b)
        // Assert
        assertEquals(-5.0, result, "-3.0 + -2.0 should equal -5.0")
    }


    @Test //Addition with zero
    @DisplayName("Should return the sum of 2 negative numbers")
    fun testZeroAddition() {
        // Arrange
        val a:Double = -3.0
        val b:Double  = 0.0
        // Act
        val result:Double  = calculator.add(a, b)
        // Assert
        assertEquals(-3.0, result, "-3.0 + 0.0 should equal -5.0")
    }

    @Test //Addition with edge values
    @DisplayName("Should return the sum of 2 negative numbers")
    fun testEdgeValuesAddition() {
        // Arrange
        val a:Double =  999999999999.0
        val b:Double  = 0.000000002
        // Act
        val result:Double  = calculator.add(a, b)
        // Assert
        assertEquals(999999999999.000000002, result, "1_000_000_000.0 + 0.000000002 should equal 999999999999.000000002")
    }





    // TODO: Create your subtraction tests
    @Test
    fun testSubtraction() {
        // Implement your test
    }

    // TODO: Create your multiplication tests
    @Test
    fun testMultiplication() {
        // Implement your test
    }

    // TODO: Create your division tests
    @Test
    fun testDivision() {
        // Implement your test
    }

    // TODO: Create error case tests
    @Test
    fun testErrorCases() {
        // Implement your test
    }
}