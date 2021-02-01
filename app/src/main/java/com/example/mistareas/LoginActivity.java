package com.example.mistareas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
    }

    public void cuenta (View view){
        Toast notificacion = Toast.makeText(this,"Funcionalidad no implementada",Toast.LENGTH_LONG);
        notificacion.show();
    }

    public void login(View view){
        TextInputEditText usuario = (TextInputEditText) findViewById(R.id.cajaUser);
        TextInputEditText pass = (TextInputEditText) findViewById(R.id.cajaPass);

        if (usuario.getText().toString().equals("itt") && pass.getText().toString().equals("123")){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }else{
            Toast notificacion = Toast.makeText(this,"Credenciales Inválidas",Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}