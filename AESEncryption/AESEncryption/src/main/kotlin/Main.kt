package org.example

fun main() {

    //Encryption steps--------------------------------------------------
    val salt = EncryptionHelper.generateSalt()
    val aesKey = EncryptionHelper.deriveAESKey(
        masterKey = "123456",
        salt = salt
    )
    val iv = EncryptionHelper.generateIV()
    val userDataString = EncryptionHelper.jsonToString(
        userData = UserData(
            title = "Google",
            username = "yugav",
            password = "1234",
        )
    )
    val encryptedData = EncryptionHelper.encrypt(
        plainText = userDataString,
        key = aesKey,
        iv = iv,
    )
    println("Encrypted data : $encryptedData")
    //todo : data to base64 encode

    //Decryption steps-----------------------------------------
    val aeskey = EncryptionHelper.deriveAESKey(
        masterKey = "123456", salt = salt
    )

    val decryptedJson = EncryptionHelper.decrypt(
        cipherText = encryptedData,
        key = aeskey,
        iv = iv
    )
    val data = EncryptionHelper.jsonToUserData(decryptedJson)
    println("Decrypted data : $data")
}