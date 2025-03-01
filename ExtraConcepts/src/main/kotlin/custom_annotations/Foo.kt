package org.example.custom_annotations

@Fancy
class Foo {
    @Fancy
    fun buz(): Int {
        return 1
    }
}