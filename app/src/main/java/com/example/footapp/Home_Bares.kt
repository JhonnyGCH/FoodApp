package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class Home_Bares : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()!!.hide();
        setContentView(R.layout.activity_home_bares)
        val bar = findViewById<ConstraintLayout>(R.id.constraintLayout2)
        val bar2 = findViewById<ConstraintLayout>(R.id.constraintLayout)
        bar2.setOnClickListener(){
            irBar2()
        }
        bar.setOnClickListener(){
            irBar()
        }
    }
    fun irBar2() {
        val i = Intent(this, infoBaresActivity::class.java)
        startActivity(i)
    }
    fun irBar() {
        val i = Intent(this, infoBaresActivity::class.java)
        startActivity(i)
    }

}