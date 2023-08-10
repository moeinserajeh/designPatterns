package com.example.designpattern.proxy.example1.example2

import java.security.KeyPair
import java.security.KeyPairGenerator
import java.security.Signature

// RealCryptoService class (Real Subject)
class RealCryptoService : CryptoService {
    private val keyPair: KeyPair = KeyPairGenerator.getInstance("RSA").genKeyPair()

    override fun encrypt(message: String): String {
        println("Encrypting message: $message")
        // Actual encryption logic would go here
        return "Encrypted: $message"
    }

    override fun decrypt(encryptedMessage: String): String {
        println("Decrypting message: $encryptedMessage")
        // Actual decryption logic would go here
        return "Decrypted: $encryptedMessage"
    }

    override fun sign(message: String): String {
        val signature = Signature.getInstance("SHA256withRSA")
        signature.initSign(keyPair.private)
        signature.update(message.toByteArray())
        val signedBytes = signature.sign()
        return String(signedBytes)
    }

    override fun verify(message: String, signature: String): Boolean {
        val verifySignature = Signature.getInstance("SHA256withRSA")
        verifySignature.initVerify(keyPair.public)
        verifySignature.update(message.toByteArray())
        return verifySignature.verify(signature.toByteArray())
    }
}