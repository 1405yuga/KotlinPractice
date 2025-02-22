package org.example.high_order_functions

//normal func
fun addSome(a: Int, b: Int): Int {
    return a + b
}

//as parameter
fun operateOnNums(num1: Int, num2: Int, op: (num1: Int, num2: Int) -> Int) {
    println(op(num1, num2))
}

//return func
fun getOperation(type: String): (Int, Int) -> Int {
    return when (type) {
        "add" -> ::addSome
        else -> { x, y -> x - y }
    }
}

//both
fun getAndOperateOnNums(num1: Int, num2: Int, myOp: (Int, Int) -> (Int)): (Int) -> Int {
    val res = myOp(num1, num2)
    println(res)
    return { x -> x * x }
}