package com.example.marco.stumy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RPadreUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpadre_usuario);

        Button Btnapadreusuario = (Button)findViewById(R.id.btnapadreusuario);

        Btnapadreusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickAceptarUsuario(v);
            }
        });
    }

    public void OnClickAceptarUsuario(View v){
        Intent intent = new Intent(this, RHijo.class);
        startActivity(intent);
    }

}
