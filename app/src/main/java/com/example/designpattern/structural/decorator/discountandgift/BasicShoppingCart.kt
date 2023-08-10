package com.example.designpattern.structural.decorator.discountandgift

class BasicShoppingCart : ShoppingCart {
    private val products = mutableMapOf<String, Double>()

    override fun addProduct(productName: String, price: Double) {
        products[productName] = price
    }

    override fun getTotalPrice(): Double {
        return products.values.sum()
    }
}
