package com.routek.teory

fun main() {
    val frutas = mutableListOf("pera", "frea", "uva", "manzana")
    println("mis frutas son => $frutas")

    // Propertys
    val qlist = frutas.size
    println("tengo $qlist frutas")  // Quantity
    val indexUva = frutas.indexOf("uva")
    println("el indice de uva es $indexUva") // Indice
    val containPera = frutas.contains("pera")
    println("contiene pera?, $containPera") // Contain Bool

    //GET elements
    val anyFruta = frutas.get(1)
    println("encontrando una fruta cualquiera $anyFruta")
    val anyFrutas = frutas[2]
    println("otra manera de traer un elemento de una lista $anyFrutas")
    val lasFruta = frutas.last()
    println("la ultima fruta es $lasFruta")
    val fisFruta = frutas.first()
    println("la primera fruta es $fisFruta")

    //ADD elements
    frutas.add(0, "toronja")
    println("more frutas al inicio: $frutas")
    frutas.add("frambuesa")
    println("add frutas al Final: $frutas")
    frutas.add(2, "coco")
    println("agregando frutas a cualquier lugar: $frutas")

    //REMOVE elemnts
    frutas.removeAt(0) // 1 metodo
    println("quitanto el 1er elemento de frutas: $frutas")
    frutas.removeFirst() // 2 metodo
    println("quitando el Otro 1er elemento de frutas: $frutas")
    frutas.removeLast()
    println("quitando el ultimo elemento con metodo last() $frutas")
    frutas.removeAt(frutas.size-1)
    println("quitando el ultimo elemento de frutas con algo mas clasico $frutas")
    frutas.removeAt(1)
    println("quitnado un elemento de cualquier pocicion $frutas")

    // Extrae PORCION
    val days = mutableListOf("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo")
    val dayLaborables = days.subList(0, 5)
    println("los dias laborables son $dayLaborables")

    // REPLACE Uno por Otro
    val products = mutableListOf("cocina", "ropero", "borrador" ,"frigider", "televisor", "lapiz", "lavadora")
    println("lista original de productos $products")
    products[2] = "muebles"
    println("imprimiendo la lista de Productos modificada $products")
    products.set(5, "armario") // otra manera de poder cambiar uno por otor
    println("esto es la lista de productos final modificada $products")

}

























