package com.example.designpattern

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.builder.R
import com.example.designpattern.observer.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val userFactory = FactoryProvider.getFactory(FactoryType.User)
//        val guestUser = userFactory.create(UserType.Guest)  as GuestUser
//        guestUser.authentication()


        val s1 = MessageSubscriberOne()
        val s2 = MessageSubscriberTwo()
        val s3 = MessageSubscriberThree()

        val p = MessagePublisher()

        p.attach(s1)
        p.attach(s2)

        p.notifyUpdate(Message("First Message")) //s1 and s2 will receive the update


        p.detach(s1)
        p.attach(s3)

        p.notifyUpdate(Message("Second Message")) //s2 and s3 will receive the update

    }
}