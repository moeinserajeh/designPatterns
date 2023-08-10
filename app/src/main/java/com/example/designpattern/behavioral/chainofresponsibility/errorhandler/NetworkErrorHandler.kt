package com.example.designpattern.behavioral.chainofresponsibility.errorhandler

import java.io.IOException

class NetworkErrorHandler(var nextHandler: com.example.designpattern.behavioral.chainofresponsibility.errorhandler.ErrorHandler? = null) :
    com.example.designpattern.behavioral.chainofresponsibility.errorhandler.ErrorHandler {
    override fun handleError(error: Throwable): Boolean {
        // Check if the error is a network-related error (e.g., IOException)
        if (error is IOException) {
            // Handle the network error
            println("Network Error: ${error.message}")
            return true
        }

        // If not a network error, pass the error to the next handler
        return nextHandler?.handleError(error) ?: false
    }
}






