package org.example.calculator
/*
EIF411 - Diseño y Programación de Aplicaciones Móviles
Práctica de Laboratorio: Calculadora básica en Kotlin
Profesor: Maikol Guzmán Alán
Estudiante: Ignacio Bonilla Rojas
*/
class Calculator {

    fun add(a: Double, b: Double): Double {
        return a+b;
    }

    fun subtract(a: Double, b: Double): Double {
        return a-b;
    }

    fun multiply(a: Double, b: Double): Double {
        return a*b;
    }

    fun divide(a: Double, b: Double): Double {
        if(b==0.0){ //In case the b value is 0, throws an exception
            throw IllegalArgumentException("b must be non-zero")
        }
        return a/b;
    }
}