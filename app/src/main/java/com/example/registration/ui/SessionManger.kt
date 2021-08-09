package com.example.registration.ui

import android.content.Context
import android.content.SharedPreferences

class SessionManger {
    var sharedPreferences: SharedPreferences =context.getSharedPreferences("CODE_HIVE_PREFS",
        Context.MODE_PRIVATE)
    fun saveAccToken(token:String){
        sharedPreferences.edit().putString("ACCESS_TOKEN",token).apply()

    }
    fun fetchAccToken():String?{
        return sharedPreferences.getString("ACCESS_TOKEN","")
    }
}