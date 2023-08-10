package com.example.designpattern.creational.abstractfactory

import android.util.Log

class GuestUser : IUser {
    override fun authentication() {
        Log.e("moein","authentication for guest user ")
    }
}