package com.piyeyus.drawernavactivity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.piyeyus.drawernavactivity.R;
import com.piyeyus.drawernavactivity.data.Avatar;

import java.util.ArrayList;

public class CardViewAvatarAdapter extends RecyclerView.Adapter<CardViewAvatarAdapter.CardViewViewHolder> {
    private ArrayList<Avatar> listAvatar;
    public CardViewAvatarAdapter(ArrayList<Avatar> list) {
        this.listAvatar = list;
    }
    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview, viewGroup, false);
        return new CardViewViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        Avatar avatar = listAvatar.get(position);
        Glide.with(holder.itemView.getContext())
                .load(avatar.getPhoto())
                .into(holder.imgPhoto);
        holder.tvName.setText(avatar.getName());
        holder.tvDetail.setText(avatar.getDetail());
        holder.btnRencana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Rencana " +
                        listAvatar.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.btnSuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Suka " +
                        listAvatar.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Share " +
                        listAvatar.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Siap Memasak " + listAvatar.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAvatar.size();
    }
    static class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnSuka, btnShare, btnRencana;
        private CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnSuka = itemView.findViewById(R.id.btn_set_suka);
            btnShare = itemView.findViewById(R.id.btn_set_share);
            btnRencana = itemView.findViewById(R.id.btn_set_rencana);

        }
    }
}