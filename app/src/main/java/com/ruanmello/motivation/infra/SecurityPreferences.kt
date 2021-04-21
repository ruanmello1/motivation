package com.ruanmello.motivation.infra

import android.content.Context
import android.content.SharedPreferences

//shared preferences, salva o nome informado
class SecurityPreferences(val context: Context) {

    private val mSharedPreferences =
        context.getSharedPreferences("motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, value: String) {
        mSharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key: String): String {
        return mSharedPreferences.getString(key, "") ?: ""

    }
}