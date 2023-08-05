package com.example.designpattern.chainofresponsibility.disscounthandler

class NoDiscountHandler : DiscountHandler {
    override fun applyDiscount(request: DiscountRequest): Double {
        println("No discount applied.")
        return 0.0
    }
}