package com.example.designpattern.structural.facade.sample1

class ECommerceFacade {
    private val userAuthenticator = UserAuthenticator()
    private val productManager = ProductManager()
    private val orderProcessor = OrderProcessor()

    fun processOrder(username: String, password: String, productId: String): Order? {
        val isAuthenticated = userAuthenticator.authenticateUser(username, password)
        if (isAuthenticated) {
            val user = User(username)
            val product = productManager.getProduct(productId)
            return orderProcessor.placeOrder(user, product)
        }
        return null
    }
}
