package com.example.designpattern.behavioral.chainofresponsibility.errorhandler

interface ErrorHandler {
    fun handleError(error: Throwable): Boolean
}