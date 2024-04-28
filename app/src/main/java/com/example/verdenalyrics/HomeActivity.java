package com.example.verdenalyrics;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import com.example.verdenalyrics.adapter.AlbumAdapter;
import com.example.verdenalyrics.classi.Album;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ArrayList<Album> canzoniArrayList = new ArrayList<>();
    int[] copertine = {R.drawable.verbena,R.drawable.verdenademotape,R.drawable.valvonautaep,R.drawable.verdena,R.drawable.vibaep,R.drawable.soloungrandesasso,R.drawable.spacemanep,R.drawable.miamisafariep,R.drawable.afterhoursversusverdena,R.drawable.elefanteep,R.drawable.ilsuicidiodeisamurai,R.drawable.lunaep,R.drawable.requiem,R.drawable.canosep,R.drawable.wow,R.drawable.radar,R.drawable.endkadenz1,R.drawable.endkadenz2,R.drawable.verdena20,R.drawable.americalatina,R.drawable.volevomagia};

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewAlbum);
        JSONArray jsonArray = loadJson();
        try {
            // fetch each json object
            for (int i = 0; i < (jsonArray != null ? jsonArray.length() : 0); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                canzoniArrayList.add(new Album(jsonObject.getString("nomeAlbum"),jsonObject.getString("dataAlbum"),jsonObject.getString("tipoAlbum"),copertine[i]));
            }
        }catch (Exception e){
            Log.e("TAG", "loadJson: error" + e);
        }
        AlbumAdapter adapter = new AlbumAdapter(this,canzoniArrayList,jsonArray);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3, RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private JSONArray loadJson(){
        try {
            // file name  should as in assets folder with .json extension
            // load json
            InputStream inputStream= getAssets().open("data.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            // fetch json file
            String json = new String(buffer, StandardCharsets.UTF_8);
            return new JSONArray(json);
        }catch (Exception e){
            Log.e("TAG", "loadJson: error" + e);
        }
        return null;
    }
}