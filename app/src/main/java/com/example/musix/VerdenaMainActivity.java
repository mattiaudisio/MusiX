package com.example.musix;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.musix.R;

public class VerdenaMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verdena_main);
        new Handler().postDelayed(() -> {
            startActivity(new Intent(VerdenaMainActivity.this,HomeActivity.class));
            finish();
        },2000);
    }
}