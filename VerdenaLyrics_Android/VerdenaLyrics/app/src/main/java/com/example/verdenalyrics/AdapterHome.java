package com.example.verdenalyrics;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AdapterHome extends RecyclerView.Adapter<AdapterHome.ViewHolder> {
    Context context;
    List<String> titles;
    List<String> dates;
    List<Integer> images;
    LayoutInflater inflater;

    public AdapterHome(Context ctx, List<String> titles, List<Integer> images,List<String> dates){
        this.titles = titles;
        this.dates = dates;
        this.images = images;
        this.inflater = LayoutInflater.from(ctx);
        this.context = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_grid_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(titles.get(position));
        holder.gridIcon.setImageResource(images.get(position));
        holder.dates.setText(dates.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView dates;
        ImageView gridIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textName);
            gridIcon = itemView.findViewById(R.id.imageview);
            dates = itemView.findViewById(R.id.textdate);
            itemView.setOnClickListener(v -> {
                Intent intent;
                switch (getAdapterPosition()){
                    case 0:
                        intent = new Intent(context , VerdenaDemotapeActivity.class);
                        context.startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(context , ValvonautaEpActivity.class);
                        context.startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(context , VerdenaActivity.class);
                        context.startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(context , VibaEpActivity.class);
                        context.startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(context , SoloUnGrandeSassoActivity.class);
                        context.startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(context , SpacemanEpActivity.class);
                        context.startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(context , MiamiSafariEpActivity.class);
                        context.startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(context , ElefanteEpActivity.class);
                        context.startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(context , IlSuicidioDelSamuraiActivity.class);
                        context.startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(context , LunaEpActivity.class);
                        context.startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(context , RequiemActivity.class);
                        context.startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(context , CanosEpActivity.class);
                        context.startActivity(intent);
                        break;
                    case 12:
                        intent = new Intent(context , WowActivity.class);
                        context.startActivity(intent);
                        break;
                    case 13:
                        intent = new Intent(context , RadarActivity.class);
                        context.startActivity(intent);
                        break;
                    case 14:
                        intent = new Intent(context , Endkadenz1Activity.class);
                        context.startActivity(intent);
                        break;
                    case 15:
                        intent = new Intent(context , Endkadenz2Activity.class);
                        context.startActivity(intent);
                        break;
                    case 16:
                        intent = new Intent(context , Verdena20Activity.class);
                        context.startActivity(intent);
                        break;
                }
            });
        }
    }

}