package com.example.footapp.itemsCarta;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.footapp.R;

import java.util.ArrayList;

import com.squareup.picasso.Picasso;

public class CartaAdapter extends RecyclerView.Adapter<CartaAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<ItemCartaModel> items;

    public CartaAdapter(Context ctx, ArrayList<ItemCartaModel> items){
        inflater = LayoutInflater.from(ctx);
        this.items = items;
    }

    @Override
    public CartaAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.activity_carta, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(CartaAdapter.MyViewHolder holder, int position) {

        holder.nombre.setText(items.get(position).getNombre());
        holder.descripcion.setText(items.get(position).getDescripcion());
        holder.precio.setText(String.valueOf(items.get(position).getPrecio()));
        Picasso.get().load(items.get(position).getImagen()).into(holder.imagen);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nombre, descripcion, precio;
        ImageView imagen;

        public MyViewHolder(View itemView) {
            super(itemView);

            nombre = (TextView) itemView.findViewById(R.id.carta_nombre);
            descripcion = (TextView) itemView.findViewById(R.id.carta_descripcion);
            precio = (TextView) itemView.findViewById(R.id.carta_precio);
            imagen = (ImageView) itemView.findViewById(R.id.carta_imagen);
        }
    }
}
