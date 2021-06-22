package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MiamiSafariEpActivity extends AppCompatActivity {

    private RecyclerView dataList;
    private List<String> titles;
    private AdapterCanosEp adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miami_safari_ep);

        dataList = findViewById(R.id.dataList);
        titles = new ArrayList<>();

        titles.add("Miami Safari");
        titles.add("Solo un grande sasso Part I");
        titles.add("Solo un grande sasso Part II");
        titles.add("Creepy Smell");
        titles.add("Morbida");

        adapter = new AdapterCanosEp(this,titles);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}