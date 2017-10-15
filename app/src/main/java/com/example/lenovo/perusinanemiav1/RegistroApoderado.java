package com.example.lenovo.perusinanemiav1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroApoderado extends AppCompatActivity implements View.OnClickListener {

    Button btnRegistrarApod;

    void Init()
    {
        btnRegistrarApod = (Button) findViewById(R.id.btnRegistrarApod);
        btnRegistrarApod.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_apoderado);
        Init();
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this,RegistroNino.class);
        startActivity(intent);
    }
}
