package com.example.designpattern.creational.abstractfactory

interface AbstractFactory<T> {
    fun create(type: Any): T?
}