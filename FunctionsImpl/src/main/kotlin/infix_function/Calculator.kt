package org.example.infix_function

class Calculator(private val number: Int) {
    infix fun add(b: Int): Int {
        return this.number + b
    }

    fun build() {
        println(this.add(10))
        println(this add 20)
    }
}