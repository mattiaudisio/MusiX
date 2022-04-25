package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class TestoActivity extends AppCompatActivity {

    TextView testo,titolo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testo);
        Intent intent = getIntent();
        String testoCanzone = intent.getStringExtra("testo");
        String titoloCanzone = intent.getStringExtra("titolo");
        testo = findViewById(R.id.testoCanzone);
        titolo = findViewById(R.id.nomeCanzone);
        titolo.setText(titoloCanzone);
        testo.setText(testoCanzone);
        testo.setMovementMethod(new ScrollingMovementMethod());
    }
}