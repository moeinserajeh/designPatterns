package com.example.designpattern.structural.decorator.datastream

class CompressedDataStream(private val stream: com.example.designpattern.structural.decorator.datastream.DataStream) :
    com.example.designpattern.structural.decorator.datastream.DataStream {
    private fun compress(data: String): String {
        // Simulating compression logic
        return data.replace("\\s".toRegex(), "")
    }

    private fun decompress(data: String): String {
        // Simulating decompression logic
        return data.replace("(.{5})".toRegex(), "$1 ")
    }

    override fun read(): String {
        val compressedData = stream.read()
        return decompress(compressedData)
    }

    override fun write(data: String) {
        val compressedData = compress(data)
        stream.write(compressedData)
    }
}
