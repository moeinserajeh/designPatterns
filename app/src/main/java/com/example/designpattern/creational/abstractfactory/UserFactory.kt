package com.example.designpattern.creational.abstractfactory

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