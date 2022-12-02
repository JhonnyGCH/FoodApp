package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()!!.hide(); // hide the title bar

        setContentView(R.layout.activity_home)
        val bar = findViewById<CardView>(R.id.cardBar)
        val rest = findViewById<CardView>(R.id.cardRest)
        bar.setOnClickListener(){
            irBar()
        }
        rest.setOnClickListener(){
            irRest()
        }

    }
    fun irBar() {
       val i = Intent(this, Home_Bares::class.java)
       startActivity(i)
    }
    fun irRest() {
        val i = Intent(this, Home_Restaurant::class.java)
        startActivity(i)
    }
}