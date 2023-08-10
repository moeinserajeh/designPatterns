package com.example.designpattern.behavioral.chainofresponsibility.disscounthandler

import org.junit.Test

class main {

    @Test
    fun main(){
        val discountChain = DiscountChain()

        val discount1 = discountChain.calculateDiscount(DiscountRequest(120.0))
        val discount2 = discountChain.calculateDiscount(DiscountRequest(75.0))
        val discount3 = discountChain.calculateDiscount(DiscountRequest(30.0))

        println("Total Discount for Request 1: $discount1")
        println("Total Discount for Request 2: $discount2")
        println("Total Discount for Request 3: $discount3")
    }
}