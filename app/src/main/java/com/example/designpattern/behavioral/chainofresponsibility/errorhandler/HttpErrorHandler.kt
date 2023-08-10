package com.example.designpattern.behavioral.chainofresponsibility.errorhandler

import retrofit2.HttpException

class HttpErrorHandler(var nextHandler: com.example.designpattern.behavioral.chainofresponsibility.errorhandler.ErrorHandler? = null) :
    com.example.designpattern.behavioral.chainofresponsibility.errorhandler.ErrorHandler {
    override fun handleError(error: Throwable): Boolean {
        // Check if the error is an HTTP error (e.g., HttpException)
        if (error is HttpException) {
            // Handle the HTTP error
            println("HTTP Error: ${error.code()}")
            return true
        }

        // If not an HTTP error, pass the error to the next handler
        return nextHandler?.handleError(error) ?: false
    }
}