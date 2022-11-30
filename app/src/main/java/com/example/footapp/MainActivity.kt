package com.example.footapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        getSupportActionBar()!!.hide(); // hide the title bar

        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance();
        val usuario = findViewById<TextInputEditText>(R.id.usuario)
        val clave = findViewById<TextInputEditText>(R.id.clave)
        val iniciar = findViewById<Button>(R.id.iniciar)
        val registrarse = findViewById<TextView>(R.id.registrar)
        iniciar.setOnClickListener(){
            signIn(usuario.text.toString(), clave.text.toString())
        }
        registrarse.setOnClickListener(){
            irRegistrarse()
        }

    }
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
//            reload();
        }
    }

    fun irRegistrarse() {
        val i = Intent(this, RegistrarActivity::class.java)
        startActivity(i)
    }


    private fun signIn(email:String, password:String){
        val TAG : String = "MainActivity"
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Toast.makeText(baseContext, "Authentication success.",
                        Toast.LENGTH_SHORT).show()
                    Log.d(TAG, "createUserWithEmail:success")
                    val user = auth.currentUser
                    irInicio()
//                    updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
//                    updateUI(null)
                }
            }
    }
    fun irInicio(){
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }



}