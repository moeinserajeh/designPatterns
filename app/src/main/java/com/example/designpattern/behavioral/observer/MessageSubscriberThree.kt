package com.example.designpattern.behavioral.observer

class MessageSubscriberThree : com.example.designpattern.behavioral.observer.Observer {
    override fun update(m: com.example.designpattern.behavioral.observer.Message) {
        println("MessageSubscriberThree :: " + m.messageContent)
    }
}