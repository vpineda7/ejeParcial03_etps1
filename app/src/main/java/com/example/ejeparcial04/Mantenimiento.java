package com.example.ejeparcial04;

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
                Intent buscar = new Intent(getApplicationContext(), mantoBuscar.class);
                startActivity(buscar);
            }
        });

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buscar = new Intent(getApplicationContext(), mantoBuscar.class);
                startActivity(buscar);

            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent principal = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(principal);
            }
        });
        btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buscar = new Intent(getApplicationContext(), mantoBuscar.class);
                startActivity(buscar);

            }
        });

        btnListado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listado = new Intent(getApplicationContext(),mantoListado.class);
                startActivity(listado);
                startActivityForResult(listado, 1);
            }
        });
    }


    public void startActivityForResult(int codigoDeLaActividad, int codigoResultado,Intent datos) {
        if(codigoDeLaActividad==1){
            finish();
        }
    }
}