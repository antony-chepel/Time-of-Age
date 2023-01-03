package com.sinyee.babybus.worl

import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sinyee.babybus.worl.databinding.ActivityXeopdidsjBinding
import kotlin.random.Random

class Xeopdidsj : AppCompatActivity() {
    private var qowkwe = 0
    private var covkkc = 0
    private lateinit var sudhuas : ActivityXeopdidsjBinding
    private var sidjsisdj: ValueAnimator? = null
    private var xicjxzi: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sudhuas = ActivityXeopdidsjBinding.inflate(layoutInflater)
        setContentView(sudhuas.root)
        eokskadko()
        sudhuas.tvRes.text = Uisuhudh.listPowerRes[Random.nextInt(6)]
        sudhuas.bDs.setOnClickListener {
            startActivity(Intent(this,Mkisusywud::class.java))
        }
    }


    private fun eokskadko() {
        xicjxzi = System.currentTimeMillis() + 1000
        sidjsisdj?.setRepeatCount(ValueAnimator.INFINITE)
        sidjsisdj?.addUpdateListener({
            qowkwe++
            if (System.currentTimeMillis() > xicjxzi) {
                covkkc++
                if (covkkc > 1)
                    Log.i("FPS TIME", "Ager:$qowkwe")
                qowkwe = 0
                xicjxzi = System.currentTimeMillis() + 1000
            }
        })
        sidjsisdj?.start()
    }
}