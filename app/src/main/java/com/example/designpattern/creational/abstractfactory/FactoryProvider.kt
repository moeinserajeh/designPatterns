package com.example.designpattern.creational.abstractfactory

object FactoryProvider {
    fun getFactory(type: FactoryType): AbstractFactory<*> {
        return when (type) {
            FactoryType.User -> {
                UserFactory()
            }

            FactoryType.Authentication -> {
                AuthenticationFactory()
            }
        }
    }
}