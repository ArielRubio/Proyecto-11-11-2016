package com.example.duoc.proyecto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Duoc on 28-10-2016.
 */
public class PersonaDTO extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME= "petfood.db";

    public static final String PERSONA_TABLE="persona";
    public static final String PERSONA_ID="id_persona";
    public static final String PERSONA_NOMBRE="nombre";
    public static final String PERSONA_APELLIDO="apellido";
    public static final String PERSONA_EDAD="edad";
    public static final String PERSONA_TELEFONO="telefono";
    public static final String PERSONA_CORREO="correo";
    public static final String PERSONA_USER="user";
    public static final String PERSONA_PASSWORD="password";

    public PersonaDTO(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql="CREATE TABLE persona (\n"+
                "\t id_persona INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT \n"+
                "\t, nombre TEXT NOT NULL\n"+
                "\t, apellido TEXT NOT NULL\n"+
                "\t, edad TEXT NOT NULL\n"+
                "\t, telefono TEXT NOT NULL\n"+
                "\t, correo TEXT NOT NULL\n"+
                "\t, user TEXT NOT NULL\n"+
                "\t, password TEXT NOT NULL\n" +
                ");";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //este todavia no
    }
}
