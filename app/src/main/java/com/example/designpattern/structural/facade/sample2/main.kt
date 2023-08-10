package com.example.designpattern.structural.facade.sample2

fun main() {
    val securityFacade = SecurityFacade()

    val loggedIn = securityFacade.authenticate("username", "password")
    if (loggedIn) {
        val authorized = securityFacade.isAuthorized("user123", "read_data")
        if (authorized) {
            val sensitiveData = "Some sensitive information"
            val encryptedData = securityFacade.encryptData(sensitiveData)
            println("Encrypted data: $encryptedData")
        } else {
            println("User is not authorized to access the data.")
        }
    } else {
        println("Login failed.")
    }
}