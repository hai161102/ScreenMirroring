package com.example.myapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_setting.*

class SettingActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        go_back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        how_to_use.setOnClickListener {
            startActivity(Intent(this,OnboardActivity::class.java))
        }
        remove_ad.setOnClickListener {

        }
        feed_back.setOnClickListener {

        }
        share_f.setOnClickListener {

        }
        rate.setOnClickListener {

        }
        private_key.setOnClickListener {

        }
    }

}