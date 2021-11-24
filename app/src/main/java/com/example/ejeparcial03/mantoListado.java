package com.example.ejeparcial03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class mantoListado extends ListActivity {
    Usuarios Usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manto_listado);

        Usuarios=new Usuarios();
        setListAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,Usuarios.correos));

    }
}