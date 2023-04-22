package com.example.builder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userFactory = FactoryProvider.getFactory(FactoryType.User)
        val guestUser = userFactory.create(UserType.Guest)  as GuestUser
        guestUser.authentication()
    }
}