package com.example.tp3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tp3.Modelo.Pelicula;

import java.util.ArrayList;

public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.ViewHolder> {
    private ArrayList<Pelicula> peliculas;
    private Context context;
    private LayoutInflater layoutInflater;

    public PeliculasAdapter(ArrayList<Pelicula> peliculas, Context context, LayoutInflater layoutInflater) {
        this.peliculas = peliculas;
        this.context = context;
        this.layoutInflater = layoutInflater;
    }


    @NonNull
    @Override
    public PeliculasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_pelicula, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvTitulo.setText(peliculas.get(position).getTitulo());
        holder.tvDesc.setText(peliculas.get(position).getDescripcion());
        holder.imagen.setImageResource(peliculas.get(position).getFoto());
        holder.boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, Activity2.class);
                i.putExtra("titulo", peliculas.get(position).getTitulo());
                i.putExtra("descripcion", peliculas.get(position).getDescripcion());
                i.putExtra("foto", peliculas.get(position).getFoto());
                i.putExtra("actores", peliculas.get(position).getActor());
                i.putExtra("director", peliculas.get(position).getDirector());

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return peliculas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitulo, tvDesc, actores, director;
        private ImageView imagen;
        private Button boton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitulo = (TextView) itemView.findViewById(R.id.tvTitulo);
            tvDesc = (TextView) itemView.findViewById(R.id.tvDesc);
            imagen = itemView.findViewById(R.id.imagen);
            actores = itemView.findViewById(R.id.tvActores);
            director = itemView.findViewById(R.id.tvDirector);
            boton = itemView.findViewById(R.id.btDetalle);
        }
    }
}
