package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WowActivity extends AppCompatActivity {

    private RecyclerView dataList;
    private List<String> titles;
    private AdapterSong adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wow);

        dataList = findViewById(R.id.dataListVerdenaDemotape);
        titles = new ArrayList<>();

        titles.add("Scegli me (Un mondo che tu non vuoi)");
        titles.add("Loniterp ");
        titles.add("Per sbaglio");
        titles.add("Mi coltivo");
        titles.add("Razzi arpia inferno e fiamme");
        titles.add("Adoratorio");
        titles.add("Miglioramento");
        titles.add("Il nulla di O");
        titles.add("Lui gareggia");
        titles.add("Le scarpe volanti");
        titles.add("Castelli per aria");
        titles.add("Sorriso in spiaggia pt. 1");
        titles.add("Sorriso in spiaggia pt. 2");
        titles.add("Attonito");
        titles.add("È solo lunedì");
        titles.add("Tu e me");
        titles.add("Badea blues");
        titles.add("Nuova luce");
        titles.add("Grattacielo");
        titles.add("A capello");
        titles.add("Rossella roll over");
        titles.add("Canzone ostinata");
        titles.add("12,5 mg");
        titles.add("Sul ciglio");
        titles.add("Letto di mosche");
        titles.add("La volta");
        titles.add("Lei disse (Un mondo del tutto differente)");

        adapter = new AdapterSong(this,titles);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}