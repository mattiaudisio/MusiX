package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import static com.example.verdenalyrics.R.layout.activity_home;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView dataList;
    private List<String> titles;
    private List<String> dates;
    private List<Integer> images;
    private AdapterHome adapter;
    //private AdapterSong adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_home);
        dataList = findViewById(R.id.dataList);

        titles = new ArrayList<>();
        images = new ArrayList<>();
        dates = new ArrayList<>();

        titles.add("Verdena (Demotape)");
        titles.add("Valvonauta EP");
        titles.add("Verdena");
        titles.add("Viba EP");
        titles.add("Solo un grande sasso");
        titles.add("Spaceman EP");
        titles.add("Miami Safari EP");
        titles.add("Elefante EP");
        titles.add("Il Suicidio dei samurai");
        titles.add("Luna EP");
        titles.add("Requiem");
        titles.add("Caños EP");
        titles.add("Wow");
        titles.add("Radar (EjABBABBAjE)");
        titles.add("Endkadenz Vol.1");
        titles.add("Endkadenz Vol.2");
        titles.add("Verdena (20th Anniversary Remastered Edition)");


        images.add(R.drawable.verdenademotape);
        images.add(R.drawable.valvonautaep);
        images.add(R.drawable.verdena);
        images.add(R.drawable.vibaep);
        images.add(R.drawable.soloungrandesasso);
        images.add(R.drawable.spacemanep);
        images.add(R.drawable.miamisafariep);
        images.add(R.drawable.elefanteep);
        images.add(R.drawable.ilsuicidiodeisamurai);
        images.add(R.drawable.lunaep);
        images.add(R.drawable.requiem);
        images.add(R.drawable.canosep);
        images.add(R.drawable.wow);
        images.add(R.drawable.radar);
        images.add(R.drawable.endkadenz1);
        images.add(R.drawable.endkadenz2);
        images.add(R.drawable.verdena20);

        dates.add("1997");
        dates.add("1999");
        dates.add("1999");
        dates.add("2000");
        dates.add("2001");
        dates.add("2001");
        dates.add("2002");
        dates.add("2004");
        dates.add("2004");
        dates.add("2004");
        dates.add("2007");
        dates.add("2007");
        dates.add("2011");
        dates.add("2011");
        dates.add("2015");
        dates.add("2015");
        dates.add("2019");

        adapter = new AdapterHome(this,titles,images,dates);
        //adapter = new AdapterSong(this,titles);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}