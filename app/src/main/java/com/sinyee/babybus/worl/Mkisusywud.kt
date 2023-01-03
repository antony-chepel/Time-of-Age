package com.sinyee.babybus.worl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sinyee.babybus.worl.databinding.ActivityMkisusywudBinding
import kotlin.random.Random

class Mkisusywud : AppCompatActivity() {
    private lateinit var cyxudi : ActivityMkisusywudBinding
    private var diofjifsd = false
    private var civxj = false
    private var qowio = false
    private var gohiokhffij = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cyxudi = ActivityMkisusywudBinding.inflate(layoutInflater)
        setContentView(cyxudi.root)
        val getname = intent.getStringExtra("name")
        cyxudi.tvName.text = "Hello, $getname!"
        cyxudi.firifd.setImageResource(Uisuhudh.listImg[Random.nextInt(6)])
        cyxudi.coxkvjixc.setImageResource(Uisuhudh.listImg[Random.nextInt(6)])
        cyxudi.wpodkfko.setImageResource(Uisuhudh.listImg[Random.nextInt(6)])
        cyxudi.vobjiv.setImageResource(Uisuhudh.listImg[Random.nextInt(6)])
        jucyids()
    }


    private fun jucyids() = with(cyxudi){
        if(diofjifsd == false){
            firifd.setOnClickListener {
              diofjifsd = true
                firifd.alpha = 0.6f
                tvDoubles.text = Uisuhudh.listPower[Random.nextInt(7)]
                if(diofjifsd == true && civxj == true && qowio == true && gohiokhffij == true){
                    startActivity(Intent(this@Mkisusywud,Xeopdidsj::class.java))
                }
            }
        }

        if(civxj == false){
            coxkvjixc.setOnClickListener {
                civxj = true
                coxkvjixc.alpha = 0.6f
                tvDoubles.text = Uisuhudh.listPower[Random.nextInt(7)]
                if(diofjifsd == true && civxj == true && qowio == true && gohiokhffij == true){
                    startActivity(Intent(this@Mkisusywud,Xeopdidsj::class.java))
                }
            }
        }

        if(qowio == false){
            wpodkfko.setOnClickListener {
                qowio = true
                wpodkfko.alpha = 0.6f
                tvDoubles.text = Uisuhudh.listPower[Random.nextInt(7)]
                if(diofjifsd == true && civxj == true && qowio == true && gohiokhffij == true){
                    startActivity(Intent(this@Mkisusywud,Xeopdidsj::class.java))
                }
            }
        }

        if(gohiokhffij == false){
            vobjiv.setOnClickListener {
                gohiokhffij = true
                vobjiv.alpha = 0.6f
                tvDoubles.text = Uisuhudh.listPower[Random.nextInt(7)]
                if(diofjifsd == true && civxj == true && qowio == true && gohiokhffij == true){
                    startActivity(Intent(this@Mkisusywud,Xeopdidsj::class.java))
                }
            }
        }

    }
}