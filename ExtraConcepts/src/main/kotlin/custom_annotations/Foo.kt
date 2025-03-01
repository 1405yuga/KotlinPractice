package org.example.custom_annotations

@Fancy("class")
class Foo {
    @Fancy("function")
    fun buz(): Int {
        return 1
    }
}