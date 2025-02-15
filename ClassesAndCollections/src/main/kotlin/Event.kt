package org.example

data class Event(
    val title: String,
    val description: String?=null,
    val dayPart: DayPart,
    val durationInMinutes: Int
)

enum class DayPart {
    EVENING, MORNING, AFTERNOON
}