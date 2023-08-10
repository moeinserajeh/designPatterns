package com.example.designpattern.structural.adapter

fun main() {
    val legacyPaymentSystem = LegacyPaymentSystem()
    val paymentProcessor: PaymentProcessor = PaymentSystemAdapter(legacyPaymentSystem)

    val paymentAmount = 100.0
    paymentProcessor.processPayment(paymentAmount)
}
