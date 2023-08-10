package com.example.designpattern.behavioral.chainofresponsibility.disscounthandler

interface DiscountHandler {
    fun applyDiscount(request: com.example.designpattern.behavioral.chainofresponsibility.disscounthandler.DiscountRequest): Double
}