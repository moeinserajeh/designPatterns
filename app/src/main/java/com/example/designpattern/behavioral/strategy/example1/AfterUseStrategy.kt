package com.example.designpattern.behavioral.strategy.example1

interface IChargePurchaseStrategy{
    fun purchase()
}

class PurchaseChargeByDeposit:
    com.example.designpattern.behavioral.strategy.example1.IChargePurchaseStrategy {
    override fun purchase(){
        println("purchase charge by deposit")
    }
}

class PurchaseChargeByCard():
    com.example.designpattern.behavioral.strategy.example1.IChargePurchaseStrategy {
    override fun purchase(){
        println("purchase charge by card")
    }
}

class PurchaseChargeByCredit():
    com.example.designpattern.behavioral.strategy.example1.IChargePurchaseStrategy {
    override fun purchase(){
        println("purchase charge by credit")
    }
}

class StrategyPurchaseChargeManager(){
    fun purchase(strategy: com.example.designpattern.behavioral.strategy.example1.IChargePurchaseStrategy){
        strategy.purchase()
    }
}

fun main() {
    val purchaseChargeManager =
        com.example.designpattern.behavioral.strategy.example1.StrategyPurchaseChargeManager()
    purchaseChargeManager.purchase(com.example.designpattern.behavioral.strategy.example1.PurchaseChargeByDeposit())
}
