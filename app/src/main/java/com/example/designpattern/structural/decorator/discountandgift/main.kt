package com.example.designpattern.structural.decorator.discountandgift

fun main() {
    // Create the basic shopping cart
    val basicCart = BasicShoppingCart()

    // Adding discount to the shopping cart
    val cartWithDiscount = DiscountDecorator(basicCart, 0.1)
    cartWithDiscount.addProduct("Phone", 500.0)
    cartWithDiscount.addProduct("Laptop", 1000.0)

    // Adding gift wrapping and discount to the shopping cart
    val cartWithGiftWrappingAndDiscount = GiftWrappingDecorator(DiscountDecorator(basicCart, 0.2))
    cartWithGiftWrappingAndDiscount.addProduct("Headphones", 50.0)
    cartWithGiftWrappingAndDiscount.addProduct("Tablet", 300.0)

    // Get the total price of each cart
    val totalPriceWithDiscount = cartWithDiscount.getTotalPrice()
    val totalPriceWithGiftWrappingAndDiscount = cartWithGiftWrappingAndDiscount.getTotalPrice()

    // Show the total prices in an Android app using Toast or any other UI component
    println("Total price with discount: $totalPriceWithDiscount")
    println("Total price with gift wrapping and discount: $totalPriceWithGiftWrappingAndDiscount")
}
