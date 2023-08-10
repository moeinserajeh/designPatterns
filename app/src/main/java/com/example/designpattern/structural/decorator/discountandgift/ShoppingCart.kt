package com.example.designpattern.structural.decorator.discountandgift

interface ShoppingCart {
    fun addProduct(productName: String, price: Double)
    fun getTotalPrice(): Double
}