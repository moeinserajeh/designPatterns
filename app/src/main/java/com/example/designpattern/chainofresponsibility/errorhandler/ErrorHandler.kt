package com.example.designpattern.chainofresponsibility.errorhandler

interface ErrorHandler {
    fun handleError(error: Throwable): Boolean
}