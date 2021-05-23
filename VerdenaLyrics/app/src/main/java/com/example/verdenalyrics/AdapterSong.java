package com.example.verdenalyrics;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AdapterSong extends RecyclerView.Adapter<AdapterSong.ViewHolder>
{
    Context context;
    LayoutInflater inflater;
    List<String> titles;

    public AdapterSong(Context paramContext, List<String> paramList)
    {
        this.titles = paramList;
        this.inflater = LayoutInflater.from(paramContext);
        this.context = paramContext;
    }

    public int getItemCount(){
        return this.titles.size();
    }

    public ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
    {
        View view = inflater.inflate(R.layout.layout_songs,paramViewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterSong.ViewHolder holder, int position) {
        holder.title.setText(titles.get(position));
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        public ViewHolder(View paramView) {
            super(paramView);
            title = itemView.findViewById(R.id.textSong);
            paramView.setOnClickListener(new View.OnClickListener(){
                public void onClick(View paramAnonymousView){

                }
            });
        }
    }
}
