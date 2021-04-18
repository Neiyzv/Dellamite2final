package com.example.dellamite2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sesionActivity extends AppCompatActivity {

    private ImageButton ibBackS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion);

        ibBackS = findViewById(R.id.ibBackS);
        ibBackS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarMenuS();
            }
        });
    }

    private void regresarMenuS() {
        Intent intentRegresarMenuS = new Intent(sesionActivity.this, menuActivity.class);
        startActivity(intentRegresarMenuS);
    }
}