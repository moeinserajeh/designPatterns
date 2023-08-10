package com.example.designpattern.behavioral.mediator

interface ChatMediator {
    fun sendMessage(message: String, user: com.example.designpattern.behavioral.mediator.User)
    fun addUser(user: com.example.designpattern.behavioral.mediator.User)
}
