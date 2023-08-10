package com.example.designpattern.behavioral.mediator

class ChatMediatorImpl : com.example.designpattern.behavioral.mediator.ChatMediator {
    private val users: MutableList<com.example.designpattern.behavioral.mediator.User>

    init {
        users = ArrayList()
    }

    override fun sendMessage(message: String, user: com.example.designpattern.behavioral.mediator.User) {
        for (u in users) {
            if (u !== user) {
                u.receiveMessage(message)
            }
        }
    }

    override fun addUser(user: com.example.designpattern.behavioral.mediator.User) {
        users.add(user)
    }
}
