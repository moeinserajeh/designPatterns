package com.example.designpattern.behavioral.observer

class MessageSubscriberTwo : com.example.designpattern.behavioral.observer.Observer {
    override fun update(m: com.example.designpattern.behavioral.observer.Message) {
        println("MessageSubscriberTwo :: " + m.messageContent)
    }
}