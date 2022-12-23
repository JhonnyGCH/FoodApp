package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class infoProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()!!.hide();
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_profile2)
    }
}