package com.example.designpattern.behavioral.strategy.example2.concrete

import com.example.designpattern.behavioral.strategy.example2.DiscountStrategy

class RegularCustomerDiscount :
    com.example.designpattern.behavioral.strategy.example2.DiscountStrategy {
    override fun applyDiscount(originalPrice: Double): Double {
        return originalPrice
    }
}




