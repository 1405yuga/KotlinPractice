package org.example

import com.google.gson.Gson
import java.security.SecureRandom
import javax.crypto.Cipher
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.PBEKeySpec
import javax.crypto.spec.SecretKeySpec

object EncryptionHelper {
    //store in user table
    fun generateSalt(): ByteArray {
        val salt = ByteArray(size = 16)
        SecureRandom().nextBytes(salt)
        return salt
    }

    fun deriveAESKey(masterKey: String, salt: ByteArray): SecretKeySpec {
        val factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256")
        val spec = PBEKeySpec(masterKey.toCharArray(), salt, 65536, 256)
        val secret = factory.generateSecret(spec)
        return SecretKeySpec(secret.encoded, "AES")
    }

    fun generateIV(): ByteArray {
        val iv = ByteArray(16)
        SecureRandom().nextBytes(iv)
        return iv
    }

    fun jsonToString(userData: UserData): String {
        return Gson().toJson(userData)
    }

    fun encrypt(plainText: String, key: SecretKeySpec, iv: ByteArray): ByteArray {
        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        cipher.init(Cipher.ENCRYPT_MODE, key, IvParameterSpec(iv))
        return cipher.doFinal(plainText.toByteArray(Charsets.UTF_8))
    }

    fun decrypt(cipherText: ByteArray, key: SecretKeySpec, iv: ByteArray): String {
        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        cipher.init(Cipher.DECRYPT_MODE, key, IvParameterSpec(iv))
        val plainBytes = cipher.doFinal(cipherText)
        return String(plainBytes, Charsets.UTF_8)
    }

    fun jsonToUserData(jsonObject: String): UserData = Gson().fromJson(jsonObject, UserData::class.java)
}