package com.example.designpattern.structural.decorator.datastream

interface DataStream {
    fun read(): String
    fun write(data: String)
}