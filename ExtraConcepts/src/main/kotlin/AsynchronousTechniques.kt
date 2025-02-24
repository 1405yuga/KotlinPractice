package org.example

object AsynchronousTechniques {
    fun threading() {
        println("threading---")
        val thread1 = Thread {
            for (i in 1..5) {
                println("Thread1 $i")
                Thread.sleep(500)
            }
        }
        val thread2 = Thread {
            for (i in 1..5) {
                println("Thread2 $i")
                Thread.sleep(500)
            }
        }

        thread1.start()
        thread2.start()
    }

    fun downloadData(url: String, callback: (String) -> Unit) {
        println("Call back technique started----")
        Thread.sleep(1000)
        callback("File Data")
    }
}