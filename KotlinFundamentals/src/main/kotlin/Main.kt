package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)

    val songCatalog = SongCatalog(
        title = "Song name",
        artist = "K K",
        1999,
        playCount = 10
    )
    songCatalog.printDescription()

    val winningBid = Bid(5000, "Private Collector")
    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

fun printNotificationSummary(notification: Int) {
    if (notification < 100) println("You have $notification notifications")
    else println("Your phone is blowing up! You have 99+ notifications.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}
