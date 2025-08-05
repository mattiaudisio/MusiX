package com.example.musix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.example.musix.adapter.CanzoniAdapter;
import com.example.musix.classi.Canzone;

import java.util.ArrayList;

import com.example.musix.R;

public class CanzoniActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canzoni);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewCanzoni);
        ArrayList<Canzone> arrayList = (ArrayList<Canzone>) getIntent().getSerializableExtra("arrayCanzoni");

        CanzoniAdapter adapter = new CanzoniAdapter(this,arrayList);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1, RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}