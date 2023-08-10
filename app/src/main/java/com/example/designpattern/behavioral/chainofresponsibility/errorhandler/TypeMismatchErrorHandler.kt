package com.example.designpattern.behavioral.chainofresponsibility.errorhandler

import com.google.gson.JsonSyntaxException

class TypeMismatchErrorHandler(var nextHandler: com.example.designpattern.behavioral.chainofresponsibility.errorhandler.ErrorHandler? = null) :
    com.example.designpattern.behavioral.chainofresponsibility.errorhandler.ErrorHandler {
    override fun handleError(error: Throwable): Boolean {
        // Check if the error is a type mismatch error (e.g., JsonSyntaxException)
        if (error is JsonSyntaxException) {
            // Handle the type mismatch error
            println("Type Mismatch Error: ${error.message}")
            return true
        }

        // If not a type mismatch error, pass the error to the next handler
        return nextHandler?.handleError(error) ?: false
    }
}