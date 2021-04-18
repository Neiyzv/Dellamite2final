package com.example.dellamite2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductosHolder extends RecyclerView.ViewHolder {
    public TextView tvProductoNombre0;
    public ImageView ivThumb0;

    public ProductosHolder(@NonNull View itemView) {
        super(itemView);

        ivThumb0 = itemView.findViewById(R.id.ivThumb0);
        tvProductoNombre0 = itemView.findViewById(R.id.tvProductoNombre0);
    }
}
