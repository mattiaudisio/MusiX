package com.example.verdenalyrics.classi;

import java.io.Serializable;

public class Canzone implements Serializable {
    String titles;
    String testo;
    String about;

    public Canzone(String titles, String testo, String about) {
        this.titles = titles;
        this.testo = testo;
        this.about = about;
    }

    public String getTitles() {
        return titles;
    }

    public String getTesto() {
        return testo;
    }

    public String getAbout() {
        return about;
    }
}