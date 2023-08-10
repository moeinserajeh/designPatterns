package com.example.designpattern.behavioral.strategy.example2

import com.example.designpattern.behavioral.strategy.example2.concrete.BlackFridayDiscount
import com.example.designpattern.behavioral.strategy.example2.concrete.ChristmasDiscount
import com.example.designpattern.behavioral.strategy.example2.concrete.PremiumCustomerDiscount
import com.example.designpattern.behavioral.strategy.example2.concrete.RegularCustomerDiscount

    fun main() {
        val regularCustomerDiscount =
            com.example.designpattern.behavioral.strategy.example2.concrete.RegularCustomerDiscount()
        val premiumCustomerDiscount =
            com.example.designpattern.behavioral.strategy.example2.concrete.PremiumCustomerDiscount()
        val christmasDiscount =
            com.example.designpattern.behavioral.strategy.example2.concrete.ChristmasDiscount()
        val blackFridayDiscount =
            com.example.designpattern.behavioral.strategy.example2.concrete.BlackFridayDiscount()

        val product1 = com.example.designpattern.behavioral.strategy.example2.Product(
            "Laptop",
            1000.0,
            regularCustomerDiscount
        )
        val product2 = com.example.designpattern.behavioral.strategy.example2.Product(
            "Smartphone",
            500.0,
            premiumCustomerDiscount
        )
        val product3 = com.example.designpattern.behavioral.strategy.example2.Product(
            "Headphone",
            50.0,
            christmasDiscount
        )
        val product4 = com.example.designpattern.behavioral.strategy.example2.Product(
            "Camera",
            120.0,
            blackFridayDiscount
        )

        println(product1)
        println(product2)
        println(product3)
        println(product4)
    }
