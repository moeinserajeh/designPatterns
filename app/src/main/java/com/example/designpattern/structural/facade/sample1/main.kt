package com.example.designpattern.structural.facade.sample1

fun main() {
    val eCommerceFacade = ECommerceFacade()

    val username = "john_doe"
    val password = "secret_password"
    val productId = "12345"

    val order = eCommerceFacade.processOrder(username, password, productId)
    if (order != null) {
        println("Order placed successfully: ${order.product.name}, Quantity: ${order.quantity}, Total Price: ${order.totalPrice}")
    } else {
        println("Failed to process the order.")
    }
}
