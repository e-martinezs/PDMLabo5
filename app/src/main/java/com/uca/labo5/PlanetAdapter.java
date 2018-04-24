package com.uca.labo5;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uca on 04-16-18.
 */

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>{

    private Context mContext;
    private List<Planet> list = new ArrayList<>();
    private boolean favorite;
    private ViewPagerAdapter vpa;

    public PlanetAdapter(Context mContext, ViewPagerAdapter vpa, boolean favorite){
        this.mContext = mContext;
        this.favorite = favorite;
        this.vpa = vpa;

        if (favorite){
            for (Planet p:MainActivity.list){
                if (p.isFavorite()) {
                    list.add(p);
                }
            }
        }
        else{
            for (Planet p:MainActivity.list){
                list.add(p);
            }
        }
    }

    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.activity_cardview, parent, false);
        return new PlanetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final PlanetViewHolder holder, int position) {
        holder.favoriteCheckBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Planet p = list.get(holder.getAdapterPosition());
                if (holder.favoriteCheckBox.isChecked()) {
                    p.setFavorite(true);
                    vpa.notifyDataSetChanged();
                }else{
                    p.setFavorite(false);
                    vpa.notifyDataSetChanged();
                }
            }
        });
        holder.nameTextView.setText(list.get(position).getName());
        holder.descriptionTextView.setText(list.get(position).getDescription());
        holder.imgImageView.setImageResource(list.get(position).getImageID());
        if (list.get(position).isFavorite()){
            holder.favoriteCheckBox.setChecked(true);
        }else{
            holder.favoriteCheckBox.setChecked(false);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder{
        TextView nameTextView;
        TextView descriptionTextView;
        ImageView imgImageView;
        CheckBox favoriteCheckBox;

        public PlanetViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            imgImageView = itemView.findViewById(R.id.imgImageView);
            favoriteCheckBox = itemView.findViewById(R.id.favoriteCheckBox);
        }
    }
}
