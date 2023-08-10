package com.example.designpattern.behavioral.strategy.example1

import com.example.designpattern.behavioral.strategy.example1.PurchaseChargeType.*

interface IChargePurchase{
    fun purchase()
}

class BuyChargeByDeposit(): com.example.designpattern.behavioral.strategy.example1.IChargePurchase {
    override fun purchase(){
        println("purchase charge by deposit")
    }
}

class BuyChargeByCard(): com.example.designpattern.behavioral.strategy.example1.IChargePurchase {
    override fun purchase(){
        println("purchase charge by card")
    }
}

class BuyChargeByCredit(): com.example.designpattern.behavioral.strategy.example1.IChargePurchase {
    override fun purchase(){
        println("purchase charge by credit")
    }
}

enum class PurchaseChargeType{
    Deposit,Card,Credit
}

class PurchaseChargeManager{
    fun purchase(purchaseChargeType: com.example.designpattern.behavioral.strategy.example1.PurchaseChargeType){
        when(purchaseChargeType){
            Deposit -> com.example.designpattern.behavioral.strategy.example1.BuyChargeByDeposit().purchase()
            Card -> com.example.designpattern.behavioral.strategy.example1.BuyChargeByCard().purchase()
            Credit -> com.example.designpattern.behavioral.strategy.example1.BuyChargeByCredit().purchase()
        }
    }
}

fun main() {
    val purchaseChargeManager =
        com.example.designpattern.behavioral.strategy.example1.PurchaseChargeManager()
    purchaseChargeManager.purchase(purchaseChargeType = Deposit)
}