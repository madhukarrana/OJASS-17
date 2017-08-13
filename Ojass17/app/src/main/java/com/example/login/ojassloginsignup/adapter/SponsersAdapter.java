package com.example.login.ojassloginsignup.adapter;

/**
 * Created by vivek singh on 1/22/2017.
 */


import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.login.ojassloginsignup.R;
import com.example.login.ojassloginsignup.model.SponserDemo;

public class SponsersAdapter extends BaseAdapter{
    ArrayList<SponserDemo> sponsers;
    Context c;
    public SponsersAdapter(Context c,ArrayList<SponserDemo> sponser) {
        // TODO Auto-generated constructor stub
        this.c=c;
        this.sponsers=sponser;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return sponsers.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return sponsers.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflator=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null)
        {
            convertView=inflator.inflate(R.layout.sponsers_model, parent, false);
        }
        ImageView imv=(ImageView) convertView.findViewById(R.id.sponserImage);
        imv.setImageResource(sponsers.get(position).getImg());
        return convertView;
    }

}
