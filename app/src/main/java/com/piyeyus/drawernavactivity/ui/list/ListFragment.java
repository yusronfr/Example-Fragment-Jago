package com.piyeyus.drawernavactivity.ui.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.piyeyus.drawernavactivity.R;

public class ListFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_list, container, false);
        final TextView textView = root.findViewById(R.id.text_list);
        return root;
    }
}
