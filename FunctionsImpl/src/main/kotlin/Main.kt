package org.example

import org.example.high_order_functions.getOperation
import org.example.high_order_functions.operateOnNums
import org.example.infix_function.Calculator

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //infix fun call--------
    println("Infix--")
    val cal = Calculator(5)
    val res = cal add 3
    println(res)
    cal.build()

    //high-order functions----------------------------------
    println("High Order--")
    operateOnNums(num1 = 1, num2 = 2, op = ::addSome) //func as param
    operateOnNums(num1 = 5, num2 = 2, op = { x, y -> x * y }) //using lambda exp
    val op = getOperation(type = "rfr")
    println(op(5, 7))


}