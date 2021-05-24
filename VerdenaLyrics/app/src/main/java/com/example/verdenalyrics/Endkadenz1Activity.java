package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Endkadenz1Activity extends AppCompatActivity {

    private RecyclerView dataList;
    private List<String> titles;
    private AdapterSong adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endkadenz1);

        dataList = findViewById(R.id.dataList);
        titles = new ArrayList<>();

        titles.add("Ho una fissa");
        titles.add("Puzzle");
        titles.add("Un pò esageri");
        titles.add("Sci desertico");
        titles.add("Nevischio");
        titles.add("Rilievo");
        titles.add("Diluvio");
        titles.add("Derek");
        titles.add("Vivere di conseguenza");
        titles.add("Alieni fra di noi");
        titles.add("Contro la ragione");
        titles.add("Inno del perdersi");
        titles.add("Funeralus");


        adapter = new AdapterSong(this,titles);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}