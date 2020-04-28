package com.dicoding.kotlin

/*
fun main(){
    val value = 7

    when(value){
        6 -> println("value is 6")
        7 -> println("Value is 7")
        8 -> println("Value is 8")
    }

}*/

//branch else
/*
fun main(){
    val value = 20

    when(value){
        6 -> println("Value is 6")
        7 -> println("Value is 7")
        8 -> println("Value is 8")
        else -> println("Value cannot be rached")
    }
}
*/

//mengembalikan variable
/*fun main(){
   val value = 78
    val stringOfValue = when(value){
        6 -> "Value is 6"
        7 -> "Value is 7"
        8 -> "Value is 8"
        else -> "Value can't be reached"
    }
    println(stringOfValue)
}*/

//punya >=2 baris code that running in every branch
/*
fun main(){
    val value = 7
    val stringOfValue = when (value){
        6 -> {
            println("Six")
            "Value is 6"
        }
        7 -> {
            println("Seven")
            "Value is 7"
        }
        8 ->{
            println("Eight")
            "Value is 8"
        }
        else -> {
            println("undefined")
            "Value cannot be reached"
        }
    }

    println(stringOfValue)

}*/

//instance checking
/*
fun main(){
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("The value is long type")
        is String -> println("The value is string type")
        else -> println("Undefined")
    }

}
*/

//Range/Collection value checking
/*
fun main(){
    val value = 25
    val ranges = 10..50

    when(value){
        in ranges -> println("Value is in the range")
        !in ranges -> println("Value is outside the range")
        else -> println("Value is undefined")

    }

}
*/

//Bingung bug :v
/*
fun main(){
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
}

fun getRegisterNumber() = Random.nextInt(100)
*/

