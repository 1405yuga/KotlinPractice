package org.example

fun main() {

    //Encryption steps-----------------------
    val salt = Encryption.generateSalt()
    val aesKey = Encryption.deriveAESKey(
        masterKey = "123456",
        salt = salt
    )
    val iv = Encryption.generateIV()
    val userDataString = Encryption.jsonToString(
        userData = UserData(
            title = "Google",
            username = "yugav",
            password = "1234",
        )
    )
    val encryptedData = Encryption.encrypt(
        plainText = userDataString,
        key = aesKey,
        iv = iv,
    )
    println("Encrypted data : $encryptedData")
    //todo : data to base64 encode
}