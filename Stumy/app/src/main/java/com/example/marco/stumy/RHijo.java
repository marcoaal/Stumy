package com.example.marco.stumy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RHijo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhijo);

        Button Btnrhijo = (Button)findViewById(R.id.btnrhijo);

        Btnrhijo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickRHijo(v);
            }
        });
    }

    public void OnClickRHijo(View v){
        Intent intent = new Intent(this, BienvenidaRPadre.class);
        startActivity(intent);
    }
}
