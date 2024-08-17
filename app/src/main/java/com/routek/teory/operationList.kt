package com.routek.teory


// 1 FUNCION PROCESAMIENTO DE TEXTO
val procesText = { texts: List<String> ->
    val textfilter = texts.filter{it.contains("kotlin")} // solo palabras con kotlin
    val upperTexts = textfilter.map{it.uppercase()}
}

fun main() {


}