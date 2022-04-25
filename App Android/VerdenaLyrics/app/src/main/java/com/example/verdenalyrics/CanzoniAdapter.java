package com.example.verdenalyrics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class CanzoniAdapter extends RecyclerView.Adapter<CanzoniAdapter.MyViewCanzoniHolder>{

    ArrayList<Canzone> arrayCanzone;
    Context mContext;
    LayoutInflater inflater;

    public CanzoniAdapter(Context mContext,ArrayList<Canzone> arrayList) {
        this.arrayCanzone = arrayList;
        this.mContext = mContext;
        this.inflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public CanzoniAdapter.MyViewCanzoniHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewCanzoniHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.element_canzoni, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CanzoniAdapter.MyViewCanzoniHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.titolo.setText(arrayCanzone.get(position).getTitles());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(mContext,TestoActivity.class);
            intent.putExtra("testo",arrayCanzone.get(position).getTesto());
            intent.putExtra("titolo",arrayCanzone.get(position).getTitles());
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return arrayCanzone.size();
    }

    public static class MyViewCanzoniHolder extends RecyclerView.ViewHolder {
        private final TextView titolo;

        public MyViewCanzoniHolder(@NonNull View itemView) {
            super(itemView);
            this.titolo = itemView.findViewById(R.id.textSong);
        }
    }
}