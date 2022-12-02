package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Home_Bares : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()!!.hide();
        setContentView(R.layout.activity_home_bares)
    }
}