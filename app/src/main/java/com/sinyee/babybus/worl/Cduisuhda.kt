package com.sinyee.babybus.worl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sinyee.babybus.worl.databinding.ActivityCduisuhdaBinding

class Cduisuhda : AppCompatActivity() {
    private lateinit var bcuxi : ActivityCduisuhdaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bcuxi = ActivityCduisuhdaBinding.inflate(layoutInflater)
        setContentView(bcuxi.root)
        nvyciusd()
    }

    private fun nvyciusd() = with(bcuxi){
       bStartTm.setOnClickListener {
            val nameText = tvNameTmAge.text.toString()

            if(nameText.isEmpty() || nameText.length<3){
                errorTm.visibility = View.VISIBLE
            } else {
                startActivity(
                    Intent(this@Cduisuhda, Mkisusywud::class.java)
                        .putExtra("name",nameText)
                )
                errorTm.visibility = View.GONE

                tvNameTmAge.text.clear()
                tvNameTmAge.clearFocus()

            }

        }
    }
}