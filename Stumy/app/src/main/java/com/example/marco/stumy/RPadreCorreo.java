package com.example.marco.stumy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RPadreCorreo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpadre_correo);

        Button Btnapadrecorreo = (Button) findViewById(R.id.btnapadrecorreo);

        Btnapadrecorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickAceptarCorreo(v);
            }
        });
    }

    public void OnClickAceptarCorreo(View v){
        Intent intent = new Intent(this, RPadreUsuario.class);
        startActivity(intent);
    }
}
