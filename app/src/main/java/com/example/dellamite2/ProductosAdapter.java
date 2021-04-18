package com.example.dellamite2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductosAdapter extends RecyclerView.Adapter<ProductosHolder>{
    private ArrayList<Producto> data;

    public ProductosAdapter(ArrayList data){
        this.data = data;
    }

    @NonNull
    @Override
    public ProductosHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.productos_orden,parent, false);
        return new ProductosHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductosHolder holder, int position) {
        holder.tvProductoNombre0.setText(data.get(position).getName());
        holder.ivThumb0.setImageResource(data.get(position).getThumb());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
