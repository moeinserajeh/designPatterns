package com.example.designpattern.creational.abstractfactory

import com.example.designpattern.creational.abstractfactory.FactoryProvider.getFactory
import org.junit.Test


@Test
fun main(){
    val userFactory = getFactory(FactoryType.User)
    val guestUser = userFactory.create(UserType.Guest)  as GuestUser
    guestUser.authentication()
}