package com.example.designpattern.structural.decorator.datastream

class EncryptedDataStream(private val stream: DataStream) : DataStream {
    private fun encrypt(data: String): String {
        // Simulating encryption logic
        return data.reversed()
    }

    private fun decrypt(data: String): String {
        // Simulating decryption logic
        return data.reversed()
    }

    override fun read(): String {
        val encryptedData = stream.read()
        return decrypt(encryptedData)
    }

    override fun write(data: String) {
        val encryptedData = encrypt(data)
        stream.write(encryptedData)
    }
}