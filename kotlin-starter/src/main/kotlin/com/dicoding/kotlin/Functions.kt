package com.dicoding.kotlin

/*Struktur fungsi pada kotlin
        fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
        return result
    }
*/

fun main(){
    val user = setUser("Osef", 19)
    print(user)

    printUser("Jounin")
} //fungsi setUser dan printUser blm didefinisikan maka fungsi main tidak bekerja.

//pendefinisian fungsi setUser dan printUser
fun setUser(name: String, level: Int) = "Selamat datang $name, levelmu sekarang adalah $level"

fun printUser(tingkat: String) {
    println(", dengan tingkat $tingkat")
} //setelah didefinisikan maka fungsi main bisa bekerja.
// not sure whether definition referring to main or main referring to def and backagain to compile it :(
