package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CanzoniActivity extends AppCompatActivity {

    TextView testo;
    Button btnAscolta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canzoni);

        testo = findViewById(R.id.TestoCanzone);
        btnAscolta = findViewById(R.id.btnAscolta);
    }

}