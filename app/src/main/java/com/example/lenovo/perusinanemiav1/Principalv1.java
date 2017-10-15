package com.example.lenovo.perusinanemiav1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principalv1 extends AppCompatActivity implements View.OnClickListener {

    Button btnDieta;
    Button btnControl;
    Button btnAyuda;

    void Init(){
        btnDieta = (Button) findViewById(R.id.btnDieta);


        btnDieta.setOnClickListener(this);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principalv1);

       Init();
    }

    @Override
    public void onClick(View view) {

            Intent intent = new Intent(this,TabExampleMainActivity.class);
            startActivity(intent);
    }
}
