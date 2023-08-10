package com.example.designpattern.structural.composit

class File(private val name: String) : FileSystemComponent {
    override fun display() {
        println("File: $name")
    }
}
