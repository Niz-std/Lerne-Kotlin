package com.dicoding.kotlin

/*
fun main(){
    val text1: String = "OSEF"
    val text2: String = "2"
    val text3: String = "3"
    val text4: String = "4"
    var length1 = text1.length
    var length2 = text2.length
    var length3 = text3.length
    var length4 = text4.length
    println(length1)
    println(length2)
    println(length3)
    println(length4)
    //Brarti lenght panjang digit/sequence

}*/

//Safe Calls (?.)
/*fun main(){
    val text: String? = null
    val length = text?.length

    println(length) //Dengan safe call, kompiler akan melewatkan proses jika objek tersebut bernilai null.

}*/

//Elvis Operator (?:)
/*memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.*/
/*fun main(){
    val text: String? = null
    val textLength = text?.length ?: 7

    println(textLength)
}*/
/*
fun main(){
    val text: String? = null
    val textLength = if (text != null) text.length else 8

    println(textLength)
}
*/

//non-null assertion (!!)
/*
fun main(){
    val text: String? = null
    val textLength = text!!.length //ready to go ???

    println(textLength)

}*/
