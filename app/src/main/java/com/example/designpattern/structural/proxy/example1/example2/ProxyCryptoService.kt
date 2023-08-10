package com.example.designpattern.structural.proxy.example1.example2

// ProxyCryptoService class (Proxy)
class ProxyCryptoService(private val realCryptoService: RealCryptoService) : CryptoService {
    override fun encrypt(message: String): String {
        val encryptedMessage = realCryptoService.encrypt(message)
        println("Additional security measures applied during encryption.")
        return encryptedMessage
    }

    override fun decrypt(encryptedMessage: String): String {
        val decryptedMessage = realCryptoService.decrypt(encryptedMessage)
        println("Additional security measures applied during decryption.")
        return decryptedMessage
    }

    override fun sign(message: String): String {
        val signature = realCryptoService.sign(message)
        println("Message signed with cryptographic signature.")
        return signature
    }

    override fun verify(message: String, signature: String): Boolean {
        val isVerified = realCryptoService.verify(message, signature)
        if (isVerified) {
            println("Cryptographic signature verified.")
        } else {
            println("Cryptographic signature verification failed.")
        }
        return isVerified
    }
}


