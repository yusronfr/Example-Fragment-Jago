package com.piyeyus.drawernavactivity.ui.grid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.piyeyus.drawernavactivity.R;
import com.piyeyus.drawernavactivity.adapter.GridAvatarAdapter;
import com.piyeyus.drawernavactivity.data.Avatar;
import com.piyeyus.drawernavactivity.data.AvatarData;

import java.util.ArrayList;

public class GridFragment extends Fragment {
    private RecyclerView rvGrid;
    private ArrayList<Avatar> list = new ArrayList<>();

    public GridFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_grid, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvGrid = view.findViewById(R.id.rv_grid);
        list.addAll(AvatarData.getListData());
        showDataGrid();
    }

    private void showDataGrid() {
        rvGrid.setLayoutManager(new LinearLayoutManager(getContext()));
        GridAvatarAdapter gridAvatarAdapter = new GridAvatarAdapter(list);
        rvGrid.setAdapter(gridAvatarAdapter);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
