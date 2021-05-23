package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RequiemActivity extends AppCompatActivity {

    private RecyclerView dataList;
    private List<String> titles;
    private AdapterSong adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requiem);

        dataList = findViewById(R.id.dataListVerdenaDemotape);
        titles = new ArrayList<>();

        titles.add("Marti in the sky");
        titles.add("Don Calisto");
        titles.add("Non prendere l'acme, Eugenio");
        titles.add("Angie");
        titles.add("Aha");
        titles.add("Isacco Nucleare");
        titles.add("Caños");
        titles.add("Il Gulliver");
        titles.add("Faro ");
        titles.add("Muori Delay");
        titles.add("Trovami un modo semplice per uscirne");
        titles.add("Opanopono ");
        titles.add("Il caos strisciante");
        titles.add("Was?");
        titles.add("Sotto prescrizione del dott. Huxley");

        adapter = new AdapterSong(this,titles);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}