package com.example.duoc.proyecto;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button siguiente;
    Button formulario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        siguiente=(Button)findViewById(R.id.btnSiguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente= new Intent(MainActivity.this,MenuAnimal.class);
                startActivity(siguiente);
            }

        } );

        formulario=(Button)findViewById(R.id.btnFormulario);

        formulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formulario = new Intent(MainActivity.this, formulario.class);
                startActivity(formulario);
            }

        });
    }

}
