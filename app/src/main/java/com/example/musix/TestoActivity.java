package com.example.musix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.musix.R;

public class TestoActivity extends AppCompatActivity {

    TextView testo,titolo,infoAbout,about;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testo);
        Intent intent = getIntent();
        testo = findViewById(R.id.testoCanzone);
        titolo = findViewById(R.id.nomeCanzone);
        infoAbout = findViewById(R.id.infoAbout);
        relativeLayout = findViewById(R.id.zonaAbout);
        about = findViewById(R.id.About);
        titolo.setText(intent.getStringExtra("titolo"));
        testo.setText(intent.getStringExtra("testo"));
        testo.setMovementMethod(new ScrollingMovementMethod());
        infoAbout.setText(intent.getStringExtra("about"));
        if (infoAbout.getText().equals("")){
            relativeLayout.setVisibility(View.GONE);
            about.setVisibility(View.GONE);
            infoAbout.setVisibility(View.GONE);
        }
    }
}