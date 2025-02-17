package org.example.inlineValue_classes

@JvmInline
value class CustomerName(val name: String) {
    init {
        require(name.isNotEmpty()) { "Name must not be empty" }
    }

    constructor(firstName: String, lastName: String) : this("$firstName $lastName")

    val length: Int get() = name.length
    fun greet() {
        println("Hello from ${this.name}")
    }
}