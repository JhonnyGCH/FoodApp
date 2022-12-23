package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class Home_Restaurant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()!!.hide();
        setContentView(R.layout.activity_home_restaurant)
        val rest = findViewById<ConstraintLayout>(R.id.constraintLayout2)
        val rest2 = findViewById<ConstraintLayout>(R.id.constraintLayout)
        rest2.setOnClickListener(){
            irBar2()
        }
        rest.setOnClickListener(){
            irBar()
        }
    }
    fun irBar2() {
        val i = Intent(this, infoRestaurante::class.java)
        startActivity(i)
    }
    fun irBar() {
        val i = Intent(this, infoRestaurante::class.java)
        startActivity(i)
    }

}