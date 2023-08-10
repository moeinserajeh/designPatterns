package com.example.designpattern.structural.decorator.datastream

class BasicOutputStream : com.example.designpattern.structural.decorator.datastream.DataStream {
    private var data = ""

    override fun read(): String {
        return data
    }

    override fun write(data: String) {
        this.data = data
    }
}