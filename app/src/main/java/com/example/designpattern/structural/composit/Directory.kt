package com.example.designpattern.structural.composit

class Directory(private val name: String) : FileSystemComponent {
    private val components = mutableListOf<FileSystemComponent>()

    fun addComponent(component: FileSystemComponent) {
        components.add(component)
    }

    override fun display() {
        println("Directory: $name")
        components.forEach { it.display() }
    }
}
