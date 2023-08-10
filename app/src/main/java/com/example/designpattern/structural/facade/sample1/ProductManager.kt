package com.example.designpattern.structural.facade.sample1

class ProductManager {
    fun getProduct(productId: String): Product {
        // Logic to fetch the product from the database or external service
        return Product(productId, "Sample Product", 99.99)
    }
}