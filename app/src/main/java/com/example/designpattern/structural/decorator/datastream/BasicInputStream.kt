package com.example.designpattern.structural.decorator.datastream

class BasicInputStream : com.example.designpattern.structural.decorator.datastream.DataStream {
    override fun read(): String {
        // Simulating reading data from a source
        return "Plain text data"
    }

    override fun write(data: String) {

    }
}