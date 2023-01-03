package com.sinyee.babybus.worl.hytesds

import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.qowijsdo
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.apsosodk
import kotlinx.coroutines.Dispatchers
import com.orhanobut.hawk.Hawk
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.dijs
import kotlinx.coroutines.GlobalScope
import android.content.Intent
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.rijdi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.sinyee.babybus.worl.Cduisuhda
import com.sinyee.babybus.worl.R
import com.sinyee.babybus.worl.bgfdeas.Ersyuuasdw






import kotlinx.coroutines.launch

class Xsisudwqsa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hyudffdgwesd)
        xodiocxij()
    }


    private fun xodiocxij() {

        val rokkookfd = firuioosksadw()

        if (rokkookfd == "0") {
            qowkw()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                sdsdoksdo()
            }
            fijsosdkoosd()
        }
    }
    private fun firuioosksadw(): String? {
        val fokpplxclpcx: String? = Hawk.get(qowijsdo)
        Log.d("ADACt Data", fokpplxclpcx.toString())
        return fokpplxclpcx
    }
    private fun fijsosdkoosd() {
        val okcxok = Intent(this@Xsisudwqsa, Ersyuuasdw::class.java)
        startActivity(okcxok)
        finish()
    }


    private fun sdsdoksdo(){
        val dokeefplefp = AdvertisingIdClient(applicationContext)
        dokeefplefp.start()
        val sdkso = dokeefplefp.info.id
        Log.d("getAdvertisingId = ", sdkso.toString())
        Hawk.put(rijdi, sdkso)
    }

    private fun qowkw() {
        val fodokdfji = Intent(this@Xsisudwqsa, Cduisuhda::class.java)
        Hawk.put(apsosodk, null)
        Hawk.put(dijs, null)
        startActivity(fodokdfji)
        finish()
    }
























}