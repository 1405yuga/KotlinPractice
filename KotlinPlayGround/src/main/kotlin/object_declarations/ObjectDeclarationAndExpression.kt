package object_declarations;

class ObjectDeclarationAndExpression {
    companion object {
        const val CONSTANT = "I am a constant"

        fun showMessage() {
            println("Hello from Companion Object!")
        }
    }

    fun someFunction() {
        println("I am a function")
    }
}

interface MyOnClick {
    fun onClick()
}


