package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import android.os.Bundle;
import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewAlbum);
        ArrayList<Album> canzoniArrayList = new ArrayList<>();

        canzoniArrayList.add(new Album("Froll sound (Verbena)","1997", "Demotape",R.drawable.verbena));
        canzoniArrayList.add(new Album("Verdena (Demotape)","1997", "Demotape",R.drawable.verdenademotape));
        canzoniArrayList.add(new Album("Valvonauta EP","1999", "Ep",R.drawable.valvonautaep));
        canzoniArrayList.add(new Album("Verdena","1999", "Album",R.drawable.verdena));
        canzoniArrayList.add(new Album("Viba EP","2000", "Ep",R.drawable.vibaep));
        canzoniArrayList.add(new Album("Solo un grande sasso","2001", "Album",R.drawable.soloungrandesasso));
        canzoniArrayList.add(new Album("Spaceman EP","2001", "Ep",R.drawable.spacemanep));
        canzoniArrayList.add(new Album("Miami Safari EP","2002", "Ep",R.drawable.miamisafariep));
        canzoniArrayList.add(new Album("Afterhours versus Verdena","2002", "Compilation",R.drawable.afterhoursversusverdena));
        canzoniArrayList.add(new Album("Elefante EP","2004", "Ep",R.drawable.elefanteep));
        canzoniArrayList.add(new Album("Il suicidio dei samurai","2004", "Album",R.drawable.ilsuicidiodeisamurai));
        canzoniArrayList.add(new Album("Luna EP","2004", "Ep",R.drawable.lunaep));
        canzoniArrayList.add(new Album("Requiem","2007", "Album",R.drawable.requiem));
        canzoniArrayList.add(new Album("Caños EP","2007", "Ep",R.drawable.canosep));
        canzoniArrayList.add(new Album("Wow","2011", "Album",R.drawable.wow));
        canzoniArrayList.add(new Album("Radar (EjABBABBAjE)","2011", "Compilation",R.drawable.radar));
        canzoniArrayList.add(new Album("Endkadenz Vol.1","2015", "Album",R.drawable.endkadenz1));
        canzoniArrayList.add(new Album("Endkadenz Vol.2","2015", "Album",R.drawable.endkadenz2));
        canzoniArrayList.add(new Album("Verdena (20th Anniversary Remastered Edition)","2019", "Album",R.drawable.verdena20));
        canzoniArrayList.add(new Album("AMERICA LATINA (music inspired by the film) ","2022", "Colonne sonore",R.drawable.americalatina));
        AlbumAdapter adapter = new AlbumAdapter(this,canzoniArrayList);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3, RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}