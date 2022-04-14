package com.example.myapp

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_mydevice.view.*

class MyDeviceActivity : DialogFragment()  {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView : View = inflater.inflate(R.layout.activity_mydevice,container, false)
//        rootView.refresh.setOnClickListener {
//
//        }
        return rootView
    }
}