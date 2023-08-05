package com.example.designpattern.chainofresponsibility.errorhandler

class GenericErrorHandler : ErrorHandler {
    override fun handleError(error: Throwable): Boolean {
        // This is the default handler for errors that were not handled by other handlers
        println("Unhandled Error: ${error.message}")
        return true
    }
}