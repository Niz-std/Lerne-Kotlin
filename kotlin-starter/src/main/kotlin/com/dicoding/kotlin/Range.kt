package com.dicoding.kotlin

/* RANGE INT
fun main()  {
    val rangeInt = 1..10 step 3
    rangeInt.forEach {
        println("$it")
    }

}*/

/*
//RANGE TO
fun main()  {
    val rangeInt = 10.downTo(2)
    rangeInt.forEach {
        println(it)
    }



}
*/

/* Value Check in Range
fun main()  {
    val rangeInt = 10.downTo(3) step 2
    rangeInt.forEach{
        println(it)
    }
    if (7 in rangeInt)  {
        println("Value 7 is available")
    }   else {println("Value 7 isn't available")
    }

}*/

fun main()  {
    val rangeInt = 10.rangeTo(99) step 3
    val x = 79
    if (x !in rangeInt) {
        println("Value $x is not available")
    } else {
        println("Value $x is available")
    }

}

/*

//Char dataType version
fun main()  {
    val rangeChar = 'A'.rangeTo('Z') step 2
    rangeChar.forEach {
        println(it)
    }


}*/
