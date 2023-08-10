package com.example.designpattern.structural.proxy.example1

fun main() {
    val image1: Image = ProxyImage("image1.jpg")
    val image2: Image = ProxyImage("image2.jpg")

    // Images are loaded and displayed only when necessary
    image1.display() // RealImage is loaded and displayed
    image2.display() // RealImage is loaded and displayed

    // Images are already loaded, so only displayed
    image1.display()
    image2.display()
}