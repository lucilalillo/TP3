package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tp3.Modelo.Pelicula;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private PeliculasAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.rvPeliculas);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        rv.setLayoutManager(gridLayoutManager);
        adapter = new PeliculasAdapter(obtenerPelicula(), this, getLayoutInflater());

        rv.setAdapter(adapter);


    }

    private ArrayList<Pelicula> obtenerPelicula(){
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        peliculas.add(new Pelicula("Rocky I","Rocky es una película estadounidense de 1976 escrita y protagonizada por Sylvester Stallone y dirigida por John G. Avildsen. La historia narra la búsqueda del sueño americano por parte de Rocky Balboa, un italoestadounidense de clase baja que se dedica a cobrar los créditos de un prestamista de Filadelfia", R.drawable.rocky1, "Sylvester Stallone - Thalia Shire", "John G. Avildsen"));
        peliculas.add(new Pelicula("Rocky II", "Rocky II es una película estadounidense de 1979 escrita, dirigida y protagonizada por Sylvester Stallone. Es la secuela de la afamada película Rocky, en la que un desconocido boxeador, Rocky Balboa, tiene la oportunidad de combatir por el título del campeonato del mundo de los pesos pesados.", R.drawable.rocky2, "Sylvester Stallone - Thalia Shire", "Sylvester Stallone"));
        peliculas.add(new Pelicula("Rocky III", "Tras haber defendido el título diez veces, el campeón mundial de boxeo Rocky Balboa (Silvester Stallone) ha decidido retirarse. Sin embargo Clubber Lang (Mr. T), un boxeador muy agresivo que ha ido escalando puestos a base de destrozar a sus rivales, desea arrebatarle el título.", R.drawable.rocky3, "Sylvester Stallone - Thalia Shire", "Sylvester Stallone"));
        peliculas.add(new Pelicula("Rocky IV", " Rocky Balboa, el popular campeón de los pesos pesados, se enfrenta a un nuevo desafío: un ruso llamado Drago. El primer compromiso de Drago en América es con Apollo Creed, amigo de Rocky y antiguo rival. Cuando Apollo muere, Rocky se ve obligado moralmente a enfrentarse con él.", R.drawable.rocky4, "Sylvester Stallone - Thalia Shire", "Sylvester Stallone"));

        return peliculas;

    }




}