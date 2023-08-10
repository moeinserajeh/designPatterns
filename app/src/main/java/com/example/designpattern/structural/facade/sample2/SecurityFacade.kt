package com.example.designpattern.structural.facade.sample2

class SecurityFacade {
    private val authentication = Authentication()
    private val authorization = Authorization()
    private val encryption = Encryption()

    fun authenticate(username: String, password: String): Boolean {
        return authentication.login(username, password)
    }

    fun isAuthorized(user: String, permission: String): Boolean {
        return authorization.checkPermission(user, permission)
    }

    fun encryptData(data: String): String {
        return encryption.encrypt(data)
    }
}

