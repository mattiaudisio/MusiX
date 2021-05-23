package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IlSuicidioDelSamuraiActivity extends AppCompatActivity {

    private RecyclerView dataList;
    private List<String> titles;
    private AdapterSong adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_il_suicidio_del_samurai);

        dataList = findViewById(R.id.dataListVerdenaDemotape);
        titles = new ArrayList<>();

        titles.add("Logorrea (esperti all'opera)");
        titles.add("Luna");
        titles.add("Mina");
        titles.add("Balanite");
        titles.add("Phantastica");
        titles.add("Elefante");
        titles.add("Glamodrama");
        titles.add("Far fisa");
        titles.add("17 tir nel cortile");
        titles.add("40 secondi di niente");
        titles.add("Il suicidio del samurai");

        adapter = new AdapterSong(this,titles);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}