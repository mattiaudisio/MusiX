package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ElefanteEpActivity extends AppCompatActivity {

    private RecyclerView dataList;
    private List<String> titles;
    private AdapterCanosEp adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elefante_ep);

        dataList = findViewById(R.id.dataList);
        titles = new ArrayList<>();

        titles.add("Elefante");
        titles.add("Perfect Day");
        titles.add("Mu");
        titles.add("Corteccia (nell’up-nea)");
        titles.add("Passi da gigante");

        adapter = new AdapterCanosEp(this,titles);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}