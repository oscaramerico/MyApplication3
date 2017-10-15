package com.example.lenovo.perusinanemiav1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroNino extends AppCompatActivity implements View.OnClickListener {

    Button btnregnino;

    void Init(){
        btnregnino = (Button) findViewById(R.id.btnregniño);
        btnregnino.setOnClickListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_nino);
        Init();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,Principalv1.class);
        startActivity(intent);
    }
}
