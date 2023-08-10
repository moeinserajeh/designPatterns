package com.example.designpattern.behavioral.observer

import org.junit.Test

class main {
    @Test
    fun main(){
        val s1 = MessageSubscriberOne()
        val s2 = MessageSubscriberTwo()
        val s3 = MessageSubscriberThree()

        val p = MessagePublisher()

        p.attach(s1)
        p.attach(s2)

        p.notifyUpdate(Message("First Message")) //s1 and s2 will receive the update


        p.detach(s1)
        p.attach(s3)

        p.notifyUpdate(Message("Second Message"))//s2 and s3 will receive the update
    }
}