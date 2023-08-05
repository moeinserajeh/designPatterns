package com.example.designpattern.strategy.example1

import com.example.designpattern.strategy.example1.PurchaseChargeType.*

interface IChargePurchase{
    fun purchase()
}

class BuyChargeByDeposit():IChargePurchase{
    override fun purchase(){
        println("purchase charge by deposit")
    }
}

class BuyChargeByCard():IChargePurchase{
    override fun purchase(){
        println("purchase charge by card")
    }
}

class BuyChargeByCredit():IChargePurchase{
    override fun purchase(){
        println("purchase charge by credit")
    }
}

enum class PurchaseChargeType{
    Deposit,Card,Credit
}

class PurchaseChargeManager{
    fun purchase(purchaseChargeType: PurchaseChargeType){
        when(purchaseChargeType){
            Deposit -> BuyChargeByDeposit().purchase()
            Card -> BuyChargeByCard().purchase()
            Credit -> BuyChargeByCredit().purchase()
        }
    }
}

fun main() {
    val purchaseChargeManager = PurchaseChargeManager()
    purchaseChargeManager.purchase(purchaseChargeType = Deposit)
}