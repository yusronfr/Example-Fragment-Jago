package com.piyeyus.drawernavactivity.ui.cardview;

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
import com.piyeyus.drawernavactivity.adapter.CardViewAvatarAdapter;
import com.piyeyus.drawernavactivity.data.Avatar;
import com.piyeyus.drawernavactivity.data.AvatarData;

import java.util.ArrayList;

public class CardViewFragment extends Fragment {
    private RecyclerView rvCardview;
    private ArrayList<Avatar> list = new ArrayList<>();

    public CardViewFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_cardview, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvCardview = view.findViewById(R.id.rv_cardview);
        list.addAll(AvatarData.getListData());
        showDataCardview();
    }

    private void showDataCardview() {
        rvCardview.setLayoutManager(new LinearLayoutManager(getContext()));
        CardViewAvatarAdapter cardViewAvatarAdapter = new CardViewAvatarAdapter(list);
        rvCardview.setAdapter(cardViewAvatarAdapter);
    }

}
