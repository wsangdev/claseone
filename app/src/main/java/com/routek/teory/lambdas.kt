package com.routek.teory

fun main() {
    // Funciones lambda con DECLARACION DE TIPO
    val suma: (Int, Int) -> Int = { num1, num2 -> num1 + num2 }

    // Funcion Lambda sin Declaracion de Tipo
    val product = { num1:Int, num2:Int -> num1 * num2 }

    // Funciones Lambas en mas de Una Linea
    val sumita = { num1:Int, num2:Int ->
        val result = num1 + num2
        result
    }

    // Tengo una lista y la quiero sumar
    val pares = listOf(2, 4, 6, 8, 12)

    val sumaPares = pares.sum()
//    println("el resultado de sumar pares es $sumaPares")

    val doubleNumers = pares.map{it * 2}
//    println("lista de pares elevados al doble: $doubleNumers")

    // FILTER => SELECCIONA algunos ELEMENTOS con Base a Una CONDICION
    // MAP => TRANSFORMA cada Elemento

    // Ejmplo de funcion Filter
    val naturales = listOf(1, 13, 12, 5, 8, 10)

    //filtrar los numeros que son pares
    val numPares = naturales.filter{it % 2 == 0}
    println("los numeros pares son $numPares ")
}























