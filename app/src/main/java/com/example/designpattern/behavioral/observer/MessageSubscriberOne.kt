package com.example.designpattern.behavioral.observer

class MessageSubscriberOne : com.example.designpattern.behavioral.observer.Observer {
    override fun update(m: com.example.designpattern.behavioral.observer.Message) {
        println("MessageSubscriberOne :: " + m.messageContent)
    }
}
