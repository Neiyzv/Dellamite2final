package com.example.dellamite2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class menuActivity extends AppCompatActivity {
    private Button btnRegistro;
    private ImageButton ibBackM, ibInicioSesion, ibListas, ibCarrito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ibBackM = findViewById(R.id.ibBackM);
        ibBackM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarPrincipal();
            }
        });

        ibInicioSesion = findViewById(R.id.ibInicioSesion);
        ibInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamaInicioSesion();
            }
        });

        ibListas = findViewById(R.id.ibListas);
        ibListas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamaListas();
            }
        });

        ibCarrito = findViewById(R.id.ibCarrito);
        ibCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamaCarrito();
            }
        });

        btnRegistro = findViewById(R.id.btnRegistro);
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamaRegistro();
            }
        });
    }

    private void llamaCarrito() {
        Intent intentCarrito = new Intent(menuActivity.this, carritoActivity.class);
        startActivity(intentCarrito);
    }

    private void llamaListas() {
        Intent intentListas = new Intent(menuActivity.this, listasActivity.class);
        startActivity(intentListas);
    }

    private void llamaInicioSesion() {
        Intent intentInicioSesion = new Intent(menuActivity.this, sesionActivity.class);
        startActivity(intentInicioSesion);
    }

    private void regresarPrincipal() {
        Intent intentRegresarPrincipal = new Intent(menuActivity.this, MainActivity.class);
        startActivity(intentRegresarPrincipal);
    }

    private void llamaRegistro() {
        Intent intentRegistro = new Intent(menuActivity.this, registroActivity.class);
        startActivity(intentRegistro);
    }
}