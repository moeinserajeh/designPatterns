package com.example.designpattern.structural.composit

fun main() {
    val file1 = File("document.txt")
    val file2 = File("image.jpg")
    val file3 = File("notes.txt")

    val directory1 = Directory("Documents")
    directory1.addComponent(file1)
    directory1.addComponent(file2)

    val directory2 = Directory("Work")
    directory2.addComponent(file3)

    val rootDirectory = Directory("Root")
    rootDirectory.addComponent(directory1)
    rootDirectory.addComponent(directory2)

    rootDirectory.display()
}
