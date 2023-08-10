package com.example.designpattern.behavioral.chainofresponsibility.disscounthandler

class TwentyPercentDiscountHandler(var nextHandler: com.example.designpattern.behavioral.chainofresponsibility.disscounthandler.DiscountHandler? = null) :
    com.example.designpattern.behavioral.chainofresponsibility.disscounthandler.DiscountHandler {
    override fun applyDiscount(request: com.example.designpattern.behavioral.chainofresponsibility.disscounthandler.DiscountRequest): Double {
        return if (request.purchaseAmount >= 100.0) {
            val discountAmount = request.purchaseAmount * 0.2
            println("Applied 20% discount: -$discountAmount")
            discountAmount
        } else {
            // Pass the request to the next handler
            nextHandler?.applyDiscount(request) ?: 0.0
        }
    }
}