package com.example.login.ojassloginsignup.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.login.ojassloginsignup.R;
import com.example.login.ojassloginsignup.model.ScheduleDataModel;

import java.util.ArrayList;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder> {

    private ArrayList<ScheduleDataModel> dataSet;
    Context context;
    private int flag;

    public static class ScheduleViewHolder extends RecyclerView.ViewHolder {

		TextView event, venue, time;
        TextView date;

        public ScheduleViewHolder(View itemView) {
            super(itemView);

            this.event = (TextView) itemView.findViewById(R.id.event_name);
            this.venue = (TextView) itemView.findViewById(R.id.venue);
            this.time = (TextView) itemView.findViewById(R.id.time);
            this.date = (TextView) itemView.findViewById(R.id.date);

        }
    }

    public ScheduleAdapter(ArrayList<ScheduleDataModel> data,int flag,Context context) {
        this.dataSet = data; this.flag=flag;this.context=context;
    }

    @Override
    public ScheduleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_cards_layout, parent, false);
    //    view.setOnClickListener(MainActivity.myOnClickListener);

        ScheduleViewHolder viewHolder = new ScheduleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ScheduleViewHolder holder, final int listPosition) {

        TextView event_tv = holder.event;
		TextView venue_tv = holder.venue;
		TextView time_tv = holder.time;
        TextView date_tv = holder.date;
		
        event_tv.setText(dataSet.get(listPosition).getEvent());
		venue_tv.setText(dataSet.get(listPosition).getVenue());
		time_tv.setText(dataSet.get(listPosition).getTime());
        if(flag==1)  date_tv.setText("March 24");
        else if(flag==2)date_tv.setText("March 25");
        else if(flag==3)date_tv.setText("March 26");






    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
