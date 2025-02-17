package org.example.nested_inner_class

class Outer {
    private val text = "Outer class"

    //nested class
    class NestedClass {
        fun nestedNum() = "I am nested class"
    }

    //inner Class - requires to initialise outer class to access inner class
    inner class InnerClass {
        fun innerFun() = "I am inner class can access outer class - ${this@Outer.text}"
    }
}