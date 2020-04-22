package com.dicoding.kotlin

/*
fun main(){
    val buka = 7
    var now = 14
    if (now>buka){
        println("Toko sudah Buka")
    }
}*/

/* Ini kalau di C++ bisa/gampang, kalau di kotlin gimn yak wkwkwk
fun main(){
    var umur:Int
    if (umur >17) {
        println("Dewasa")
    } else if (umur = 17) {
        println("Remaja")
    } else if (umur < 17){
        println("Anak-anak")
    } else if (umur < 3) {
        println("Balita")
    } else if (umur < 0) {
        println("Antum Kuantum?")
    }
    umur = 2
}*/
/* masih bug juga
fun main(){
    val remaja = 17
    val hidup = 0
    val balita = 2
    var now = 15
    val tingkat : Unit
    tingkat = if (now > remaja){
        println("Kamu sudah dewasa")
    } else if (now = remaja){
        println("kamu sekarang remaja")
    }else if (now < remaja){
        println("Kamu masih anak-anak")
    } else if (now < balita){
        println("Kamu masih balita")
    } else if (now < hidup){
        println("Antum Kuantum!!??")
    } else {}
}*/
fun main(){
    val jamBuka = 8
    val now = 15
    val toko: String
    toko = if(now > jamBuka){
        "Toko sudah Buka"
    } else if (now == jamBuka){
        "Toko segera dibuka, wait a minute"
    }else {
        "Toko tutup"
    }
        println(toko)
}