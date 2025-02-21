package org.example

import org.example.infix_function.Calculator

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //infix fun call--------
    val cal = Calculator(5)
    val res = cal add 3
    println(res)
    cal.build()

}