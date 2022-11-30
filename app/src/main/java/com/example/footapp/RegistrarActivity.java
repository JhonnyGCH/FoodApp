package com.example.footapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegistrarActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText correo;
    private EditText contrasena;
    private EditText contrasenaConfirmacion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.activity_registrar);

        mAuth = FirebaseAuth.getInstance();
        correo=findViewById(R.id.correo);
        contrasena=findViewById(R.id.contrasena);
        contrasenaConfirmacion=findViewById(R.id.contrasenaConfirmacion);

    }

    public void onStart(){
        super.onStart();
        //Check if user is signed in (non-null) and update IU accordingly
        FirebaseUser currentUser= mAuth.getCurrentUser();
        //updateUI(currentUser); OJO AQUI
    }

    public void registrarUsuario(View view){
        if(contrasena.getText().toString().equals(contrasenaConfirmacion.getText().toString())){
            mAuth.createUserWithEmailAndPassword(correo.getText().toString(), contrasena.getText().toString())
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Aca vas a mandar los datos del usuario
                                //Log.d(TAG, "createUserWithEmail:success");
                                Toast.makeText(getApplicationContext() , "USUARIO CREADO",Toast.LENGTH_SHORT).show();
                                FirebaseUser user = mAuth.getCurrentUser();
                                //   mDatabase.child(user.getUid()).setValue(nombre);
                                //   mDatabase.child(user.getUid()).setValue(apellido);
                                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(i);
                            } else {
                                // If sign in fails, display a message to the user.
                                // Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                Toast.makeText(getApplicationContext() , "Authentication failed.",Toast.LENGTH_SHORT).show();
                                // updateUI(null);
                            }
                        }
                    });
        }else{
            Toast.makeText(this,"Las contraseñas no cionciden",Toast.LENGTH_SHORT).show();
        }
    }




}

