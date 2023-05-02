package com.example.designpattern.observer

class MessageSubscriberOne : Observer {
    override fun update(m: Message) {
        println("MessageSubscriberOne :: " + m.messageContent)
    }
}
