package com.example.designpattern.mediator.chat

interface ChatMediator {
    fun sendMessage(message: String, user: User)
    fun addUser(user: User)
}
