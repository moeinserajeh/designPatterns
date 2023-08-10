package com.example.designpattern.structural.proxy.example1

class RealImage(private val filename: String) : Image {
    init {
        loadFromDisk()
    }

    private fun loadFromDisk() {
        println("Loading image: $filename")
    }

    override fun display() {
        println("Displaying image: $filename")
    }
}