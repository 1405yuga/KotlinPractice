package org.example

class SongCatalog(
    val title: String,
    val artist: String,
    val year: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = this.playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $year. - isPopular: $isPopular")
    }
}
