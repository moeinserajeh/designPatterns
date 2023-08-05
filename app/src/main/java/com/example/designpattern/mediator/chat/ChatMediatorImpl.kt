package com.example.designpattern.mediator.chat

class ChatMediatorImpl : ChatMediator {
    private val users: MutableList<User>

    init {
        users = ArrayList()
    }

    override fun sendMessage(message: String, user: User) {
        for (u in users) {
            if (u !== user) {
                u.receiveMessage(message)
            }
        }
    }

    override fun addUser(user: User) {
        users.add(user)
    }
}
