package com.example.verdenalyrics;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AdapterCanosEp extends RecyclerView.Adapter<AdapterCanosEp.ViewHolder>
{
    Context context;
    LayoutInflater inflater;
    List<String> titles;
    List<String> testo;
    Intent intent;

    public AdapterCanosEp(Context paramContext, List<String> paramList) {
        this.titles = paramList;
        this.testo = testo;
        this.inflater = LayoutInflater.from(paramContext);
        this.context = paramContext;
    }

    public int getItemCount(){
        return this.titles.size();
    }

    public @NotNull ViewHolder onCreateViewHolder(@NotNull ViewGroup paramViewGroup, int paramInt)
    {
        View view = inflater.inflate(R.layout.layout_songs,paramViewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterCanosEp.ViewHolder holder, int position) {
        holder.title.setText(titles.get(position));
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        public ViewHolder(View paramView) {
            super(paramView);
            title = itemView.findViewById(R.id.textSong);
            paramView.setOnClickListener(paramAnonymousView -> {
                switch (getAdapterPosition()){
                    case 0:
                        intent = new Intent(context , CanzoneCanosActivity.class);
                        break;
                    case 1:
                    case 3:
                        intent = new Intent(context , CanzoniStrumentaliActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context , CanzoneOraBuiaActivity.class);
                        break;
                    case 4:
                        intent = new Intent(context , CanzoniHisLatestFlameActivity.class);
                        break;
                    case 5:
                        intent = new Intent(context , CanzoneFluidoActivity.class);
                        break;
                }
                context.startActivity(intent);
            });
        }
    }
}
