package com.example.duoc.proyecto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MenuAnimal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnPerro= (Button)findViewById(R.id.btnPerros);
        Button btnGatos= (Button)findViewById(R.id.btnGatos);



        btnPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent actPerro= new Intent(MenuAnimal.this,Productos.class);
                startActivity(actPerro);
            }

        } );
        btnGatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent actGatos= new Intent(MenuAnimal.this,ProductosGatos.class);
                startActivity(actGatos);
            }

        } );
    }


}
