package com.example.designpattern.strategy.example2

import com.example.designpattern.strategy.example2.concrete.BlackFridayDiscount
import com.example.designpattern.strategy.example2.concrete.ChristmasDiscount
import com.example.designpattern.strategy.example2.concrete.PremiumCustomerDiscount
import com.example.designpattern.strategy.example2.concrete.RegularCustomerDiscount

    fun main() {
        val regularCustomerDiscount = RegularCustomerDiscount()
        val premiumCustomerDiscount = PremiumCustomerDiscount()
        val christmasDiscount = ChristmasDiscount()
        val blackFridayDiscount = BlackFridayDiscount()

        val product1 = Product("Laptop", 1000.0, regularCustomerDiscount)
        val product2 = Product("Smartphone", 500.0, premiumCustomerDiscount)
        val product3 = Product("Headphone", 50.0, christmasDiscount)
        val product4 = Product("Camera", 120.0, blackFridayDiscount)

        println(product1)
        println(product2)
        println(product3)
        println(product4)
    }
