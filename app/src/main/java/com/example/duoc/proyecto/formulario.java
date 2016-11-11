package com.example.duoc.proyecto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class formulario extends Activity implements View.OnClickListener {
    EditText nombre;
    EditText apellido;
    EditText edad;
    EditText telefono;
    EditText correo;
    EditText user;
    EditText password;

    Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        nombre = (EditText)findViewById(R.id.TxtNombre);
        apellido = (EditText)findViewById(R.id.TxtApellido);
        edad = (EditText)findViewById(R.id.edad);
        telefono = (EditText)findViewById(R.id.TxtTelefono);
        correo = (EditText)findViewById(R.id.TxtCorreo);
        user = (EditText)findViewById(R.id.TxtUser);
        password = (EditText)findViewById(R.id.TxtPassword);
        btnAgregar = (Button)findViewById(R.id.btnAgregar);
        btnAgregar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Personas.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("apellido", apellido.getText().toString());
        intent.putExtra("edad", edad.getText().toString());
        intent.putExtra("telefono", telefono.getText().toString());
        intent.putExtra("correo", correo.getText().toString());
        intent.putExtra("user", user.getText().toString());
        intent.putExtra("password", password.getText().toString());
        startActivity(intent);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_formulario, menu);
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
