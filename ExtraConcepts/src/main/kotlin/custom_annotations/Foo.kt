package org.example.custom_annotations

@Fancy("class", replaceWith = ReplaceWith("something to replace"))
class Foo {
    @Fancy("function")
    fun buz(): Int {
        return 1
    }
}