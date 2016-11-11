package com.example.duoc.proyecto;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class Personas extends Activity {
    TextView tvView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personas);
        tvView = (TextView)findViewById(R.id.tvView);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String apellido = intent.getStringExtra("apellido");
        String edad = intent.getStringExtra("edad");
        String telefono = intent.getStringExtra("telefono");
        String correo = intent.getStringExtra("correo");
        String user = intent.getStringExtra("user");
        String password = intent.getStringExtra("password");
        tvView.setText("Tu nombre es: " + nombre + " " + apellido+ " " + edad + " " + telefono+ " "+correo + " " + user+" "+password);

        guardarDatos(nombre,apellido,edad,telefono,correo,user,password);

    }

    private void guardarDatos(String nombre, String apellido, String edad, String telefono, String correo, String user, String password)  {
        PersonaDTO personaDTO = new PersonaDTO(this);
        SQLiteDatabase db = personaDTO.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put("PERSONA_NOMBRE",nombre);
        cv.put("PERSONA_APELLIDO",apellido);
        cv.put("PERSONA_EDAD",edad);
        cv.put("PERSONA_TELEFONO",telefono);
        cv.put("PERSONA_CORREO",correo);
        cv.put("PERSONA_USER",user);
        cv.put("PERSONA_PASSWORD",password);
        db.insert("persona", null, cv);

        Toast.makeText(this,"Persona Guardada",Toast.LENGTH_LONG).show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_personas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
