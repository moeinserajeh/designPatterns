package com.example.designpattern.observer

class MessageSubscriberThree : Observer {
    override fun update(m: Message) {
        println("MessageSubscriberThree :: " + m.messageContent)
    }
}