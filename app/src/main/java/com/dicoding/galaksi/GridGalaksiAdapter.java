package com.dicoding.galaksi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridGalaksiAdapter extends RecyclerView.Adapter<GridGalaksiAdapter.GridViewHolder> {
    private ArrayList<Galaksi> listGalaksi;

    public GridGalaksiAdapter(ArrayList<Galaksi> list) {
        this.listGalaksi = list;
    }


    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_galaksi, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(listGalaksi.get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

    }

    @Override
    public int getItemCount() {
        return listGalaksi.size();
    }

     class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

         GridViewHolder(View itemView) {
             super(itemView);
             imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
