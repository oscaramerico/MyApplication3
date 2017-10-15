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
        btnControl = (Button) findViewById(R.id.btnControl);
        btnControl = (Button) findViewById(R.id.btnAyuda);

        btnDieta.setOnClickListener(this);
        btnControl.setOnClickListener(this);
        btnAyuda.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principalv1);

        btnDieta = (Button) findViewById(R.id.btnDieta);
        btnControl = (Button) findViewById(R.id.btnControl);
        btnControl = (Button) findViewById(R.id.btnAyuda);


        //Init();
    }

    @Override
    public void onClick(View view) {

        if(view==btnDieta){
            Intent intent = new Intent(this,Dietas.class);
            startActivity(intent);
        }
        if(view==btnControl){
            Intent intent = new Intent(this,ControlActivity.class);
            startActivity(intent);
        }
        if(view==btnAyuda){
            Intent intent = new Intent(this,AyudaActivity.class);
            startActivity(intent);
        }
    }
}
