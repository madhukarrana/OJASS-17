package com.example.login.ojassloginsignup.Fragments;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.login.ojassloginsignup.R;
import com.example.login.ojassloginsignup.adapter.ScheduleAdapter;
import com.example.login.ojassloginsignup.model.ScheduleData;
import com.example.login.ojassloginsignup.model.ScheduleDataModel;

import java.util.ArrayList;

public class Day_three extends Fragment {

    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<ScheduleDataModel> data;



    public Day_three() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_day_three, container , false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_three);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());



        data = new ArrayList<ScheduleDataModel>();
       for (int i = 0; i < ScheduleData.event.length; i++) {
            data.add(new ScheduleDataModel(ScheduleData.event[i], ScheduleData.venue[i],
                    ScheduleData.time[i]));
        }

       // data.clear();
      //  data.add(new ScheduleDataModel("Event","Venue","Time"));


        adapter = new ScheduleAdapter(data,3,getContext());
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();




        return rootView;
    }

}
