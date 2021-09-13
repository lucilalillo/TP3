package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView titulo, descripcion, actores, director;
    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        inicializarVista();

        titulo.setText(getIntent().getExtras().getString("titulo"));
        descripcion.setText(getIntent().getExtras().getString("descripcion"));
        imagen.setImageResource(getIntent().getExtras().getInt("foto"));
        actores.setText(getIntent().getExtras().getString("actores"));
        director.setText(getIntent().getExtras().getString("director"));

    }

    public void inicializarVista(){
        titulo = findViewById(R.id.tvTit);
        descripcion = findViewById(R.id.tvDes);
        imagen = findViewById(R.id.foto);
        actores = findViewById(R.id.tvActores);
        director = findViewById(R.id.tvDirector);

    }

}