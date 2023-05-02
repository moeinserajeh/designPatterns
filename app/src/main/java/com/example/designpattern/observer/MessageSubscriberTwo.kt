package com.example.designpattern.observer

class MessageSubscriberTwo : Observer {
    override fun update(m: Message) {
        println("MessageSubscriberTwo :: " + m.messageContent)
    }
}