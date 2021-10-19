package com.example.ejeparcial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mantoConfirmacion extends AppCompatActivity {
    Button btnConfirmar;
    Intent datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manto_confirmacion);

        btnConfirmar = findViewById(R.id.btnConfirmar2);


        Bundle datos = getIntent().getExtras();
        String accion = datos.getString("accion");


        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}