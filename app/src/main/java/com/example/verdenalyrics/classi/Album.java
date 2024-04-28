package com.example.verdenalyrics.classi;

public class Album {
    private final String Album;
    private final String Data;
    private final String Tipo;
    private final Integer albumPhoto;

    public Album(String album, String data, String tipo,Integer albumPhoto) {
        Album = album;
        Data = data;
        Tipo = tipo;
        this.albumPhoto = albumPhoto;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getAlbum() {
        return Album;
    }

    public String getData() {
        return Data;
    }

    public Integer getAlbumPhoto() {
        return albumPhoto;
    }

}