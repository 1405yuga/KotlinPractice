package org.example.custom_annotations

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Fancy(val why: String,val replaceWith:ReplaceWith = ReplaceWith(""))

annotation class ReplaceWith(val expression: String)
