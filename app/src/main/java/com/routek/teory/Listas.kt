package com.routek.teory
fun main() {
    /* ---- Listas Mutable con DECLARACION DE TIPO -------   */
    val lenguages:MutableList<String> = mutableListOf("kotlin", "typescript", "dart", "python")

    /* --- Ejemplo de otra lista para hacer Operaciones con ellas */
    val frutas = mutableListOf("uva", "fresa", "mandarina", "pera", "sandia", "mango")

// Operaciones de Comprobacion
    val cantidadFrutas = frutas.size  // 1 Tamano de lista
    println("la cantidad frutas es $cantidadFrutas")



    val indexPera = frutas.indexOf("pera")  // 2 Indice del Array
    val estaPlatano = frutas.contains("platano") // 3 Verificar si contiene un Elmento mi Lista

// Encontra Elemntos
    val ultimaFruta = frutas.last() // 4 Traer el Ultimo elemento
    val primeraFruta = frutas.first()  // 5 Traer mi Primer elemento
    val any1Fruta = frutas[2] // 6.1 Traendo cualquier fruta de una lista
    val any2Fruta = frutas.get(2) // 6.2 otra forma de traer cualquier elemento de una lista

// Agregar elementos
    val frutaAddInicio = frutas.add(0, "Melocoton") // 7 Agregar al Inicio
    val frutaAddFinal = frutas.add("arandano")
    val frutaAnyPosition = frutas.add(2, "naranja")

// Quitar Elementos


    // 1 Tamano de Lista
    println("el indidice de pera es $indexPera") // 2 Indice del Elemento
    println(estaPlatano) // 3 Contiene un Elmento
    println("mi ultima fruta es $ultimaFruta") // 4 Ultimo Elemento
    println("la primera furta es $primeraFruta") // 5 Primer elemento

    println("frutas modificadas $frutas")


}

























