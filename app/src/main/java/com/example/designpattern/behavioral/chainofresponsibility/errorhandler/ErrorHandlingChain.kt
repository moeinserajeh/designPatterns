package com.example.designpattern.behavioral.chainofresponsibility.errorhandler

class ErrorHandlingChain {
    private val networkErrorHandler =
        com.example.designpattern.behavioral.chainofresponsibility.errorhandler.NetworkErrorHandler()
    private val httpErrorHandler =
        com.example.designpattern.behavioral.chainofresponsibility.errorhandler.HttpErrorHandler()
    private val typeMismatchErrorHandler =
        com.example.designpattern.behavioral.chainofresponsibility.errorhandler.TypeMismatchErrorHandler()
    private val genericErrorHandler =
        com.example.designpattern.behavioral.chainofresponsibility.errorhandler.GenericErrorHandler()

    init {
        networkErrorHandler.nextHandler = httpErrorHandler
        httpErrorHandler.nextHandler = typeMismatchErrorHandler
        typeMismatchErrorHandler.nextHandler = genericErrorHandler
    }

    fun handleError(error: Throwable) {
        // Start processing the error through the error handling chain
        networkErrorHandler.handleError(error)
    }
}