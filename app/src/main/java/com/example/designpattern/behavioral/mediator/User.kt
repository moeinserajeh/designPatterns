package com.example.designpattern.behavioral.mediator

import android.util.Log

data class User(
    private val name: String,
    private val chatMediator: com.example.designpattern.behavioral.mediator.ChatMediator
) {
    fun sendMessage(message: String) {
        chatMediator.sendMessage(message, this)
    }

    fun receiveMessage(message: String) {
        Log.e("moein","$name received message: $message")
    }
}
