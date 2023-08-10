package com.example.designpattern.behavioral.chainofresponsibility.disscounthandler

class NoDiscountHandler :
    com.example.designpattern.behavioral.chainofresponsibility.disscounthandler.DiscountHandler {
    override fun applyDiscount(request: com.example.designpattern.behavioral.chainofresponsibility.disscounthandler.DiscountRequest): Double {
        println("No discount applied.")
        return 0.0
    }
}