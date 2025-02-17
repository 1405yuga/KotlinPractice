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

    val shortEvent = eventsList.filter { it -> it.durationInMinutes < 60 }
    println(shortEvent)

    val groupedEvents = eventsList.groupBy { it.dayPart }
    groupedEvents.forEach { (dayPart, events) ->
        println("$dayPart -${events.size}")
    }

    val lastEvent = eventsList.last()
    println(lastEvent.title)

    println(lastEvent.durationOfEvent)
}