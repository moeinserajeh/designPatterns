package com.example.designpattern.structural.decorator.discountandgift

class GiftWrappingDecorator(private val decoratedCart: ShoppingCart) : ShoppingCart {
    private val giftWrappingPrice = 5.0

    override fun addProduct(productName: String, price: Double) {
        decoratedCart.addProduct("$productName (Gift Wrapped)", price + giftWrappingPrice)
    }

    override fun getTotalPrice(): Double {
        return decoratedCart.getTotalPrice() + giftWrappingPrice
    }
}