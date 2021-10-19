package com.example.ejeparcial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mantenimiento extends AppCompatActivity {

    Button btnNuevo, btnBuscar, btnEditar,btnSalir,btnEliminar, btnListado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mantenimiento);
        btnNuevo = findViewById(R.id.btnNuevo);
        btnBuscar = findViewById(R.id.btnBuscar);
        btnEditar = findViewById(R.id.btnEditar);
        btnSalir = findViewById(R.id.btnSalir);
        btnEliminar = findViewById(R.id.btnEliminar);
        btnListado = findViewById(R.id.btnListado);

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent llamarActividad = new Intent(getApplicationContext(),mantoNuevo.class);
                startActivity(llamarActividad);

            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnListado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}