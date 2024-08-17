package com.routek.teory


// Funcion Clasica
fun suma(num1:Int, num2:Int):Int {
    val resultado = num1 + num2
    return resultado
}

// FUNCION EXPRESADA EN UNA SOLA LINEA
fun prod(num1:Int, num2:Int): Int = num1 * num2
val producto = prod(8, 12)

val sumota: (Int, Int) -> Int = {num1, num2 -> num1 + num2 }



fun main() {
    suma(10,22)
    println("la suma es de mi resultado es ${suma(10, 12)}")
    println("mi producto es de $producto")

}

