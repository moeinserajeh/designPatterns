package com.example.designpattern.structural.decorator.datastream

fun main() {
    val basicInputStream: DataStream =
        com.example.designpattern.structural.decorator.datastream.BasicInputStream()
    println("Reading data from basic input stream: ${basicInputStream.read()}")

    val encryptedInputStream: DataStream = EncryptedDataStream(basicInputStream)
    println("Reading data from encrypted input stream: ${encryptedInputStream.read()}")

    val basicOutputStream: DataStream =
        com.example.designpattern.structural.decorator.datastream.BasicOutputStream()
    basicOutputStream.write("Secret message")

    println("Reading data from basic output stream: ${basicOutputStream.read()}")

    val compressedOutputStream: DataStream =
        com.example.designpattern.structural.decorator.datastream.CompressedDataStream(
            basicOutputStream
        )
    compressedOutputStream.write("Another secret message")

    println("Reading data from compressed output stream: ${compressedOutputStream.read()}")
}
