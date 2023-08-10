package com.example.designpattern.behavioral.chainofresponsibility.errorhandler

class GenericErrorHandler :
    com.example.designpattern.behavioral.chainofresponsibility.errorhandler.ErrorHandler {
    override fun handleError(error: Throwable): Boolean {
        // This is the default handler for errors that were not handled by other handlers
        println("Unhandled Error: ${error.message}")
        return true
    }
}