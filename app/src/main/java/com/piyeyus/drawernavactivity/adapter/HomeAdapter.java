package com.piyeyus.drawernavactivity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.piyeyus.drawernavactivity.R;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {

        private final List<String> mItems;

        public HomeAdapter(final List<String> items) {
            mItems = items;
        }

        @Override
        public HomeHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
            final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
            return new HomeHolder(view);
        }

        @Override
        public void onBindViewHolder(final HomeHolder holder, final int position) {
            final String item = mItems.get(position);
            holder.getTextView().setText(item);
        }

        @Override
        public int getItemCount() {
            return mItems.size();
        }

        class HomeHolder extends RecyclerView.ViewHolder {
            private final TextView mTextView;

            public HomeHolder(final View itemView) {
                super(itemView);
                mTextView = (TextView) itemView.findViewById(R.id.tv_item_name);
            }

            public TextView getTextView() {
                return mTextView;
            }
        }
    }