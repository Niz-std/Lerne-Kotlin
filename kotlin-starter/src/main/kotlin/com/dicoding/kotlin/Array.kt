package com.dicoding.kotlin

/*Selanjutnya adalah Array, yakni tipe data yang memungkinkan kita untuk menyimpan beberapa objek di dalam 
sebuah variabel. Array di Kotlin direpresentasikan oleh kelas Array yang memiliki fungsi get dan set serta 
properti size. Untuk membuat sebuah Array kita bisa memanfaatkan sebuah library function arrayOf() seperti 
berikut:*/

fun main(){
    var array1 = arrayOf(1, 3, 5, 7, 9)
    var mixArray = arrayOf(2, 0, 1, 9, "Corona", true)

    println(array1[2])
    println(array1) //out1:@2437c6dc, nilainya tetap. pointer??
    println(mixArray[4])
    println(mixArray[5])

    val intArray = Array(4, { i -> i * i }) //out:@1f89ab83 hmmmm
    println(intArray)
}

/*  intArrayOf() : IntArray
        e.g: val intArray = intArrayOf(1, 3, 5, 7)
    booleanArrayOf() : BooleanArray

    charArrayOf() : CharArray

    longArrayOf() : LongArray

    shortArrayOf() : ShortArray

    byteArrayOf() : ByteArray
*/

/*  Constructor Array()
        val intArray = Array(4, { i -> i * i }) // [0, 1, 4, 9]
        4 = size, i = input?
*/