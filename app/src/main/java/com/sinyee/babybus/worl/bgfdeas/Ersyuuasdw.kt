package com.sinyee.babybus.worl.bgfdeas
import java.util.concurrent.Executors
import com.sinyee.babybus.worl.databinding.ActivityHyudffdgwesdBinding
import java.util.concurrent.TimeUnit
import android.content.Intent
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.qowijsdo
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.dijs
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.cxij
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.orhanobut.hawk.Hawk

import com.sinyee.babybus.worl.Cduisuhda
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.apsosodk
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.eorkkodsko





class Ersyuuasdw : AppCompatActivity() {
    lateinit var ridjsjifijsd: ActivityHyudffdgwesdBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        ridjsjifijsd = ActivityHyudffdgwesdBinding.inflate(layoutInflater)
        setContentView(ridjsjifijsd.root)

        val xozxicsja: String? = Hawk.get(qowijsdo, "null")

        if (xozxicsja == "1") {
            AppsFlyerLib.getInstance()
                .init("PxBCGUgFqotdNju7aUsGDZ", toridops, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        czpxzoksijad()

    }


    private fun eokskoad() {
        val viccokcokc = Intent(this@Ersyuuasdw, Hqowisuhdws::class.java)
        Hawk.put(apsosodk, null)
        Hawk.put(dijs, null)
        startActivity(viccokcokc)
        finish()
    }



    private val toridops = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(eokdskod: MutableMap<String, Any>?) {
            val cocxkvkoidj = eokdskod?.get("campaign").toString()
            Hawk.put(cxij, cocxkvkoidj)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }



    private fun bvoviuudhssd() {
        val eouosoasodjsa = Intent(this@Ersyuuasdw, Cduisuhda::class.java)
        Hawk.put(apsosodk, null)
        Hawk.put(dijs, null)
        startActivity(eouosoasodjsa)
        finish()
    }





    private fun czpxzoksijad() {

        val wosodiaokdas: String = Hawk.get(apsosodk)
        val xozckz: String = Hawk.get(dijs, "null")

        val kiasosdo: String? = Hawk.get(eorkkodsko, "null") //здесь нужен дефолтный ноль
        val vfufuid: String? = Hawk.get(qowijsdo, "null")
        var qopwos: String? = Hawk.get(cxij)

        if (vfufuid == "1") {
            Log.d("AppsChecker", vfufuid)
            val coxkcj = Executors.newSingleThreadScheduledExecutor()
            coxkcj.scheduleAtFixedRate({
                if (qopwos != null) {

                    if (qopwos!!.contains("tdb2") || wosodiaokdas.contains(xozckz) || kiasosdo!!.contains("tdb2")) {
                        Log.d("Apps Checker", "naming: $qopwos")
                        coxkcj.shutdown()
                        eokskoad()
                    } else {
                        coxkcj.shutdown()
                        bvoviuudhssd()
                    }
                } else {
                    qopwos = Hawk.get(cxij)
                    Log.d("TestInUIHawk", "Received null $qopwos")
                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (wosodiaokdas.contains(xozckz)) {
            eokskoad()
        } else {
            bvoviuudhssd()
        }

    }


}