package com.piyeyus.drawernavactivity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.piyeyus.drawernavactivity.R;
import com.piyeyus.drawernavactivity.data.Avatar;

import java.util.ArrayList;

public class GridAvatarAdapter extends RecyclerView.Adapter<GridAvatarAdapter.GridViewHolder> {
    private ArrayList<Avatar> listAvatar;
    public GridAvatarAdapter(ArrayList<Avatar> list) {
        this.listAvatar = list;
    }
    private OnItemClickCallback onItemClickCallback;

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid, viewGroup, false);
        return new GridViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final GridAvatarAdapter.GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(listAvatar.get(position).getPhoto())
                .into(holder.imgPhoto);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listAvatar.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAvatar.size();
    }

    static class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        private GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Avatar data);
    }
}
