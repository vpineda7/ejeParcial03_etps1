package com.example.ejeparcial04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mantoBuscar extends AppCompatActivity {
    Button btnBuscar, btnCancelar2;
    EditText edtCorreo;
    Bundle datos;
    String accion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manto_buscar);

        btnBuscar = findViewById(R.id.btnBuscar);
        btnCancelar2 = findViewById(R.id.btnCancelar2);
        edtCorreo = findViewById(R.id.edtCorreo);


        btnCancelar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}