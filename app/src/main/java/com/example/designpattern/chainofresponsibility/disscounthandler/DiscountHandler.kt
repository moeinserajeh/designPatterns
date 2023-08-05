package com.example.designpattern.chainofresponsibility.disscounthandler

interface DiscountHandler {
    fun applyDiscount(request: DiscountRequest): Double
}