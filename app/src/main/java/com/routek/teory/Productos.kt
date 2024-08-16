package com.routek.teory

// 1 Super clase para todos los Productos
open class Products(val nombre:String, val price:Double) {
    open fun calculatePriceFinal():Double { // calculando el precio final
        return price;
    }
    open fun descriptionProduct(): String { // Metodo para la Description del Producto
            return "$nombre cuesta $price"
    }
}


// Clase hija A: Productos electronicos
class Electrodomesticos(nombre:String, price:Double, val warranty: Int): Products(nombre, price) {
    override fun calculatePriceFinal():Double {
        val discount = 0.10
        return price - (price * discount)
    }
    override fun descriptionProduct(): String {
        return "${super.descriptionProduct()} con $warranty anios de garantia"
    }
}


// Clase hija B: para Productos de Ropa
class Clothing(nombre:String, price:Double, val size:String): Products(nombre, price) {
    override fun calculatePriceFinal():Double {
        val discount = 0.15 // 15% de Descuento
        return price - (price * discount)
    }

    override fun descriptionProduct():String {
        return  "${super.descriptionProduct()} de talla $size"
    }
}


// Clase hija C: para Productos de Alimentos
class Food(nombre:String, price:Double, val expirationDate:String): Products(nombre, price) {
    override fun calculatePriceFinal(): Double {
        val discount = 0.5 // 5% Descuento
        return  price - (price * discount)
    }

    override fun descriptionProduct(): String {
        return "${super.descriptionProduct()}, Fecha de Expiracion: $expirationDate"
    }
}

/* ---- Implementacion de la Funcion --------- */
fun main() {
    val electronico1 = Electrodomesticos("Televisor", 1200.0, 3)
    val ropa1 = Clothing("Camisa", 50.0, "M")
    val comida1 = Food("Pan", 3.0, "2024-09-01")

    //  Electronicos
    println(electronico1.descriptionProduct())
    println("PRECIO FINAL es " + electronico1.calculatePriceFinal())

    // Ropa
    println(ropa1.descriptionProduct())
    println("PRECIO FINAL es " + ropa1.calculatePriceFinal())

    // Comida
    println(comida1.descriptionProduct())
    println("PRECION FINAL es " + comida1.calculatePriceFinal())
}
































