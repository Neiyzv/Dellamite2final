package com.example.dellamite2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class registroActivity extends AppCompatActivity {

    private ImageButton ibBackR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        ibBackR = findViewById(R.id.ibBackR);

        ibBackR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarMenuR();
            }
        });
    }

    public void regresarMenuR() {
        Intent intentRegresarMenuR = new Intent(registroActivity.this, menuActivity.class);
        startActivity(intentRegresarMenuR);
    }
}