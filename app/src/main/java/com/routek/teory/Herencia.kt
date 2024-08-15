package com.routek.teory

// Super clase
open class Animal {
    open fun Cazar() {
        println("el animal caza a su presa")
    }
}

// Clases hijas
class Dog:Animal() {
    override fun Cazar() {
        println("el Perro caza gatos")
    }
}

class Cat:Animal() {
    override fun Cazar() {
        println("el Gato caza ratones ")
    }
}

fun main() {
    val perro1 = Dog()
    val gato1 = Cat()

    // Declaracion de metodos Aplicados con herencia
    perro1.Cazar()
    gato1.Cazar()
}

