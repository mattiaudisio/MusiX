package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SoloUnGrandeSassoActivity extends AppCompatActivity {

    private RecyclerView dataList;
    private List<String> titles;
    private AdapterSong adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo_un_grande_sasso);

        dataList = findViewById(R.id.dataList);
        titles = new ArrayList<>();

        titles.add("La tua fretta");
        titles.add("Spaceman");
        titles.add("Nova");
        titles.add("Cara prudenza");
        titles.add("Onan");
        titles.add("Starless");
        titles.add("Miami Safari");
        titles.add("Nel mio letto");
        titles.add("1000 anni con Elide");
        titles.add("Buona risposta");
        titles.add("Centrifuga");
        titles.add("Meduse e tappeti");

        adapter = new AdapterSong(this,titles);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}