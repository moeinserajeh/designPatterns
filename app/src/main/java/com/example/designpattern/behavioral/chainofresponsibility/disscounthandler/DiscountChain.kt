package com.example.designpattern.behavioral.chainofresponsibility.disscounthandler

class DiscountChain {
    private var twentyPercentDiscountHandler =
        com.example.designpattern.behavioral.chainofresponsibility.disscounthandler.TwentyPercentDiscountHandler()
    private var tenPercentDiscountHandler =
        com.example.designpattern.behavioral.chainofresponsibility.disscounthandler.TenPercentDiscountHandler()
    private var noDiscountHandler =
        com.example.designpattern.behavioral.chainofresponsibility.disscounthandler.NoDiscountHandler()

    init {
        twentyPercentDiscountHandler.nextHandler = tenPercentDiscountHandler
        tenPercentDiscountHandler.nextHandler = noDiscountHandler
    }

    fun calculateDiscount(request: com.example.designpattern.behavioral.chainofresponsibility.disscounthandler.DiscountRequest): Double {
        // Start processing the request through the discount chain
        return twentyPercentDiscountHandler.applyDiscount(request)
    }
}