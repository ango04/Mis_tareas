package com.example.mistareas.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ControladorDB extends SQLiteOpenHelper {
    public ControladorDB(@Nullable Context context) {
        super(context, "com.example.mistareas.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE TAREAS (ID INTEGER PRIMARY KEY AUTOINCREMENT, NOMBRE TEXT NOT NULL);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addTarea(String tarea){

        ContentValues registro = new ContentValues();
        registro.put("NOMBRE", tarea);

        SQLiteDatabase db = this.getWritableDatabase(); //este metodo va a devolver una referencia a la BD
        db.insert("TAREAS",null, registro);
        //db.execSQL("INSERT INTO TAREAS VALUES (null, ' + tarea + ');");
        db.close();
    }
}
