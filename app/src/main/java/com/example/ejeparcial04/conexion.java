package com.example.ejeparcial04;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class conexion  extends SQLiteOpenHelper {

    public conexion(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.i("MENSAJE", "SE CREO LA BASE DE DATO SISTEMAS");
        String consultaSql = "";
        consultaSql = "CREATE TABLE usuarios(correo TEXT(200), nombres TEXT(200), password TEXT(100), nivel INTEGER)";
        sqLiteDatabase.execSQL(consultaSql);
        Log.i("MENSAJE", "SE CREO LA TABLA USUARIOS");

        consultaSql = "INSERT INTO usuarios(correo,password) VALUES ('2501882002@mail.utec.edu.sv', 'password')";
        sqLiteDatabase.execSQL(consultaSql);
        Log.i("MENSAJE", "SE INSERTO REGISTRO ADMIN");
    }

    public Boolean checkusernamepassword(String correo, String password){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("SELECT * FROM usuarios WHERE correo = ? and password = ?", new String[] {correo,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
