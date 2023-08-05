package com.example.designpattern.strategy.example2

class Product1(val name: String, val price: Double, val customerType: String) {
    fun calculateDiscountedPrice(): Double {
        if (customerType == "Regular") {
            return price * 0.95
        } else if (customerType == "Premium") {
            return price * 0.8
        } else if (customerType == "Christmas") {
            return price * 0.85
        } else if (customerType == "BlackFriday") {
            return price * 0.3
        } else {
            return price // No discount for other cases
        }
    }
}

fun main() {
    val product1 = Product1("Laptop", 1000.0, "Regular")
    val product2 = Product1("Smartphone", 500.0, "Premium")
    val product3 = Product1("Headphones", 50.0, "Christmas")
    val product4 = Product1("Camera", 120.0, "BlackFriday")

    println("Laptop - Original Price: ${product1.price}, Discounted Price: ${product1.calculateDiscountedPrice()}")
    println("Smartphone - Original Price: ${product2.price}, Discounted Price: ${product2.calculateDiscountedPrice()}")
    println("Headphones - Original Price: ${product3.price}, Discounted Price: ${product3.calculateDiscountedPrice()}")
    println("Camera - Original Price: ${product4.price}, Discounted Price: ${product4.calculateDiscountedPrice()}")
}
