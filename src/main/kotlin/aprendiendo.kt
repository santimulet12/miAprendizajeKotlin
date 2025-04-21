package org.example

fun sentenciaIf(){
    /*  Operadores Condicionales:
        > Mayor que
        < Menor que
        >= Mayor o igual que
        <= Menor o igual que
        == Igual que
        != Distinto que

        Operadores Lógicos:
        && -> AND
        || -> OR
        ! -> NO
    */
    val num = 5
    if (num <= 10 && num > 5){
        println("$num es menor o igual que 10 y mayor a 5")
    }
    else if (num <= 10 && num <= 5){
        println("$num el numero es menor que 10 y menor o igual que 5")
    }
    else{
        println("$num es mayor que 10")
    }
}
fun sentenciaWhen(){

    //Funciona como un switch-case

    //When con Str
    val country = "Francia"

    when(country){
        "Argentina","España","Mexico" -> {
            println("Idioma español")
        }
        "Francia" ->{
            println("Idioma frances")
        }
        "Estados Unidos" -> {
            println("Idioma ingles")
        }
        else -> {
            println("No se conoce el idioma")
        }
    }
    //When con Int
    val age = 16

    when(age){
        in 1..4 -> {
            println("Eres un bebé")
        }
        in 5..12 -> {
            println("Eres un niño")
        }
        in 13..17 ->{
            println("Eres un adolecente")
        }
        in 18..69 ->{
            print("Eres un adulto")
        }
        in 70..99 ->{
            println("Eres un anciano")
        }
        else -> {
            println("COMO TIENES ESA EDAD???????")
        }
    }
}
fun losArreglos(){
    //Acá vamos a hablar de arreglos

    val name = "Santiago"
    val surname = "Mulet"
    val school = "Etec"
    val age = "16"

    //  Creación del Array
    val myArray = arrayListOf<String>()

    //  Añadir datos uno por uno
    myArray.add(name)
    myArray.add(surname)
    myArray.add(age)
    myArray.add(school)

    println(myArray)

    //  Añadir un conjnto de datos
    myArray.addAll(listOf("Hola", "Soy Santiago"))
    println(myArray)

    //  Acceder a elementos de un array
    println(myArray[1]) // Mulet
    println(myArray.get(2)) // 16

    //  Modificación de elementos
    myArray[5] = "Kotlin"
    println(myArray)

    //  Eliminar elementos
    myArray.remove("Kotlin") // Elimina un elemento por su valor
    println(myArray)
    myArray.removeAt(4) // Elimina un elemento por su indice
    println(myArray)
    //myArray.removeLast() // Elimina el ultimo elemento de la colección
    //myArray.removeFirst() // Elimina el primer elemento de la colección

    //  Recorrer el array
    myArray.forEach {
        println(it) // it es el elemento (Iterador)
    }

    // Otras operaciones con arreglos
    myArray.count() // Cantidad de elementos que tiene la lista
    myArray.clear() // Elimina todos los elementos de la lista
}

fun maps(){
    //  Sintaxis:
    var myMap: Map<String, Int> = mapOf()
    println(myMap)

    //  Añadir elementos al mapa:
    myMap = mutableMapOf(
        "Santi" to 1,
        "Pepe" to 10,
        "Juan" to 14
    )
    println(myMap)

    //  Añadir un solo valor al mapa:
    myMap["Sara"] = 7
    myMap.put("Ana", 20)
    println(myMap)

    //  Actualizar datos en un mapa:
    myMap["Ana"] = 18
    println(myMap)
    myMap.put("Ana", 32)
    println(myMap)

    //  Acceso a un dato:
    println(myMap["Santi"])
    println(myMap.get("Sara"))

    // Eliminar un dato de un mapa:
    myMap.remove("Ana")
    println(myMap)

}

fun bucles(){
    //  Bucles recorer estructuras iterables

    val myArray: List<String> = listOf("Python", "Java", "Php", "JavaScript", "Kotlin", "Go")
    val myMap: Map<String, Int> = mapOf(
        "Santi" to 1,
        "Pepe" to 10,
        "Juan" to 14
    )

    //  For
    for(elemento in myArray){
        println(elemento)
    }

    for (mapElement in myMap){ //   Muestra los elemento de la siguiente forma (key = value)
        println(mapElement)
    }

    for((key,value) in myMap){ //   Dividimos el elemento en (key / value) por separado
        println("clave: $key - valor: $value")
    }

    //  Recorrer rangos:

    for (x: Int in 0..myArray.count()-1){ //    Recorre desde 0 hasta el tamaño de mi array menos 1, ya que sino restamos sale de rango
        println(myArray[x])
    }

    for (i: Int in 0 until 10){//   Recorre desde el 0 hasta el 9, el 10 no está incluido
        println(i)
    }

    for (i: Int in 0 until myArray.count()){//  Recorre desde el 0 hasta el tamaño de mi array menos 1, ya que no incluye el ultimo numero
        println(myArray[i])                      //   para no salir de rango
    }

    for (i: Int in 0..30 step 10){// Recorre desde el 0 hasta el 30 incluido, con paso 10
        println(i)
    }

    for (i: Int in 10 downTo 0){// Recorre desde 10 a 0 incluido
        println(i)
    }

    val arrayIntList: IntRange = (0..10)
    for (element: Int in arrayIntList){
        println("elemento numero $element")
    }

    //  While
    var x: Int = 0

    while (x < 10){
        println(x)
        x++
    }
}

fun nullSafety(){
    var myStr = "Santiago"
    //  myStr = null    Da un error de compilación
    println(myStr)

    //  Variable null safety
    var myStrSafety: String? = "Santiago null safety"
    myStrSafety = null
    println(myStrSafety)

    // println(myStrSafety!!) //Obliga que la variable no sea nula
}

fun miFuncionSuma(a:Int, b:Int) : Int{  //  Sintaxis: fun name(a:Type, b:Type) : ReturnType{}
    return a+b
}

fun main() {
    //Sentencia If
    //sentenciaIf()

    //Sentencia When
    //sentenciaWhen()

    //Arreglos (Arrays)
    //losArreglos()

    //Mapas (Diccionarios)
    //maps()

    //Bucles for y while
    //bucles()

    //Null Safety
    //nullSafety()

    //Funciones
    //println(miFuncionSuma(2,6))

    //Clases y Objetos

}