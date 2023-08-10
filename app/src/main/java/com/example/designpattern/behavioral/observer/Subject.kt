package com.example.designpattern.behavioral.observer

interface Subject {
    fun attach(observer: com.example.designpattern.behavioral.observer.Observer)
    fun detach(observer: com.example.designpattern.behavioral.observer.Observer)
    fun notifyUpdate(message: com.example.designpattern.behavioral.observer.Message)
}