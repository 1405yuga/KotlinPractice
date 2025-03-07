package org.example

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.example.destructuring.Person
import kotlin.reflect.full.memberProperties

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
//    AsynchronousTechniques.threading()
//    AsynchronousTechniques.downloadData("some.com") { result ->
//        println("Call back completed : $result")
//    }
//coroutine
    runBlocking {
        launch { delay(1000) }
        println("Hello from coroutine")
    }
    runBlocking {
        val result = async {
            delay(2000)
            "Hello , async coroutine"
        }
        println(result.await())
    }

    //Destructuring----------------------------
    val person = Person(
        name = "Yuga",
        age = 23,
        gender = "Female"
    )

    val (myName, myAge) = person
    val myGender = person.component3()
    val (_, someAge) = person
    println("$myName - $myAge - $myGender - $someAge")

    //Reflection---------------------------------
    val personClass = Person::class
    val properties = Person::class.memberProperties
    println("${personClass.simpleName} ")
    properties.forEach { print(it.name+" ") }

}