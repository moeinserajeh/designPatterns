package com.example.designpattern.structural.decorator.discountandgift

class DiscountDecorator(private val decoratedCart: ShoppingCart, private val discountPercentage: Double) :
    ShoppingCart {
    override fun addProduct(productName: String, price: Double) {
        decoratedCart.addProduct(productName, price - (price * discountPercentage))
    }

    override fun getTotalPrice(): Double {
        return decoratedCart.getTotalPrice()
    }
}


