package com.example.designpattern.behavioral.strategy.example2

interface DiscountStrategy {
    fun applyDiscount(originalPrice: Double): Double
}