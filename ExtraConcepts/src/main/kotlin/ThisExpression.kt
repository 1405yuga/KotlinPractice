package org.example

class ThisExpression {
    inner class InnerClass {
        val a = this@ThisExpression //qualified
        val b = this                //implicit

        fun f() = println("This expression : ${a.javaClass}, $b")
    }
}