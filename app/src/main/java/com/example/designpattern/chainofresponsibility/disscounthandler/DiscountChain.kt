package com.example.designpattern.chainofresponsibility.disscounthandler

class DiscountChain {
    private var twentyPercentDiscountHandler = TwentyPercentDiscountHandler()
    private var tenPercentDiscountHandler = TenPercentDiscountHandler()
    private var noDiscountHandler = NoDiscountHandler()

    init {
        twentyPercentDiscountHandler.nextHandler = tenPercentDiscountHandler
        tenPercentDiscountHandler.nextHandler = noDiscountHandler
    }

    fun calculateDiscount(request: DiscountRequest): Double {
        // Start processing the request through the discount chain
        return twentyPercentDiscountHandler.applyDiscount(request)
    }
}