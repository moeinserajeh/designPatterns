package com.example.designpattern.creational.abstractfactory

import android.util.Log

class PrimaryUser : IUser {
    override fun authentication() {
        Log.e("moein","authentication for primary user ")
    }
}