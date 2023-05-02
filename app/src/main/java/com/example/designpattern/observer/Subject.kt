package com.example.designpattern.observer

interface Subject {
    fun attach(observer: Observer)
    fun detach(observer: Observer)
    fun notifyUpdate(message: Message)
}