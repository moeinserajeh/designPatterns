package com.example.designpattern.creational.abstractfactory

import android.util.Log

class AuthenticationWithCore: IAuthentication {
    override fun authenticate() {
        Log.e("moein","authentication for guest user ")
    }
}