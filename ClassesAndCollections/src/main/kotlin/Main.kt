package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val event = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        dayPart = DayPart.EVENING,
        durationInMinutes = 15
    )
    println(event)
}