package com.example.designpattern.structural.facade.sample1

class OrderProcessor {
    fun placeOrder(user: User, product: Product): Order {
        // Logic to process the order and create an order object
        return Order(user, product, 1, product.price)
    }
}
