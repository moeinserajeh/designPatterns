package com.example.designpattern.chainofresponsibility.disscounthandler

class TenPercentDiscountHandler(var nextHandler: DiscountHandler? = null) : DiscountHandler {
    override fun applyDiscount(request: DiscountRequest): Double {
        return if (request.purchaseAmount >= 50.0 && request.purchaseAmount < 100.0) {
            val discountAmount = request.purchaseAmount * 0.1
            println("Applied 10% discount: -$discountAmount")
            discountAmount
        } else {
            // Pass the request to the next handler
            nextHandler?.applyDiscount(request) ?: 0.0
        }
    }
}