package com.example.designpattern.creational.abstractfactory

class AuthenticationFactory: AbstractFactory<IAuthentication> {
    override fun create(type: Any): IAuthentication? {
        when(type){
            AuthenticationType.Core -> AuthenticationWithCore()
            AuthenticationType.Shahkar -> AuthenticationWithShahkar()
        }
        return null
    }
}