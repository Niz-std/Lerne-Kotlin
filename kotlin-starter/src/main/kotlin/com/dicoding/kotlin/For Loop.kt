package com.dicoding.kotlin

/*Sama seperti While dan Do While, For merupakan konsep perulangan pada blok yang sama selama hasil evaluasi kondisi yang diberikan terpenuhi atau bernilai true. For dapat digunakan pada Ranges, Collections, Arrays dan apapun yang menyediakan iterator. Contoh dari For loop sendiri adalah sebagai berikut:*/

/*
fun main() {
    var ranges = 1..55
    for (i in ranges){
        println("value is $i!")
    }
}*/

//alternative range-exp
/*
fun main() {
    val ranges = 1.rangeTo(5)
    for (i in ranges){
        println("value is $i!")
    }

}*/
//menggunakan ekstensi-step pada range-exp
/*
fun main() {
    val ranges = 1.rangeTo(10) step 3
    for (i in ranges ){
        println("value is $i!")
    }

}
*/

//Kita juga dapat mengakses indeks untuk setiap elemen yang ada pada Ranges dengan memanfaatkan fungsi withIndex()
/*
fun main() {
    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

}
*/

/*Kita menggunakan kata kunci for untuk memulai proses perulangan. Untuk tujuan yang sama, kita juga bisa loh, memanfaatkan salah satu ekstensi pada Kotlin yaitu forEach. */
/*
fun main() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value!")
    }
}*/

//forEachIndexed
/*
fun main() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

}*/
//bila hanya ingin mencari index
fun main() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}
/*Sebenarnya ini merupakan sebuah aturan di mana ketika argumen dari sebuah lambda expression tidak digunakan, kita disarankan agar mengubahnya menjadi _ untuk menggantikan nama dari argumen tersebut*/
