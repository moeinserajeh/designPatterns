package com.example.designpattern.structural.proxy.example1.example2

fun main() {
    val realCryptoService = RealCryptoService()
    val proxyCryptoService = ProxyCryptoService(realCryptoService)

    val message = "Hello, this is a secret message."

    val encryptedMessage = proxyCryptoService.encrypt(message)
    val signature = proxyCryptoService.sign(encryptedMessage)

    println("Original Message: $message")
    println("Encrypted Message: $encryptedMessage")
    println("Signature: $signature")

    val verified = proxyCryptoService.verify(encryptedMessage, signature)
    println("Signature Verified: $verified")

    val decryptedMessage = proxyCryptoService.decrypt(encryptedMessage)
    println("Decrypted Message: $decryptedMessage")
}