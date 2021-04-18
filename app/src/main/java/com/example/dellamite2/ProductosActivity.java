package com.example.dellamite2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ProductosActivity extends AppCompatActivity {
    private ArrayList<Producto> datos;
    private RecyclerView rvProductos;
    private ProductosAdapter adapter;
    private GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        datos = new ArrayList<Producto>();
        llenarLista();

        rvProductos = findViewById(R.id.rvProductos);
        adapter = new ProductosAdapter(datos);
        gridLayoutManager = new GridLayoutManager(getApplicationContext(),3);

        rvProductos.setAdapter(adapter);
        rvProductos.setLayoutManager(gridLayoutManager);
    }

    private void llenarLista() {

        String[] nombres = getResources().getStringArray(R.array.NombreProducto);

        for (int i=0;i<nombres.length;i++){
            Producto producto = new Producto();
            producto.setName(nombres[i]);

            int thumbId = getResources().getIdentifier("t_producto" + i,"drawable",getPackageName());

            producto.setThumb(thumbId);

            datos.add(producto);

        }
    }
}