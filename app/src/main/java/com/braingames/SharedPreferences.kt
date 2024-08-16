package com.braingames

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity

class SharedPreferences(private val ctx:Context) {

    private val pref: SharedPreferences =ctx.getSharedPreferences("MySharedPref", AppCompatActivity.MODE_PRIVATE)
    fun saveStatus(status: Boolean) {
        val editor=pref.edit()
        editor.putBoolean("status",status)
        editor.apply()

    }
    fun getStatus(): Boolean {
        val language=pref.getBoolean("status", false,)
        return language
    }
    fun saveLevel(level: Int) {
        val editor=pref.edit()
        editor.putInt("level",level)
        editor.apply()

    }
    fun getLevel(): Int {
        val level=pref.getInt("level", 1,)
        return level
    }
}