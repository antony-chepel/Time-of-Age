package com.sinyee.babybus.worl.bgfdeas
import android.content.pm.PackageManager
import android.net.Uri
import android.annotation.SuppressLint
import android.app.Activity

import java.io.IOException
import android.widget.Toast
import android.util.Log
import android.webkit.*

import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import android.content.Intent




import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore

import com.orhanobut.hawk.Hawk
import com.sinyee.babybus.worl.R
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.eorkkodsko
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.cxij
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.rijdi
import com.sinyee.babybus.worl.bgfdeas.Molxuxzysq.Companion.sosdok
import com.sinyee.babybus.worl.databinding.ActivityGtsdfsdfsBinding


import org.json.JSONException
import org.json.JSONObject

import java.io.File


class Hqowisuhdws : AppCompatActivity() {
    lateinit var fokfdri: ActivityGtsdfsdfsBinding
    private val xjzc = 1
    var xoxzokcsa = ""
    lateinit var eow: WebView
    private var ksoaiijd = false
    var iodosdi: String? = null
    var iososkkkds = ""
    var gofifgig: ValueCallback<Array<Uri>>? = null







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fokfdri = ActivityGtsdfsdfsBinding.inflate(layoutInflater)
        setContentView(fokfdri.root)

        eow = fokfdri.tidsokf
        Snackbar.make(
            fokfdri.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val rooid = CookieManager.getInstance()
        rooid.setAcceptCookie(true)
        rooid.setAcceptThirdPartyCookies(eow, true)
        ogkgfodsko()
        val fokgfo: Activity = this
        eow.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(rpso: WebView, coxkv: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(coxkv)) {
                        return false
                    }
                    if (zoxkzcjisa(coxkv)) {

                        val dofksdidsjf = Intent(Intent.ACTION_VIEW)
                        dofksdidsjf.data = Uri.parse(coxkv)
                        startActivity(dofksdidsjf)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                rpso.loadUrl(coxkv)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)

                eoiroks(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(fokgfo, description, Toast.LENGTH_SHORT).show()
            }


        }
        eow.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                coxkkoxckv: WebView, eosdpald: ValueCallback<Array<Uri>>,
                rokekokodfji: FileChooserParams
            ): Boolean {
                gofifgig?.onReceiveValue(null)
                gofifgig = eosdpald
                var pokckojivxjijixcvo: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (pokckojivxjijixcvo!!.resolveActivity(packageManager) != null) {

                    var foprkodksokf: File? = null
                    try {
                        foprkodksokf = wosk()
                        pokckojivxjijixcvo.putExtra("PhotoPath", iodosdi)
                    } catch (ex: IOException) {

                    }

                    if (foprkodksokf != null) {
                        iodosdi = "file:" + foprkodksokf.absolutePath
                        pokckojivxjijixcvo.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(foprkodksokf)
                        )
                    } else {
                        pokckojivxjijixcvo = null
                    }
                }
                val coicvuhdshu = Intent(Intent.ACTION_GET_CONTENT)
                coicvuhdshu.addCategory(Intent.CATEGORY_OPENABLE)
                coicvuhdshu.type = "image/*"
                val doeksdk: Array<Intent?> =
                    pokckojivxjijixcvo?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val ogkifjdji = Intent(Intent.ACTION_CHOOSER)
                ogkifjdji.putExtra(Intent.EXTRA_INTENT, coicvuhdshu)
                ogkifjdji.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                ogkifjdji.putExtra(Intent.EXTRA_INITIAL_INTENTS, doeksdk)
                startActivityForResult(
                    ogkifjdji, xjzc
                )
                return true
            }

            @Throws(IOException::class)
            private fun wosk(): File {
                var dokeo = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!dokeo.exists()) {
                    dokeo.mkdirs()
                }

                dokeo =
                    File(dokeo.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return dokeo
            }

        }

        eow.loadUrl(rijosdkoa())
    }





    override fun onBackPressed() {


        if (eow.canGoBack()) {
            if (ksoaiijd) {
                eow.stopLoading()
                eow.loadUrl(xoxzokcsa)
            }
            this.ksoaiijd = true
            eow.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                ksoaiijd = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    override fun onActivityResult(coxkvij: Int, qpwok: Int, fokdokdf: Intent?) {
        if (coxkvij != xjzc || gofifgig == null) {
            super.onActivityResult(coxkvij, qpwok, fokdokdf)
            return
        }
        var fokdsofe: Array<Uri>? = null


        if (qpwok == AppCompatActivity.RESULT_OK) {
            if (fokdokdf == null || fokdokdf.data == null) {

                fokdsofe = arrayOf(Uri.parse(iodosdi))
            } else {
                val apxlzs = fokdokdf.dataString
                if (apxlzs != null) {
                    fokdsofe = arrayOf(Uri.parse(apxlzs))
                }
            }
        }
        gofifgig?.onReceiveValue(fokdsofe)
        gofifgig = null
    }




    private fun rijosdkoa(): String {
        val qopkokoskdoadiasjid = Hawk.get(sosdok, "null")
        val xozkc: String? = Hawk.get(rijdi, "null")
        val zapsokd = "sub_id_1="
        val rokd = Build.VERSION.RELEASE
        val dokfdko:String? = Hawk.get(cxij, "null")
        val kcxuvjixc = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        val rikodsoa: String? = Hawk.get(eorkkodsko, "null")
        val xozkckozxiisca = "deeporg"
        val doeksko = "sub_id_5="
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val xozxkc = "naming"
        val wos = "sub_id_6="
        val gpfd = "com.sinyee.babybus.worl"
        val cixjvjixcok = "deviceID="

        val dis = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
        val okfokorrlp = "ad_id="
        val ijjidfijdsfok = "sub_id_4="



        if (dokfdko != "null"){
            iososkkkds = "$qopkokoskdoadiasjid$zapsokd$dokfdko&$cixjvjixcok$kcxuvjixc&$okfokorrlp$xozkc&$ijjidfijdsfok$gpfd&$doeksko$rokd&$wos$xozxkc"
            dskfiejee(kcxuvjixc.toString())
        } else {
            iososkkkds = "$qopkokoskdoadiasjid$zapsokd$rikodsoa&$cixjvjixcok$kcxuvjixc&$okfokorrlp$xozkc&$ijjidfijdsfok$gpfd&$doeksko$rokd&$wos$xozkckozxiisca"
            dskfiejee(kcxuvjixc.toString())
        }

        Log.d("TESTAG", "Test Result $iososkkkds")
        return dis.getString("SAVED_URL", iososkkkds).toString()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun ogkgfodsko() {
        val rokeko = eow.settings
        rokeko.displayZoomControls = false
        rokeko.setSupportZoom(true)
        rokeko.allowFileAccess = true

        rokeko.pluginState = WebSettings.PluginState.ON
        rokeko.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        rokeko.javaScriptEnabled = true
        rokeko.setSupportMultipleWindows(false)
        rokeko.useWideViewPort = true

        rokeko.domStorageEnabled = true
        rokeko.userAgentString = rokeko.userAgentString.replace("; wv", "")
        rokeko.allowContentAccess = true
        rokeko.loadWithOverviewMode = true

        rokeko.builtInZoomControls = true
        rokeko.javaScriptCanOpenWindowsAutomatically = true
        rokeko.setAppCacheEnabled(true)


    }

    private fun zoxkzcjisa(sodk: String): Boolean {

        val roksdfji = packageManager
        try {

            roksdfji.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }
    fun eoiroks(dijfdjis: String?) {
        if (!dijfdjis!!.contains("t.me")) {

            if (xoxzokcsa == "") {
                xoxzokcsa = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    dijfdjis
                ).toString()

                val doksd = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val qow = doksd.edit()
                qow.putString("SAVED_URL", dijfdjis)
                qow.apply()
            }
        }
    }

    private fun dskfiejee(cocvkd: String) {
        OneSignal.setExternalUserId(
            cocvkd,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(reoos: JSONObject) {
                    try {
                        if (reoos.has("push") && reoos.getJSONObject("push").has("success")) {
                            val xizcij = reoos.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $xizcij"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (reoos.has("email") && reoos.getJSONObject("email").has("success")) {
                            val qowijs =
                                reoos.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $qowijs"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (reoos.has("sms") && reoos.getJSONObject("sms").has("success")) {
                            val coxkidf = reoos.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $coxkidf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }
















}