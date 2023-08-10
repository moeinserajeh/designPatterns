package com.example.designpattern.structural.proxy.example3

// RealSecureResource class (Real Subject)
class RealSecureResource : SecureResource {
    override fun performAction(user: User) {
        println("${user.username} performing action on secure resource.")
    }
}


