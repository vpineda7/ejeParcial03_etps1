package com.example.ejeparcial04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class mantoNuevo extends AppCompatActivity {
    EditText edtNombre, edtCorreo, edtClave, edtConfirmarClave;
    RadioButton rbUsuario, rbAsistente, rbAdministrador;
    Button  btnGuardar, btnCancelar3;
    int nivel;
    String tipoNivel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manto_nuevo);



        edtNombre = findViewById(R.id.edtNombre);
        edtCorreo = findViewById(R.id.edtCorreo);
        edtClave = findViewById(R.id.edtClave);
        edtConfirmarClave = findViewById(R.id.edtConfirmarClave);

        rbUsuario = findViewById(R.id.rbUsuario);
        rbAsistente = findViewById(R.id.rbAsistente);
        rbAdministrador = findViewById(R.id.rbAdministrador);

        btnGuardar =  findViewById(R.id.btnGuardar);
        btnCancelar3 =  findViewById(R.id.btnCancelar3);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombres = edtNombre.getText().toString().trim();
                String correo = edtCorreo.getText().toString().trim();
                String clave = edtClave.getText().toString().trim();
                String confirmarClave= edtConfirmarClave.getText().toString().trim();

                if(TextUtils.isEmpty(nombres)){
                    edtNombre.setError("Ingresar nombres correcto");
                    edtNombre.requestFocus();
                }else if(TextUtils.isEmpty(correo)){
                    edtCorreo.setError("Favor ingresar correo válido");
                    edtCorreo.requestFocus();
                }else if(TextUtils.isEmpty(clave)){
                    edtClave.setError("Ingresar clave");
                    edtClave.requestFocus();
                }else if(TextUtils.isEmpty(confirmarClave)){
                    edtConfirmarClave.setError("Confirmar clave que coincida");
                    edtConfirmarClave.requestFocus();
                }else if(!confirmarClave.equals(clave)){
                    edtConfirmarClave.setError("Claves ingresadas no coinciden");
                    edtConfirmarClave.requestFocus();

                }else if(rbAsistente.isChecked() || rbUsuario.isChecked() || rbAdministrador.isChecked()){
                    if(rbUsuario.isChecked()){
                        nivel = 1;
                        tipoNivel = "Usuario";
                    }else if(rbAsistente.isChecked()){
                        nivel = 2;
                        tipoNivel = "Asistente";
                    }else{
                        nivel = 3;
                        tipoNivel = "Administrador";
                    }
                }

                Log.i("MENSAJE",String.valueOf(nivel));

                Intent confirmacion = new Intent(getApplicationContext(),mantoConfirmacion.class);
                confirmacion.putExtra("IntentNombres",nombres);
                confirmacion.putExtra("IntentCorreo",correo);
                confirmacion.putExtra("IntentClave",clave);
                confirmacion.putExtra("IntentNivel",String.valueOf(nivel));
                Toast.makeText(getApplicationContext(), "Es necesario realizar una confirmación", Toast.LENGTH_SHORT).show();
                startActivity(confirmacion);


            }
        });

        btnCancelar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}