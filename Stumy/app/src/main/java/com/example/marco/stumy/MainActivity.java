package com.example.marco.stumy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Btnrpadre = (Button)findViewById(R.id.btnrpadre);

        Btnrpadre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnclickRegistroP(v);
            }
        });
    }

    public void OnclickRegistroP(View v){
        Intent intent = new Intent(this, RPadreCorreo.class);
        startActivity(intent);
    }
}
