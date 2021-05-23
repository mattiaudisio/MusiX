package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class CanzoniActivity extends AppCompatActivity {

    Button btnAscolta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canzoni);

        btnAscolta = findViewById(R.id.btnAscolta);
    }
}