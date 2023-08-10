package com.example.designpattern.structural.proxy.example1

class ProxyImage(private val filename: String) : Image {
    private var realImage: RealImage? = null

    override fun display() {
        if (realImage == null) {
            realImage = RealImage(filename)
        }
        realImage?.display()
    }
}


