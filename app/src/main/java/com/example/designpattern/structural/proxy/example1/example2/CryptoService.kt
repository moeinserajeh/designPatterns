package com.example.designpattern.structural.proxy.example1.example2

// Interface for cryptographic operations
interface CryptoService {
    fun encrypt(message: String): String
    fun decrypt(encryptedMessage: String): String
    fun sign(message: String): String
    fun verify(message: String, signature: String): Boolean
}