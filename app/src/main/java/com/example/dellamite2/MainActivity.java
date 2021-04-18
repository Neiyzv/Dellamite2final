package com.example.dellamite2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton ibMenu, ibBuscar, ibFrutas, ibVerduras, ibPan, ibLacteos, ibCarne, ibPescado, ibSalchichas, ibCongelados, ibDespensa, ibBebidas, ibVinos, ibFarmacia, ibHigiene, ibBelleza, ibLimpieza, ibMascotas, ibJugueteria, ibBebes, ibRopa, ibCalzado, ibHogar, ibElectronica, ibJardineria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibMenu = findViewById(R.id.ibMenu);
        ibMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarMenu();
            }
        });

        ibBuscar = findViewById(R.id.ibBuscar);
        ibFrutas = findViewById(R.id.ibFrutas);
        ibVerduras = findViewById(R.id.ibVerduras);
        ibPan = findViewById(R.id.ibPan);
        ibLacteos = findViewById(R.id.ibLacteos);
        ibCarne = findViewById(R.id.ibCarne);
        ibPescado = findViewById(R.id.ibPescado);
        ibSalchichas = findViewById(R.id.ibSalchichas);
        ibCongelados = findViewById(R.id.ibCongelados);
        ibDespensa = findViewById(R.id.ibDespensa);
        ibBebidas = findViewById(R.id.ibBebidas);
        ibVinos= findViewById(R.id.ibVinos);
        ibFarmacia = findViewById(R.id.ibFarmacia);
        ibHigiene = findViewById(R.id.ibHigiene);
        ibBelleza = findViewById(R.id.ibBelleza);
        ibLimpieza = findViewById(R.id.ibLimpieza);
        ibMascotas = findViewById(R.id.ibMascotas);
        ibJugueteria = findViewById(R.id.ibJugueteria);
        ibBebes = findViewById(R.id.ibBebes);
        ibRopa = findViewById(R.id.ibRopa);
        ibCalzado = findViewById(R.id.ibCalzado);
        ibHogar = findViewById(R.id.ibHogar);
        ibElectronica = findViewById(R.id.ibElectronica);
        ibJardineria = findViewById(R.id.ibJardineria);
    }

    private void llamarMenu() {

        Intent intent = new Intent(MainActivity.this, menuActivity.class);
        startActivity(intent);
    }
}