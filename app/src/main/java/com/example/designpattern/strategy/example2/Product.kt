package com.example.designpattern.strategy.example2

class Product(private val name: String, private val price: Double, private val discountStrategy: DiscountStrategy) {
    fun calculateDiscountedPrice(): Double {
        return discountStrategy.applyDiscount(price)
    }

    override fun toString(): String {
        return "$name - Original Price: $price, Discounted Price: ${calculateDiscountedPrice()}"
    }
}