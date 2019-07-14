package com.reactnativetunnel

import android.preference.PreferenceManager
import android.util.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule

class TunnelModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    private val name = "ReactNativeTunnel"
    private val debugServerHostKey = "debug_http_host"

    init {
        val domainUrl = if (BuildConfig.DOMAIN_URL.equals("null")) {
            ""
        } else {
            BuildConfig.DOMAIN_URL
        }

        val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(reactContext)
        with(sharedPrefs.edit()) {
            putString(debugServerHostKey, domainUrl)
            commit()
        }
    }

    override fun getName() = name
}