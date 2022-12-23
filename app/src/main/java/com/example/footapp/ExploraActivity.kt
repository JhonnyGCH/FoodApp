package com.example.footapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ExploraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()!!.hide(); // hide the title bar
        setContentView(R.layout.activity_explora)
        val profile = findViewById<ImageView>(R.id.user_img)
        profile.setOnClickListener(){
            irProfile()
        }
    }
    fun irProfile() {
        val i = Intent(this, infoProfileActivity::class.java)
        startActivity(i)
    }
}