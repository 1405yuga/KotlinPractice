package org.example

class SongCatalog(
    val title: String,
    val artist: String,
    val year: Int,
    val playCount: Int,
    val isPopular: Boolean
) {
    fun printDescription() {
        println("$title, performed by $artist, was released in $year.")
    }
}
