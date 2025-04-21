package org.example

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Por favor, ingrese un numero:")
    val num = scanner.nextInt() // Leemos el numero ingresado
    scanner.close() // Es importante cerrar el Scanner para liberar recursos
    if (num % 2 == 0){
        println("par")
    }
    else{
        println("impar")
    }
}
