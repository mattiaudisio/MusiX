package com.example.verdenalyrics;

import java.io.Serializable;

public class Canzone implements Serializable {
    String titles;
    String testo;

    public Canzone(String titles, String testo) {
        this.titles = titles;
        this.testo = testo;
    }

    public String getTitles() {
        return titles;
    }

    public String getTesto() {
        return testo;
    }

}