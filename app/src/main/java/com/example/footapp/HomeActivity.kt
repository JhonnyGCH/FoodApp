package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()!!.hide(); // hide the title bar

        setContentView(R.layout.activity_home)
        val bar = findViewById<CardView>(R.id.cardBar)
        val explo =findViewById<Button>(R.id.explorar)
        val rest = findViewById<CardView>(R.id.cardRest)
        val profile = findViewById<ImageView>(R.id.user_img)
        bar.setOnClickListener(){
            irBar()
        }
        explo.setOnClickListener(){
            irExplora()
        }
        rest.setOnClickListener(){
            irRest()
        }
        profile.setOnClickListener(){
            irProfile()
        }

    }
    fun irBar() {
       val i = Intent(this, Home_Bares::class.java)
       startActivity(i)
    }

    fun irProfile() {
        val i = Intent(this, infoProfileActivity::class.java)
        startActivity(i)
    }
    fun irExplora() {
        val i = Intent(this, ExploraActivity::class.java)
        startActivity(i)
    }
    fun irRest() {
        val i = Intent(this, Home_Restaurant::class.java)
        startActivity(i)
    }
}