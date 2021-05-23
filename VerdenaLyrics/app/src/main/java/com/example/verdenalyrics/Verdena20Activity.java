package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Verdena20Activity extends AppCompatActivity {

    private RecyclerView dataList;
    private List<String> titles;
    private AdapterSong adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verdena20);

        dataList = findViewById(R.id.dataListVerdenaDemotape);
        titles = new ArrayList<>();

        titles.add("Ovunque");
        titles.add("Valvonauta");
        titles.add("Pixel");
        titles.add("L'infinita gioia di Herny Bahus");
        titles.add("Vera");
        titles.add("Dentro Sharon");
        titles.add("Caramelpop");
        titles.add("Viba");
        titles.add("Ultranoia");
        titles.add("Zoe");
        titles.add("Bambina in nero");
        titles.add("Eyeliner");
        titles.add("Bonne Nouvelle");
        titles.add("Ormogenia");
        titles.add("Corpi");
        titles.add("Da Giordi");
        titles.add("Fiato Adolescenziale");
        titles.add("Oggi");
        titles.add("Fuxia (Acoustic Version)");
        titles.add("Ormogenia (Demo)");
        titles.add("Piuma");
        titles.add("Shika (Live)");

        adapter = new AdapterSong(this,titles);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}