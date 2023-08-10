package com.example.designpattern.structural.adapter

class PaymentSystemAdapter(private val legacyPaymentSystem: LegacyPaymentSystem) : PaymentProcessor {
    override fun processPayment(amount: Double) {
        legacyPaymentSystem.initiatePayment(amount)
    }
}
