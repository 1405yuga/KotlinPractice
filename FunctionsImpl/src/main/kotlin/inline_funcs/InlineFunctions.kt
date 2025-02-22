package org.example.inline_funcs

inline fun testIfEven(a: Int, print: (Int, Boolean) -> (Unit)) {
    val res = a % 2 == 0
    print(a, res)
}