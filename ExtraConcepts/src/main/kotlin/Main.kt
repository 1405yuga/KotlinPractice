package org.example

fun main() {
    //null safety------------------------------------
    println("Null safety----")
    var s: String? = null
    println(s?.length ?: 10) //elvis operator
    s?.let {                   //let
        println(it)
    }
    val obj: Any = "Hello World"
    val str: String? = obj as? String
    val num: Int? = obj as? Int
    println("Safe casts: $str, $num")

}