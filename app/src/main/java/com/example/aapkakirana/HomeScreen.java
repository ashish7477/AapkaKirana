package com.example.aapkakirana;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeScreen extends Fragment {

//    private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

//        recyclerView.findViewById(R.id.category_rv);
//
//        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),3);
//
//        recyclerView.setLayoutManager(layoutManager);
//




        return inflater.inflate(R.layout.fragment_home_screen, container, false);
    }
}