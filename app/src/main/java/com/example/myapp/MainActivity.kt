package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setting_but.setOnClickListener {
            startActivity(Intent(this, SettingActivity::class.java))
        }
        rate_but.setOnClickListener {

        }
        connect_device.setOnClickListener {
            val dialog = MyDeviceActivity()

            dialog.show(supportFragmentManager, "deviceDialog")
        }
    }
}