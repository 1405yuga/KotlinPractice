package org.example.operator_overloading

data class OperatorOverloading(val x: Int, val y: Int) {
    operator fun unaryMinus() = OperatorOverloading(-x, -y)
}

data class Counter(val x: Int) {
    operator fun inc() = Counter(x + 10)
}