package com.example.designpattern.observer


class MessagePublisher : Subject {
    private val observers: MutableList<Observer> = ArrayList()
    override fun attach(observer: Observer) {
        observers.add(observer)
    }

    override fun detach(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyUpdate(message: Message) {
        for (observer in observers) {
            observer.update(message)
        }
    }
}