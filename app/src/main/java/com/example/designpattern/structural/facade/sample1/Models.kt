package com.example.designpattern.structural.facade.sample1

data class User(val username: String)

data class Product(val id: String, val name: String, val price: Double)

data class Order(val user: User, val product: Product, val quantity: Int, val totalPrice: Double)
