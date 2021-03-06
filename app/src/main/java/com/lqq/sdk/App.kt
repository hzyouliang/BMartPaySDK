package com.lqq.sdk

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex
import com.bigfun.tm.BigFunSDK

class App : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        BigFunSDK.setDebug(true)
        BigFunSDK.getInstance().init(
            applicationContext,
            "bmartpay_test"
        )
    }
}