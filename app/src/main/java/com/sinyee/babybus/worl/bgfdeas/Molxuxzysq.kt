package com.sinyee.babybus.worl.bgfdeas

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class Molxuxzysq : Application() {
    companion object {
        var sosdok = "link"
        var qowijsdo = "appsChecker"

        var dijs: String? = "countryCode"
        var cxij: String? = "c11"

        const val cokvk = "f857d51d-0d89-4d1d-bdde-188372a27931"
        var eorkkodsko: String? = "d11"
        var rijdi: String? = "mainid"
        var apsosodk = "geo"





    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(cokvk)
        Hawk.init(this).build()
    }
}