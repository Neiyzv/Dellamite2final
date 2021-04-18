package com.example.dellamite2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class listasActivity extends AppCompatActivity {

    private ImageButton ibBackL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas);

        ibBackL = findViewById(R.id.ibBackL);
        ibBackL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresaMenuL();
            }
        });
    }

    private void regresaMenuL() {
        Intent intentRegresaMenuL = new Intent(listasActivity.this, menuActivity.class);
        startActivity(intentRegresaMenuL);
    }
}