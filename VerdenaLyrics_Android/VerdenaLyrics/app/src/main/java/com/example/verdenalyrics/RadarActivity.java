package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RadarActivity extends AppCompatActivity {

    private RecyclerView dataList;
    private List<String> titles;
    private AdapterCanosEp adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar);

        dataList = findViewById(R.id.dataList);
        titles = new ArrayList<>();

        titles.add("Rossella Roll Over (Live)");
        titles.add("Le Scarpe Volanti (Live)");
        titles.add("È solo lunedì (Live)");
        titles.add("Segale Cornuta");
        titles.add("Inutilniente");
        titles.add("Baby I Love You (Unreleased)");
        titles.add("Optical (Demo)");
        titles.add("A capello (Demo)");


        adapter = new AdapterCanosEp(this,titles);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}