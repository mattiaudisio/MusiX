package com.example.musix.adapter;

import com.example.musix.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.musix.CanzoniActivity;
import com.example.musix.classi.Album;
import com.example.musix.classi.Canzone;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.MyViewHolder>{

    public ArrayList<Album> arrayCanzoni;
    Context mContext;
    LayoutInflater inflater;

    JSONArray jsonArray;

    public AlbumAdapter(Context mContext, ArrayList<Album> arrayCanzoni, JSONArray jsonArray) {
        this.arrayCanzoni = arrayCanzoni;
        this.mContext = mContext;
        this.inflater = LayoutInflater.from(mContext);
        this.jsonArray = jsonArray;
    }

    @NonNull
    @Override
    public AlbumAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.element_album,parent,false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull AlbumAdapter.MyViewHolder holder, int position) {
        holder.nomeAlbum.setText(arrayCanzoni.get(position).getAlbum());
        holder.tipoAlbum.setText(arrayCanzoni.get(position).getTipo() + "\n" + arrayCanzoni.get(position).getData());
        holder.imgAlbum.setImageResource(arrayCanzoni.get(position).getAlbumPhoto());
    }

    @Override
    public int getItemCount() {
        return arrayCanzoni.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView nomeAlbum,tipoAlbum;
        ImageView imgAlbum;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAlbum = itemView.findViewById(R.id.imgAlbum);
            nomeAlbum = itemView.findViewById(R.id.albumNome);
            nomeAlbum.setSelected(true);
            tipoAlbum = itemView.findViewById(R.id.tipoAlbumAnno);
            ArrayList<Canzone> arrayCanzoni = new ArrayList<>();
            itemView.setOnClickListener(v -> {
                arrayCanzoni.clear();
                switch (getAdapterPosition()){
                    case 0:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 0){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 1:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 1){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 2:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 2){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 3:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 3){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 4:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 4){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 5:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 5){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 6:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 6){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 7:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 7){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 8:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 8){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 9:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 9){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 10:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 10){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 11:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 11){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 12:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 12){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 13:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 13){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 14:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 14){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 15:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 15){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 16:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 16){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 17:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 17 ){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 18:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 18){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 19:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 19){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                    case 20:
                        try {
                            // fetch each json object
                            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                JSONArray songs = jsonObject.getJSONArray("canzoni");
                                for (int j = 0; j < songs.length(); j++){
                                    JSONObject object = songs.getJSONObject(j);
                                    if(object.getInt("idAlbum") == 20){
                                        arrayCanzoni.add(new Canzone(object.getString("titoloCanzone"),object.getString("testoCanzone"),""));
                                    }
                                }
                            }
                        }catch (Exception e){
                            Log.e("TAG", "loadJson: error" + e);
                        }
                        break;
                }
                Intent intent = new Intent(mContext, CanzoniActivity.class);
                mContext.startActivity(intent.putExtra("arrayCanzoni",arrayCanzoni));
            });
        }
    }
}