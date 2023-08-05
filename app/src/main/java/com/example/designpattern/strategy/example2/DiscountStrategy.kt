package com.example.designpattern.strategy.example2

interface DiscountStrategy {
    fun applyDiscount(originalPrice: Double): Double
}