package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class VerdenaDemotapeActivity extends AppCompatActivity {

    private RecyclerView dataList;
    private List<String> titles;
    private AdapterSong adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verdena_demotape);

        dataList = findViewById(R.id.dataListVerdenaDemotape);
        titles = new ArrayList<>();

        titles.add("Fuxia");
        titles.add("Fiato Adolescenziale");
        titles.add("Nella Schiuma");
        titles.add("Zoe");
        titles.add("Bambina In Nero");
        titles.add("Mormorio mucoso");
        titles.add("Memo Box");
        titles.add("Sara");
        titles.add("Bevimi");
        titles.add("Blu Ninive");
        titles.add("Omnia 2241");

        adapter = new AdapterSong(this,titles);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}