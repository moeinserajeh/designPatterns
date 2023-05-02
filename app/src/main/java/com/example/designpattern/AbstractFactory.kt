package com.example.designpattern

import android.util.Log

interface IUser{
    fun authentication()
}

interface IAuthentication{
    fun authenticate();
}

enum class UserType{
    Primary,Guest
}

enum class AuthenticationType{
    Core,Shahkar
}

enum class FactoryType{
    User,Authentication
}

class PrimaryUser : IUser {
    override fun authentication() {
        Log.e("moein","authentication for primary user ")
    }
}

class GuestUser : IUser {
    override fun authentication() {
        Log.e("moein","authentication for guest user ")
    }
}

class AuthenticationWithCore:IAuthentication{
    override fun authenticate() {
        Log.e("moein","authentication for guest user ")
    }

}
class AuthenticationWithShahkar:IAuthentication{
    override fun authenticate() {
        Log.e("moein","authentication for guest user ")
    }

}


interface AbstractFactory<T> {
    fun create(type: Any): T?
}

class UserFactory : AbstractFactory<IUser> {
    override fun create(type: Any): IUser? {
        return when (type) {
            UserType.Primary -> {
                PrimaryUser()
            }
            UserType.Guest -> {
                GuestUser()
            }
            else -> {null}
        }
    }
}

class AuthenticationFactory:AbstractFactory<IAuthentication> {
    override fun create(type: Any): IAuthentication? {
        when(type){
            AuthenticationType.Core-> AuthenticationWithCore()
            AuthenticationType.Shahkar->AuthenticationWithShahkar()
        }
        return null
    }
}


object FactoryProvider {
    fun getFactory(type: FactoryType): AbstractFactory<*> {
        return when(type) {
            FactoryType.User -> {
                UserFactory()
            }
            FactoryType.Authentication -> {
                AuthenticationFactory()
            }
        }
    }
}