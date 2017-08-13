package com.example.login.ojassloginsignup.adapter;

import android.content.Context;
import android.content.Intent;

import com.example.login.ojassloginsignup.Activity.DevelopersActivity;
import com.example.login.ojassloginsignup.Activity.EventsActivity;
import com.example.login.ojassloginsignup.Activity.FAQActivity;
import com.example.login.ojassloginsignup.Activity.MapActivity;
import com.example.login.ojassloginsignup.Activity.ScheduleLayoutActivity;
import com.example.login.ojassloginsignup.Activity.SponsersActivity;
import com.example.login.ojassloginsignup.R;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.login.ojassloginsignup.Widgets.DrawerRow;

import java.util.Collections;
import java.util.List;


public class DrawerAdapter extends RecyclerView.Adapter<DrawerAdapter.MyViewHolder> {
    private LayoutInflater inflator;
    private List<DrawerRow> rowData = Collections.emptyList();
    private DrawerLayout drawerLayout;
    private Context context;

    public DrawerAdapter(DrawerLayout drawerLayout, Context context, List<DrawerRow> drawerData) {
        inflator = LayoutInflater.from(context);
        rowData = drawerData;
        this.drawerLayout = drawerLayout;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflator.inflate(R.layout.drawer_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int position) {

        DrawerRow current = rowData.get(position);
        viewHolder.title.setText(current.title);
        viewHolder.icon.setImageResource(current.iconId);
//        viewHolder.itemView.setTag(rowData.get(position).categoryId);
    }


    @Override
    public int getItemCount() {
        return rowData.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.listText);
            icon = (ImageView) itemView.findViewById(R.id.listIcon);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Intent drawerActivity = null;
            if (getAdapterPosition() == 0) {
            } else if (getAdapterPosition() == 1) {
                drawerActivity = new Intent(context, EventsActivity.class);
                context.startActivity(drawerActivity);
            }
            else if (getAdapterPosition()==2)
            {
                drawerActivity=new Intent(context, MapActivity.class);
                context.startActivity(drawerActivity);
            }
            else if (getAdapterPosition() == 3) {
                drawerActivity = new Intent(context, ScheduleLayoutActivity.class);
                context.startActivity(drawerActivity);
            } else if (getAdapterPosition() == 4) {
                drawerActivity = new Intent(context, SponsersActivity.class);
                context.startActivity(drawerActivity);
            } else if (getAdapterPosition() == 5) {
                drawerActivity = new Intent(context, FAQActivity.class);
                context.startActivity(drawerActivity);
            } else if (getAdapterPosition() == 6) {
                drawerActivity = new Intent(context, DevelopersActivity.class);
                context.startActivity(drawerActivity);
            }
            drawerLayout.closeDrawers();
        }
    }

}
