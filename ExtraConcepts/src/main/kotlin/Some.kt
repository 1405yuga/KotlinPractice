package org.example

class Some {
    lateinit var name: String

    init {
        name = "kk"
    }

    fun printName() {
        println("Lateinit : $name")
    }
}