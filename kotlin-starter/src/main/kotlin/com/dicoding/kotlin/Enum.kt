package com.dicoding.kotlin


/*
val colorRed = 0xFF0000
val colorGreen = 0x00FF00
val colorBlue = 0x0000FF
*/

/*
fun main(){
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

}

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)

}*/

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/*fun main(){
    val color : Color = Color.RED
    print(color)

}

enum class Color(val Value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}*/

//~~~~~ anonymouse class
/*
fun main(){
    val color : Color = Color.RED
    println(color)

}

enum class Color(val value: Int) {
    RED(0xFF0000){
        override fun printValue(){
            println("Value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue(){
            println("Value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue(){
            println("Value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

*/

//~~~~~ synthetic method
/*ynthetic method yang memungkinkan kita mendapatkan daftar objek Enum dan nama dari tiap Enum itu sendiri.*/
/*fun main(){
    val colors : Array<Color> = Color.values()
    colors.forEach { color ->
        println(color)
    }
}

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x00000FF)

}*/
/*
fun main(){
        val color: Color = Color.valueOf("RED")
        println("Color is $color")
    }

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x00000FF)

}*/

//~~~~~~~ using fungsi Enum instead of Synthetic methods
/*Selain menggunakan fungsi values() dan fungsi valueOf(), kita bisa mendapatkan daftar objek Enum dan nama dari objek
Enum dengan cara yang lebih umum. Caranya, gunakan fungsi enumValues() dan fungsi enumValueOf(). Contoh penggunaan kedua
 fungsi tersebut adalah sebagai berikut:
 */

//sintaxnya mirip synthetic methods
/*fun main(){
    val colors: Array<Color> = enumValues()
    colors.forEach {color ->
        println(color)
    }
    val color: Color = enumValueOf("RED")
    println("Color is $color")
}

enum class Color (val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}*/

//~~~~~~~ Finding Position using Enum
/*
fun main(){
    val color: Color = Color.GREEN

    println("Position GREEN is ${color.ordinal}")

}
//kenapa outputnya 1 (posisi si green) buat PR, CLue kekknya ada di EduTools
enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}*/

//Cara cek Instance ENUM itu sendiri
fun main(){
    val color: Color = Color.BLUE

    when(color){
        Color.RED -> println("Color is Red")
        Color.GREEN -> println("Color is Green")
        Color.BLUE -> println("Color is Blue")
    }
}

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)

}

