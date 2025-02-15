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

    val eventsList = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", dayPart = DayPart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", dayPart = DayPart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", dayPart = DayPart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", dayPart = DayPart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", dayPart = DayPart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", dayPart = DayPart.EVENING, durationInMinutes = 45)
    )
}