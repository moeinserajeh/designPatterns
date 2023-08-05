package com.example.designpattern.chainofresponsibility.errorhandler

class ErrorHandlingChain {
    private val networkErrorHandler = NetworkErrorHandler()
    private val httpErrorHandler = HttpErrorHandler()
    private val typeMismatchErrorHandler = TypeMismatchErrorHandler()
    private val genericErrorHandler = GenericErrorHandler()

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