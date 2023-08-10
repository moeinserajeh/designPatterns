package com.example.designpattern.behavioral.observer


class MessagePublisher : com.example.designpattern.behavioral.observer.Subject {
    private val observers: MutableList<com.example.designpattern.behavioral.observer.Observer> = ArrayList()
    override fun attach(observer: com.example.designpattern.behavioral.observer.Observer) {
        observers.add(observer)
    }

    override fun detach(observer: com.example.designpattern.behavioral.observer.Observer) {
        observers.remove(observer)
    }

    override fun notifyUpdate(message: com.example.designpattern.behavioral.observer.Message) {
        for (observer in observers) {
            observer.update(message)
        }
    }
}