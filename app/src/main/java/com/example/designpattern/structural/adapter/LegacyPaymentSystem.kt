package com.example.designpattern.structural.adapter

class LegacyPaymentSystem {
    fun initiatePayment(paymentAmount: Double) {
        println("Initiating payment of $$paymentAmount using LegacyPaymentSystem.")
    }
}