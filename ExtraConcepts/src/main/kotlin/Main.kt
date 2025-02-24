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

    //equality--------------------------------------
    val x = String("abc".toCharArray())
    val y = String("abc".toCharArray())
    println("Structural equality: ${x == y} , Referential equality: ${x === y}")

    //this expression--------------
    ThisExpression().InnerClass().f()

    //Asynchronous techniques
    AsynchronousTechniques.threading()
    AsynchronousTechniques.downloadData("some.com") { result ->
        println("Call back completed : $result")
    }
}