package org.example.calculator

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
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
    @DisplayName("Should return the sum of a negative number and zero")
    fun testZeroAddition() {
        // Arrange
        val a:Double = -3.0
        val b:Double  = 0.0
        // Act
        val result:Double  = calculator.add(a, b)
        // Assert
        assertEquals(-3.0, result, "-3.0 + 0.0 should equal -3.0")
    }

    @Test //Addition with edge values
    @DisplayName("Should return the sum of 2 edge values")
    fun testEdgeValuesAddition() {
        // Arrange
        val a:Double =  999999999999.0
        val b:Double  = 0.000000002
        // Act
        val result:Double  = calculator.add(a, b)
        val expected:Double = 999999999999.000000002
        val tolerance:Double =  0.000000001
        // Assert
        assertEquals(expected, result,tolerance, "999999999999.0 +0.000000002 should equal 999999999999.000000002")
    }



    //Test cases for substraction  operations
    @Test  //Positive values test
    @DisplayName("Should return the sub of 2 positive numbers")
    fun testPositiveSubtraction() {
        // Arrange
        val a:Double  = 3.0
        val b:Double = 2.0
        // Act
        val result:Double  = calculator.subtract(a, b)
        // Assert
        assertEquals(1.0, result, "3.0 - 2.0 should equal 1.0")
    }

    @Test //Negative values test
    @DisplayName("Should return the sub of 2 negative numbers")
    fun testNegativeSubtraction() {
        // Arrange
        val a:Double  = -3.0
        val b:Double  = -2.0
        // Act
        val result:Double  = calculator.subtract(a, b)
        // Assert
        assertEquals(-1.0, result, "-3.0 - -2.0 should equal -1.0")
    }


    @Test //Subtraction with zero
    @DisplayName("Should return the sub of a negative number and zero")
    fun testZeroSubtraction() {
        // Arrange
        val a:Double = -3.0
        val b:Double  = 0.0
        // Act
        val result:Double  = calculator.subtract(a, b)
        // Assert
        assertEquals(-3.0, result, "-3.0 - 0.0 should equal -3.0")
    }

    @Test //Subtraction with edge values
    @DisplayName("Should return the sub of 2 edge values")
    fun testEdgeValuesSubtraction() {
        // Arrange
        val a:Double =  999999999.0
        val b:Double  = 0.0002
        // Act
        val result:Double  = calculator.subtract(a, b)
        val expected:Double = 999999998.9998
        val tolerance:Double =  0.00001
        // Assert
        assertEquals(expected, result,tolerance, "999999999.0 - 0.0002 should equal 999999998.9998")
    }


    //Test cases for multiplication operations
    @Test  //Positive values test
    @DisplayName("Should return the multiplication of 2 positive numbers")
    fun testPositiveMultiplication() {
        // Arrange
        val a:Double  = 3.0
        val b:Double = 2.0
        // Act
        val result:Double  = calculator.multiply(a, b)
        // Assert
        assertEquals(6.0, result, "3.0 * 2.0 should equal 6.0")
    }

    @Test //Negative values test
    @DisplayName("Should return the multiplication of 2 negative numbers")
    fun testNegativeMultiplication() {
        // Arrange
        val a:Double  = -3.0
        val b:Double  = -2.0
        // Act
        val result:Double  = calculator.multiply(a, b)
        // Assert
        assertEquals(6.0, result, "-3.0 * -2.0 should equal 6.0")
    }


    @Test //Multiplication with zero
    @DisplayName("Should return the multiplication of a negative number and zero")
    fun testZeroMultiplication() {
        // Arrange
        val a:Double = -3.0
        val b:Double  = 0.0
        // Act
        val result:Double  = calculator.multiply(a, b)
        // Assert
        assertEquals(0.0, result, "-3.0 * 0.0 should equal 0.0")
    }

    @Test //Multiplication with edge values
    @DisplayName("Should return the sum of 2 edge values")
    fun testEdgeValuesMultiplication() {
        // Arrange
        val a:Double =  99999.0
        val b:Double  = 0.000000002
        // Act
        val result:Double  = calculator.multiply(a, b)
        val expected:Double = 0.000199998
        val tolerance:Double =  0.000000001
        // Assert
        assertEquals(expected, result,tolerance, "99999.0  * 0.000000002 should equal 0.000199998")
    }


    //Test cases for division operations
    @Test  //Positive values test
    @DisplayName("Should return the division of 2 positive numbers")
    fun testPositiveDivision() {
        // Arrange
        val a:Double  = 55.0
        val b:Double = 7.0
        // Act
        val result:Double  = calculator.divide(a, b)
        // Assert
        assertEquals(7.857142857142857, result, "55.0/7.0 should equal 7.857142857142857")
    }

    @Test //Negative values test
    @DisplayName("Should return the division of 2 negative numbers")
    fun testNegativeDivision() {
        // Arrange
        val a:Double  = -15.0
        val b:Double  = -2.0
        // Act
        val result:Double  = calculator.divide(a, b)
        // Assert
        assertEquals(7.5, result, "-15.0 / -2.0 should equal 7.5")
    }


    @Test //Division with zero
    @DisplayName("Should return the error case")
    fun testZeroDivision() {
        // Arrange
        val a:Double = -3.0
        val b:Double  = 0.0
        // Act
        val exception = assertThrows<IllegalArgumentException> {
            calculator.divide(a, b)
        }
        // Assert
        assertEquals("b must be non-zero", exception.message, "Exception message should match expected")
    }

    @Test //Division with edge values
    @DisplayName("Should return the division of 2 edge values")
    fun testEdgeValuesDivision() {
        // Arrange
        val a: Double = 1000000.0
        val b: Double = -5.75
        // Act
        val result:Double  = calculator.divide(a, b)
        val expected:Double = -173913.04347826087
        val tolerance:Double =  0.000000001
        // Assert
        assertEquals(expected, result,tolerance, "1000000.0 /-5.75 should equal -173913.04347826087")
    }


    // TODO: Create error case tests
    @Test
    fun testErrorCases() {
        // Implement your test
    }
}