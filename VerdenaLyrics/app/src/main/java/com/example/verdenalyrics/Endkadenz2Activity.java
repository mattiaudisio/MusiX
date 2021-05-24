package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Endkadenz2Activity extends AppCompatActivity {

    private RecyclerView dataList;
    private List<String> titles;
    private AdapterSong adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endkadenz2);

        dataList = findViewById(R.id.dataList);
        titles = new ArrayList<>();

        titles.add("Cannibale");
        titles.add("Dymo");
        titles.add("Colle immane");
        titles.add("Un blu sincero");
        titles.add("Identikit");
        titles.add("Fuoco amico I");
        titles.add("Fuoco amico II (pela i miei tratti)");
        titles.add("Nera visione");
        titles.add("Troppe scuse");
        titles.add("Natale con Ozzy");
        titles.add("Lady Hollywood");
        titles.add("Caleido");
        titles.add("Waltz del Bounty");

        adapter = new AdapterSong(this,titles);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}