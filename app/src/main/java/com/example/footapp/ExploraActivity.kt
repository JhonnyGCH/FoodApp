package com.example.footapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ExploraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()!!.hide(); // hide the title bar
        setContentView(R.layout.activity_explora)
    }
}