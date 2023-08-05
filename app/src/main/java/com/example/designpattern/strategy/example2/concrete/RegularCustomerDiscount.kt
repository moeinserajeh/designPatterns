package com.example.designpattern.strategy.example2.concrete

import com.example.designpattern.strategy.example2.DiscountStrategy

class RegularCustomerDiscount : DiscountStrategy {
    override fun applyDiscount(originalPrice: Double): Double {
        return originalPrice
    }
}




