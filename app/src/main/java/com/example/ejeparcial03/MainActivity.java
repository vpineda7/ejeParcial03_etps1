package com.example.ejeparcial03;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    Usuarios usuarios;
    EditText edtCorreo, edtClave;
    ArrayList correos;
    ArrayList claves;
    Button btnIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuarios = new Usuarios();

        correos = usuarios.correos;
        claves = usuarios.claves;

        edtCorreo = findViewById(R.id.edtCorreo);
        edtClave = findViewById(R.id.edtClave);
        btnIngresar = findViewById(R.id.btnIngresar);


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String correo = edtCorreo.getText().toString().toLowerCase().trim();
                String clave = edtClave.getText().toString().trim();

                if (TextUtils.isEmpty(correo)) {
                    edtCorreo.setError("Favor ingresar un correo válido");
                    edtCorreo.requestFocus();
                } else if (TextUtils.isEmpty(clave)) {
                    edtClave.setError("Favor ingresar clave válida");
                    edtClave.requestFocus();
                } else {
                    String user = "";
                    String pwd = "";
                    boolean login = false;
                    int i = 0;

                    for (i = 0; i <correos.size(); i++) {

                        user = correos.get(i).toString().toLowerCase().trim();
                        pwd = claves.get(i).toString().trim();

                        if (user.equals(correo) && pwd.equals(clave)) {
                            login = true;
                            break;
                        }
                    }

                    if (login) {
                        Intent mantenimiento = new Intent(getApplicationContext(), Mantenimiento.class);
                        Toast.makeText(getApplicationContext(), "Ingreso exitoso", Toast.LENGTH_LONG).show();
                        lanzarActividad.launch(mantenimiento);
                    } else {
                        Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrecta", Toast.LENGTH_LONG).show();
                    }

                }
            }
        });


    }
    ActivityResultLauncher<Intent> lanzarActividad = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == RESULT_CANCELED) {
                        edtCorreo.setText("");
                        edtClave.setText("");
                    }
                }
            }
    );

}