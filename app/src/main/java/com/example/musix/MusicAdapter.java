package com.example.musix;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;
import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MyViewHolder> {

    private Context mContext;
    static ArrayList<MusicFiles> mFiles;

    MusicAdapter(Context mContext, ArrayList<MusicFiles> mFiles){
        this.mFiles = mFiles;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.music_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.file_name.setText(mFiles.get(position).getTitle());
        byte[] image = getAlbumArt(mFiles.get(position).getPath());
        if (image != null){
            Glide.with(mContext).asBitmap().load(image).into(holder.album_art);
        } else {
            Glide.with(mContext).asBitmap().load(R.drawable.default_image).into(holder.album_art);
        }

        // Correzione 1: Usa getAdapterPosition() invece di position fisso
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition = holder.getAdapterPosition();
                if (currentPosition != RecyclerView.NO_POSITION) {
                    Intent intent = new Intent(mContext, PlayerActivity.class);
                    intent.putExtra("position", currentPosition);
                    mContext.startActivity(intent);
                }
            }
        });

        // Correzione 2: Usa getAdapterPosition() per il menu popup
        holder.menuMore.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onClick(final View v) {
                int currentPosition = holder.getAdapterPosition();
                if (currentPosition != RecyclerView.NO_POSITION) {
                    PopupMenu popupMenu = new PopupMenu(mContext, v);
                    popupMenu.getMenuInflater().inflate(R.menu.popup, popupMenu.getMenu());
                    popupMenu.show();
                    popupMenu.setOnMenuItemClickListener(item -> {
                        // Correzione 3: Usa if-else invece di switch per evitare "Constant expression required"
                        int itemId = item.getItemId();
                        if (itemId == R.id.delete) {
                            Toast.makeText(mContext, "Canzone Eliminata!", Toast.LENGTH_SHORT).show();
                            deleteFile(currentPosition, v);
                        }
                        return true;
                    });
                }
            }
        });
    }

    private void deleteFile(int position, View v){
        try {
            Uri contentUri = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                    Long.parseLong(mFiles.get(position).getId()));
            File file = new File(mFiles.get(position).getPath());
            boolean deleted = file.delete();

            if (deleted) {
                mContext.getContentResolver().delete(contentUri, null, null);
                mFiles.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, mFiles.size());
                Snackbar.make(v, "File eliminato", Snackbar.LENGTH_SHORT).show();
            } else {
                // File potrebbe essere su SD card o non accessibile
                Snackbar.make(v, "File non eliminato", Snackbar.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            Snackbar.make(v, "Errore durante l'eliminazione", Snackbar.LENGTH_SHORT).show();
        }
    }

    @Override
    public int getItemCount() {
        return mFiles.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView file_name;
        ImageView album_art, menuMore;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            file_name = itemView.findViewById(R.id.music_file_name);
            album_art = itemView.findViewById(R.id.music_img);
            menuMore = itemView.findViewById(R.id.menuMore);
        }
    }

    private byte[] getAlbumArt(String uri){
        MediaMetadataRetriever retriever = new MediaMetadataRetriever();
        try {
            retriever.setDataSource(uri);
            byte[] art = retriever.getEmbeddedPicture();
            return art;
        } catch (Exception e) {
            return null;
        } finally {
            try {
                retriever.release();
            } catch (Exception e) {
                // Ignora errori durante il rilascio
            }
        }
    }

    void updateList(ArrayList<MusicFiles> musicFilesArrayList){
        mFiles = new ArrayList<>();
        mFiles.addAll(musicFilesArrayList);
        notifyDataSetChanged();
    }
}