package com.example.designpattern.structural.proxy.example3

// AccessControlProxy class (Proxy)
class AccessControlProxy(private val realResource: RealSecureResource) : SecureResource {
    override fun performAction(user: User) {
        if (user.role == UserRole.ADMIN) {
            realResource.performAction(user)
        } else {
            println("${user.username} does not have permission to perform this action.")
        }
    }
}