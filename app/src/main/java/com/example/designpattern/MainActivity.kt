package com.example.designpattern

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.builder.R
import com.example.designpattern.chainofresponsibility.disscounthandler.DiscountChain
import com.example.designpattern.chainofresponsibility.disscounthandler.DiscountRequest
import com.example.designpattern.chainofresponsibility.errorhandler.ErrorHandlingChain
import com.google.gson.JsonSyntaxException
import okhttp3.ResponseBody
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* val userFactory = FactoryProvider.getFactory(FactoryType.User)
         val guestUser = userFactory.create(UserType.Guest)  as GuestUser
         guestUser.authentication()*/


        /*val s1 = MessageSubscriberOne()
        val s2 = MessageSubscriberTwo()
        val s3 = MessageSubscriberThree()

        val p = MessagePublisher()

        p.attach(s1)
        p.attach(s2)

        p.notifyUpdate(Message("First Message")) //s1 and s2 will receive the update


        p.detach(s1)
        p.attach(s3)

        p.notifyUpdate(Message("Second Message"))*/ //s2 and s3 will receive the update


        /*val chatMediator: ChatMediator = ChatMediatorImpl()

        val user1 = User("John", chatMediator)
        val user2 = User("Alice", chatMediator)
        val user3 = User("Bob", chatMediator)

        chatMediator.addUser(user1)
        chatMediator.addUser(user2)
        chatMediator.addUser(user3)

        user1.sendMessage("Hello, everyone!")
        user2.sendMessage("Hello, everyone!, i am user 2")*/
/////////----------------------------------------------------
//        val discountChain = DiscountChain()
//
//        val discount1 = discountChain.calculateDiscount(DiscountRequest(120.0))
//        val discount2 = discountChain.calculateDiscount(DiscountRequest(75.0))
//        val discount3 = discountChain.calculateDiscount(DiscountRequest(30.0))
//
//        println("Total Discount for Request 1: $discount1")
//        println("Total Discount for Request 2: $discount2")
//        println("Total Discount for Request 3: $discount3")





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