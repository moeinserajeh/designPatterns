package com.example.designpattern.structural.proxy.example3


fun main() {
    val adminUser = User("admin", UserRole.ADMIN)
    val regularUser = User("user", UserRole.USER)

    val realResource = RealSecureResource()
    val adminProxy = AccessControlProxy(realResource)

    adminProxy.performAction(adminUser)
    adminProxy.performAction(regularUser)
}
