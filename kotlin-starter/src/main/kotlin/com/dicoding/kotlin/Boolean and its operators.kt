package com.dicoding.kotlin

/*
fun main(){
    //Int ->32 bit -> -2^31<=Int<=2^31
    val intNumbers = 100

    //Long ->64bit -> -2^63<=Long<=2^63
    val longNumbers: long = 100
        //atau
    val longNumbers2 = 100L

    //short -> 16bit -> -2^15<=short<=2^15
    val shortNumbers: short = 10

    //byte (8bit)
    val byteNumber = 0b11010010

    //double (64bit); biasa digunakan untuk pecahan
    val doubleNumbers = 1.3

}*/

/*
fun main(){
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    val maxDouble = Double.MAX_VALUE
    val minDouble = Double.MIN_VALUE

    println(maxInt)
    println(minInt)
    println(maxDouble)
    println(minDouble)
}*/

/*
fun main(){
    val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 //This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")

    //karena value overRangeInt > Int.MAX_VALUE maka instead out Nilai MAX malah nilai MIN
}
*/

/*    toByte(): Byte

    toShort(): Short

    toInt(): Int

    toLong(): Long

    toFloat(): Float

    toDouble(): Double

    toChar(): Char
*/

fun main(){
    val intNumber: Int = 15
    val byteNumber: Byte = intNumber.toByte() //ready to go

    println(byteNumber)
    println(intNumber)
}