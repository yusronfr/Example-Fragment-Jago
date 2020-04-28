package com.piyeyus.drawernavactivity.ui.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.piyeyus.drawernavactivity.R;
import com.piyeyus.drawernavactivity.adapter.ListAvatarAdapter;
import com.piyeyus.drawernavactivity.data.Avatar;
import com.piyeyus.drawernavactivity.data.AvatarData;

import java.util.ArrayList;

public class ListFragment extends Fragment {
    private RecyclerView rvList;

    private ArrayList<Avatar> list = new ArrayList<>();

    public ListFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvList = view.findViewById(R.id.rv_list);
        list.addAll(AvatarData.getListData());
        showDataList();
    }

    private void showDataList() {
        rvList.setLayoutManager(new LinearLayoutManager(getContext()));
        ListAvatarAdapter listAvatarAdapter = new ListAvatarAdapter(list);
        rvList.setAdapter(listAvatarAdapter);

        listAvatarAdapter.setOnItemClickCallback(new ListAvatarAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Avatar avatar) {
                Toast.makeText(getContext(), "Kamu memilih " + avatar.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
