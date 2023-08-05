package com.example.designpattern.strategy.example1

interface IChargePurchaseStrategy{
    fun purchase()
}

class PurchaseChargeByDeposit:IChargePurchaseStrategy{
    override fun purchase(){
        println("purchase charge by deposit")
    }
}

class PurchaseChargeByCard():IChargePurchaseStrategy{
    override fun purchase(){
        println("purchase charge by card")
    }
}

class PurchaseChargeByCredit():IChargePurchaseStrategy{
    override fun purchase(){
        println("purchase charge by credit")
    }
}

class StrategyPurchaseChargeManager(){
    fun purchase(strategy:IChargePurchaseStrategy){
        strategy.purchase()
    }
}

fun main() {
    val purchaseChargeManager = StrategyPurchaseChargeManager()
    purchaseChargeManager.purchase(PurchaseChargeByDeposit())
}
