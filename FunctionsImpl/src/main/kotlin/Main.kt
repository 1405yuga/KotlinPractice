package org.example

import org.example.high_order_functions.getOperation
import org.example.high_order_functions.operateOnNums
import org.example.infix_function.Calculator
import org.example.inline_funcs.testIfEven
import org.example.invoke_function.stringPlus
import org.example.lambda_expression.anonymous
import org.example.lambda_expression.sum
import org.example.operator_overloading.Counter
import org.example.operator_overloading.OperatorOverloading

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

    //invoking
    println(stringPlus.invoke("ff", "nn"))

    //lambda expression
    println("Lambda exp--")
    println(sum(2, 5))
    val map = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    map.forEach({ (_, v) -> println(v) })
    println(anonymous(6, 10))  //anonymous func

    //inline functions
    testIfEven(5) { num, isEven ->
        println("$num is even = $isEven")

    }

    //operator overloading
    println("Operator Overloading---")
    val operatorOverloading = -OperatorOverloading(3, 5)
    println(operatorOverloading)
    var t = Counter(x = 5)
    t++
    println(t)
}