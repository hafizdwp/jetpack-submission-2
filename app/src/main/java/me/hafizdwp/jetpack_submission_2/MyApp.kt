package me.hafizdwp.jetpack_submission_2

import android.app.Application

/**
 * @author hafizdwp
 * 11/11/2019
 **/
class MyApp : Application() {

    companion object {
        lateinit var instance: MyApp

        fun getContext() = instance.applicationContext
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}