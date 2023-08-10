package com.example.designpattern.behavioral.mediator

import org.junit.Test

class main {

    @Test
    fun main(){
        val chatMediator: ChatMediator = ChatMediatorImpl()

        val user1 = User("John", chatMediator)
        val user2 = User("Alice", chatMediator)
        val user3 = User("Bob", chatMediator)

        chatMediator.addUser(user1)
        chatMediator.addUser(user2)
        chatMediator.addUser(user3)

        user1.sendMessage("Hello, everyone!")
        user2.sendMessage("Hello, everyone!, i am user 2")

    }

}