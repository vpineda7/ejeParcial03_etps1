package com.example.ejeparcial04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class mantoConfirmacion extends AppCompatActivity {
    Intent datos, mantenimiento;
    TextView tvNombre, tvCorreo, tvClave, tvTipo;
    Button btnConfirmar2, btnCancelar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manto_confirmacion);

        conexion conexion = new conexion(getApplicationContext(), "sistemas", null, 1);
        SQLiteDatabase baseDeDatos = conexion.getWritableDatabase();


        tvNombre = findViewById(R.id.tvNombre);
        tvCorreo = findViewById(R.id.tvCorreo);
        tvClave = findViewById(R.id.tvClave);
        tvTipo = findViewById(R.id.tvTipo);

        btnConfirmar2 = findViewById(R.id.btnConfirmar2);
        btnCancelar =  findViewById(R.id.btnCancelar);


        Bundle confirmacion = getIntent().getExtras();

        String nombres = confirmacion.getString("IntentNombres");
        String correo = confirmacion.getString("IntentCorreo");
        String clave = confirmacion.getString("IntentClave");
        String nivel = confirmacion.getString("IntentNivel");

        tvNombre.setText("Nombre: "+nombres);
        tvCorreo.setText("Correo: "+correo);
        tvClave.setText("Clave: "+clave);
        tvTipo.setText("Tipo: "+nivel);


        btnConfirmar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Usuarios usuario = new Usuarios();
//                int tamano = usuario.correos.size();
//                usuario.correos.add(tamano,nombre);
//                usuario.claves.add(tamano,clave);
//                usuario.nombres.add(tamano,nombre);
//                usuario.niveles.add(tamano,nivel);
                String consultaSql = "";
                consultaSql = "INSERT INTO usuarios(correo, nombres, password, nivel) VALUES('" + correo + "', '" + nombres + "', '" + clave + "', '" + nivel + "')";

                baseDeDatos.execSQL(consultaSql);
                Log.i("MENSAJE", "REGISTRO INSERTADO");
                Toast.makeText(getApplicationContext(),"Registró se creó exitosamente",Toast.LENGTH_SHORT).show();
                Intent mantenimiento = new Intent(getApplicationContext(), Mantenimiento.class);
                startActivity(mantenimiento);


            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }

}