package com.example.designpattern.behavioral.chainofresponsibility.errorhandler

import com.google.gson.JsonSyntaxException
import okhttp3.ResponseBody
import org.junit.Test
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException

class main {
    @Test
    fun main(){
        val errorHandlingChain = ErrorHandlingChain()

        // Simulate a Retrofit network call that results in an IOException
        val ioException = IOException("No internet connection")
        errorHandlingChain.handleError(ioException)

        // Simulate a Retrofit network call that results in an HttpException
        val httpException = HttpException(Response.error<Any>(404, ResponseBody.create(null, "")))
        errorHandlingChain.handleError(httpException)

        // Simulate a Retrofit network call that results in a JsonSyntaxException
        val jsonException = JsonSyntaxException("Type mismatch")
        errorHandlingChain.handleError(jsonException)

        // Simulate a Retrofit network call that results in an unknown error
        val unknownException = IllegalStateException("Unknown error")
        errorHandlingChain.handleError(unknownException)

    }
}